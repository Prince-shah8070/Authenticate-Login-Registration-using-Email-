package prince.signupPage;

import java.io.Serializable;

public class signupBean implements Serializable{
  private String name;
  private String Email;
  private String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
  
    
}
