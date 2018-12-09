package Hospital;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

class DB_connection {
    public static Connection connect(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
        } catch (Exception e){
            System.err.println(e);
        }
        
        return conn;
    }
}
