public class PasswordManager {
    private String password;

    public void  setPassword(String password){
        this.password="HASHED_" +password;

    }
      public void getPassword(){

      }
    public static void main(String[] args) {
        PasswordManager manager=new PasswordManager();
        manager.setPassword("myp@ss1233");
    }}
