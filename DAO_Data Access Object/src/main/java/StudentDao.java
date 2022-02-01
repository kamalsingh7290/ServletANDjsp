import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDao 
{
	public abstract ArrayList<StudentBean> getAllStudent()
			throws SQLException, ClassNotFoundException;	
}
