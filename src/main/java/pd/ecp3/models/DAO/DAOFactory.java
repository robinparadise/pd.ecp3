package pd.ecp3.models.DAO;

public abstract class DAOFactory{
	
	private static DAOFactory daoFactory;
	
	public static void setInstance(DAOFactory d){
		daoFactory = d;
	}
	
	public static DAOFactory getInstance(){
		return daoFactory;		
	}
	
	public abstract UserDAO getUserDAO();
	public abstract RoundDAO getRoundDAO();
	
}
