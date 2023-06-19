-- Gestores
INSERT INTO gestor (id, email, senha, nome) VALUES (1, 'tcpassos@unicuts.com', 'Batata@123', 'Tiago Passos');
INSERT INTO gestor (id, email, senha, nome) VALUES (2, 'veiga@unicuts.com', 'Batata@123', 'Leonardo Veiga');
INSERT INTO gestor (id, email, senha, nome) VALUES (3, 'pelinson@unicuts.com', 'Batata@123', 'Pelinson');
INSERT INTO gestor (id, email, senha, nome) VALUES (4, 'lucas@unicuts.com', 'Batata@123', 'Lucas');

-- Estabelecimentos 
INSERT INTO estabelecimento (nome, gestor_id, media_avaliacao) VALUES ('Cabecas Feitas', 1, 4.5);
INSERT INTO estabelecimento (nome, gestor_id, media_avaliacao) VALUES ('Corte Rápido', 2, 4.0);
INSERT INTO estabelecimento (nome, gestor_id, media_avaliacao) VALUES ('Barbearia do Calvo', 3, 3.0);
INSERT INTO estabelecimento (nome, gestor_id, media_avaliacao) VALUES ('Leila Cabeleleila', 4, 2.5);

-- Horarios de atendimento
INSERT INTO horario (id, inicio, fim) VALUES (1, TIME '06:00', TIME '18:00');
INSERT INTO horariofuncionamento (estabelecimento_id, horario_id) VALUES (1, 1);

-- Servicos
INSERT INTO servico (id, descricao) VALUES (1, 'Corte masculino');
INSERT INTO servico (id, descricao) VALUES (2, 'Corte infantil');

-- Servicos prestados
INSERT INTO servicoprestado (estabelecimento_id, servico_id, valor) VALUES (1, 1, 20.0);
INSERT INTO servicoprestado (estabelecimento_id, servico_id, valor) VALUES (1, 2, 15.0);