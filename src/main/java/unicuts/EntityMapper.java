package unicuts;

public abstract class EntityMapper <E, I, O> {
    
    public abstract O wrap(E entity);
    public abstract E unwrap(I entity);
    
}
