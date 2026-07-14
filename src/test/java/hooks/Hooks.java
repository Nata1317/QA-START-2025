package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterSuite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hooks {
    public static Connection connection;

    @Before
    public void before() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
                "root", "password");
    }

    @After
    public void after() throws Exception {
        if (connection != null) {
            connection.close();
        }

    }
}
