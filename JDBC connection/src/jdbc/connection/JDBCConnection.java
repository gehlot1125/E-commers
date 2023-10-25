
package jdbc.connection;
import java.sql.*;

public class JDBCConnection {


  

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/db5";
           
            Connection con = DriverManager.getConnection(url,"root","mitali123");
            System.out.println(""+con);
           
            
            Statement st = con.createStatement();
            st.executeUpdate("create table emp1(id int ,name char(20)");
           
PreparedStatement ps =con.prepareStatement("insert into emp values(?,?)");
ps.setInt(1, 1);
ps.setString(2, "hanu");
ps.executeUpdate();


 ResultSet rs = st.executeQuery("Show tables");
            while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
      }
            
        } catch (Exception e) {
             System.out.println(""+e);
        }
    }
    
}
