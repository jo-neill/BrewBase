package hello;

public class Registration {
    
    private String username, password, passwordConfirm, email;
  
    public String getUsername (){
        return username;
    }
    
    public String getPassword (){
        return password;
    }
    
    public String getEmail (){
        return email;
    }
    
    public void setUsername (String username){
        this.username = username;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getPasswordConfirm (){
        return passwordConfirm;
    }
    
    public void setPasswordConfirm (String passwordConfirm){
        this.passwordConfirm = passwordConfirm;
    }
    
}
