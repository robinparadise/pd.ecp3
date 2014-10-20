package pd.ecp3.models.DAO.mem;

import pd.ecp3.models.DAO.DAOFactory;
import pd.ecp3.models.DAO.RoundDAO;
import pd.ecp3.models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

	@Override
	public UserDAO getUserDAO() {
		return null;
	}

	@Override
	public RoundDAO getRoundDAO() {
		return null;
	}

}
