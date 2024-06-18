package prince.Connection;
import java.sql.*;
import java.sql.Connection;

public class connection{
    private static Connection con=null;
    public static Connection getCon()
    {
        try{ 
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "root");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}



