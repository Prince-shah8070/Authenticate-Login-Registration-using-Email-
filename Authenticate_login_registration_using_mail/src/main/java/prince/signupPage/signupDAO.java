//DATA ACCESS OBJECT class have the jdbc code
package prince.signupPage;

import prince.Connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class signupDAO {
    
    public boolean validate(signupBean bean) throws ClassNotFoundException
    {
        boolean status = false;
       try {
            Connection con=connection.getCon();
            PreparedStatement psmt = con.prepareStatement("select * from details where Email = ?");
            psmt.setString(1, bean.getEmail());
//            psmt.setString(2, bean.getPassword());
            ResultSet rs=psmt.executeQuery();
            status = rs.next();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return status;
    }
   
    public boolean insert(signupBean bean)
    {    
        try {
            Connection con=connection.getCon();
            PreparedStatement psmt = con.prepareStatement("insert into details(Name,Email,Password) values(?,?,?)");
            psmt.setString(1, bean.getName());
            psmt.setString(2, bean.getEmail());
            psmt.setString(3, bean.getPassword());
            psmt.execute();
            con.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}


