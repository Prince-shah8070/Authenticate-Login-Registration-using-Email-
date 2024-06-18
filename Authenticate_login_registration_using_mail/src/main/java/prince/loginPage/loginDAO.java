package prince.loginPage;

//import Encrypt_decrypt_password.protect;
import Encrypt_decrypt_password.protect;
import prince.Connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDAO {
        protect p=new protect();
                  
        public boolean authenticate(loginBean bean) throws ClassNotFoundException
    {
        String Password=null;
        boolean status=false;
        try
        {
            Connection con = connection.getCon();
            //will take the encrypt password from the given email to decrypt after
            PreparedStatement psmt = con.prepareStatement("Select Password from details where Email = ?");
            psmt.setString(1, bean.getEmail());
            ResultSet rs= psmt.executeQuery();
            String password=null;
            while (rs.next()) {
                password = rs.getString("Password");
            }
            Password = p.decrypt(password);
//            System.out.println("Password after decryption: "+Password);
//            System.out.println("User input pass:: "+bean.getPassword());
            
            //if the input password is equal to the decrypt password then the status is true
            if(Password.equals(bean.getPassword()))
            {
                status=true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(status);
        return status;
    }
}

