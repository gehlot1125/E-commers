
package ConnectionDb;
import java.sql.*;

public class ConnectionDb {
    Connection con=null;
   public Connection  ConnectionData(String db){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          String url ="jdbc:mysql://localhost:3306/"+db;
          con = DriverManager.getConnection(url,"root","mitali123");
          //System.out.print("conecction success="+con);
      }catch(Exception e){
          System.out.println("connection  Error==="+e);
      }
            return con;
    }
}
