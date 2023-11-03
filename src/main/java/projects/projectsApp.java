package projects;
import projects.dao.DbConnection;
public class projectsApp {
	
	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}
