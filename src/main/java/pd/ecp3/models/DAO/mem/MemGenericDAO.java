package pd.ecp3.models.DAO.mem;

import java.util.HashMap;
import java.util.Map;

public abstract class MemGenericDAO <T,ID> {
	
	Map<T,ID> lista = new HashMap<>();
	
	public abstract void create( T entity);
	
	public abstract T read(ID id);
	
	public abstract void update(T entity);
	
	public abstract void delete(T entity);
	
	public abstract void deleteByID(ID id);
	
	public abstract void findAll(ID id);
	
	public abstract void findAll(int index, int size);

}
