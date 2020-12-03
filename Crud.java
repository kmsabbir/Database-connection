
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud {
    
    public static Connection provideConnection(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
                    } catch (Exception e) {
                        System.out.println(e);
                        return null;
        }
    
    }
    public static void main(String[] args) {
        if(provideConnection() != null){
            System.out.println("Connected succesfuly");
        }else{
            System.out.println("Sorry!");
        }
   
    }
}
