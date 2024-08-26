package employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conn {

    Connection connection;
    Statement statement;

    public conn(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");//optional
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","mysql@123");
            statement=connection.createStatement();
          
        

        }catch(Exception e){
            e.printStackTrace();
        }

    }//public static void main(String[] args) {
       // new conn(); // This will test the connection
    //}
    
}
