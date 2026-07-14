package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.sql.Connection;
import org.prog.session14.DBConnectionFactory;



public class Hooks {
    public static Connection connection;

    @Before
    public void before() throws Exception {
        connection = DBConnectionFactory.getConnection();
    }


    @After
    public void after() throws Exception {
        if (connection != null) {
            connection.close();
        }

    }
}
