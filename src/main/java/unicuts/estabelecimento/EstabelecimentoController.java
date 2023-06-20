package unicuts.estabelecimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import unicuts.horario.Horario;
import unicuts.horariofuncionamento.HorarioFuncionamento;
import unicuts.horariofuncionamento.HorarioFuncionamentoRepository;
import unicuts.servicoprestado.ServicoPrestadoMapper;
import unicuts.servicoprestado.ServicoPrestadoOutput;
import unicuts.servicoprestado.ServicoPrestadoRepository;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;
    @Autowired
    EstabelecimentoMapper estabelecimentoMapper;
    @Autowired
    ServicoPrestadoRepository servicoPrestadoRepository;
    @Autowired
    HorarioFuncionamentoRepository horarioFuncionamentoRepository;
    @Autowired
    ServicoPrestadoMapper servicoPrestadoMapper;

    @GetMapping("/all")
    public List<EstabelecimentoOutput> getAll(@RequestParam(required = false) Double avaliacaoMinima, @RequestParam(required = false) List<Long> servico) {
        List<Estabelecimento> estabelecimentos = Objects.nonNull(avaliacaoMinima) ? estabelecimentoRepository.findByMediaAvaliacaoGreaterThanEqual(avaliacaoMinima)
                                                                                  : estabelecimentoRepository.findAll();
        return estabelecimentos.stream()
                               .filter(estabelecimento -> CollectionUtils.isEmpty(servico) ||
                                                          CollectionUtils.containsAny(servico, estabelecimento.getServicosPrestados().stream().map(servicoPrestado -> servicoPrestado.getServico().getId()).toList()))
                               .map(estabelecimento -> estabelecimentoMapper.wrap(estabelecimento))
                               .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estabelecimento> getById(@PathVariable Long id) {
        return estabelecimentoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/{id}/servicos")
    public List<ServicoPrestadoOutput> getServicosPrestados(@PathVariable Long id) {
        return servicoPrestadoRepository.findAllByEstabelecimento_Id(id)
                                        .stream()
                                        .map(servicoPrestado -> servicoPrestadoMapper.wrap(servicoPrestado))
                                        .collect(Collectors.toList());
    }
    
    @GetMapping("/{id}/horario")
    public List<Horario> getHorarioFuncionamento(@PathVariable Long id) {
        return horarioFuncionamentoRepository.findAllByEstabelecimento_Id(id)
                                             .stream()
                                             .map(HorarioFuncionamento::getHorario)
                                             .collect(Collectors.toList());
    }

}
