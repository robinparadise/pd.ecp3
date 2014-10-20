package pd.ecp3.models.DAO;

public abstract interface GenericDAO <T, ID> {
	
	public abstract void create( T entity);
	public abstract T read(ID id);
	public abstract void update(T entity);
	public abstract void delete(T entity);
	public abstract void deleteByID(ID id);
	public abstract void findAll(ID id);
	public abstract void findAll(int index, int size);
	
}
