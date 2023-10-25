package ProductControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import AdminDAO.Admindao;
import AdminDAO.Product_Cate;
import ConnectionDb.ConnectionDb;
import DAO.UserDAO;
import AdminDAO.product_Dis;
import AdminDAO.product_Name;
import AdminDAO.product_Inv;
import DAO.UserInfo;
import java.util.ArrayList;
import java.util.List;

public class ProductControl {


    ConnectionDb con =new ConnectionDb();
    String db ="java5";
    private String productcate="product_category";
    private String productdiscount="product_discount";
    private String productname = "product_name";
    private String productinventory = "product_inventory";
 
    public boolean ProductCate(Product_Cate pcate) {
        // UserDAO dao = new UserDAO();
    
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ productcate+"(pro_cate_name, pro_cate_desc) values(?,?)");
               ps.setString(1, pcate.getProCateName());
               ps.setString(2, pcate.getProCateDesc());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
    public  List ProductCateShow() {
        List<String> list = new ArrayList<>();
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+productcate);
                 
             /*while(rs.next()) {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println();
       }   */
             while(rs.next()){
                 list.add(rs.getString(1));
                 list.add(rs.getString(2));
                 list.add(rs.getString(3));
             }
             
    	
			
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.print(e);
                    System.out.println(""+e);
		}
        return list;
    }
    
    public boolean ProductCateUpdate(Product_Cate pcate) {
        // UserDAO dao = new UserDAO();
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select pro_cate_name, pro_cate_desc from "+productcate +" where  category_id = "+pcate.getProCateId());
             while(rs.next()) {
             
            	 if(pcate.getProCateName().equals("")) {
            		 pcate.setName(rs.getString(1));
            		 
            	 }
            	 if(pcate.getProCateDesc().equals("")) {
            		 pcate.setDesc(rs.getString(2));
            	 }
            	 System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             //System.out.print(rs.getString(3));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ productcate+" set pro_cate_name =?, pro_cate_desc=? where category_id=? ");
               ps.setString(1, pcate.getProCateName());
               ps.setString(2, pcate.getProCateDesc());
               ps.setInt(3, pcate.getProCateId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
     public boolean  ProductCateDelete(int id) {
    	try {

        	Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 int i = stmt.executeUpdate("delete from "+ productcate +" where category_id= "+id);
        	
        	 if(i==1) {
        		 return true;
        	 }
        		
		} catch (Exception e) {
			
			 System.out.print("=="+e);
		       	// TODO: handle exception
		}
    	return false;
    }
    
    public boolean ProductName(Admindao admindao) {
        // UserDAO dao = new UserDAO();
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+productcate+"(name,email,pass) values(?,?,?)");
               ps.setString(1, admindao.getPName());
               ps.setInt(2, admindao.getPRate());
               ps.setInt(3, admindao.getPQty());
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
    public boolean productdis(product_Dis pdis) {
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ productdiscount+"(name, prod_disc_desc,discount_percent,active) values(?,?,?,?)");
               ps.setString(1, pdis.getName());
               ps.setString(2, pdis.getProDiscDesc());
               ps.setInt(3, pdis.getDiscountper());
               ps.setString(4, pdis.getActive());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    public  void productdisShow() {
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+productdiscount);
            while(rs.next()) {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println(rs.getString(4));
             System.out.println(rs.getString(5));
             System.out.println();
            }		
	}
        catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
	}
    }
    public boolean productdisUpdate(product_Dis pdis) {
        // UserDAO dao = new UserDAO();
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select *from "+productdiscount +" where  discount_id = "+pdis.getId());
             while(rs.next()) {
             
            	 if(pdis.getName().equals("")) {
            		 pdis.setName(rs.getString(1));
            		 
            	 }
            	 if(pdis.getProDiscDesc().equals("")) {
            		 pdis.setDesc(rs.getString(2));
            	 }
            	 System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ productdiscount+" set name =?, prod_disc_desc=? where discount_id=? ");
               ps.setString(1, pdis.getName());
               ps.setString(2, pdis.getProDiscDesc());
               ps.setInt(3, pdis.getId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
     public boolean  productdisDelete(int id) {
    	try {

        	Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 int i = stmt.executeUpdate("delete from "+ productdiscount +" where discount_id= "+id);
        	
        	 if(i==1) {
        		 return true;
        	 }
        		
		} catch (Exception e) {
			
			 System.out.print("=="+e);
		       	// TODO: handle exception
		}
    	return false;
    }
    
    public boolean productname(product_Name pname) {
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ productname+"(product_name, product_desc,SKU,category_id,price,discount_id) values(?,?,?,?,?,?)");
               ps.setString(1, pname.getName());
               ps.setString(2, pname.getProdDesc());
               ps.setString(3, pname.getProdSku());
               ps.setInt(4, pname.getProdCat());
               ps.setInt(5, pname.getProdPrice());
               ps.setInt(6, pname.getProdDisc());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    public  void productnameShow() {
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+productname);
            while(rs.next()) {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println(rs.getString(4));
             System.out.println(rs.getString(5));
             System.out.println(rs.getString(6));
             System.out.println(rs.getString(7));
             System.out.println();
            }		
	}
        catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
	}
    }
    public boolean productnameUpdate(product_Name pname) {
        // UserDAO dao = new UserDAO();
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select *from "+productname +" where  product_id = "+pname.getId());
             while(rs.next()) {
             
            	 if(pname.getName().equals("")) {
            		 pname.setName(rs.getString(1));
            		 
            	 }
            	 if(pname.getProdDesc().equals("")) {
            		 pname.setDesc(rs.getString(2));
            	 }
            	 System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ productname+" set product_name =?, product_desc=? where product_id=? ");
               ps.setString(1, pname.getName());
               ps.setString(2, pname.getProdDesc());
               ps.setInt(3, pname.getId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
     public boolean productnameDelete(int id) {
    	try {

        	Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 int i = stmt.executeUpdate("delete from "+ productname +" where product_id= "+id);
        	
        	 if(i==1) {
        		 return true;
        	 }
        		
		} catch (Exception e) {
			
			 System.out.print("=="+e);
		       	// TODO: handle exception
		}
    	return false;
    }
    
    public boolean productinventory(product_Inv pinv) {
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ productinventory+"(product_id, quantity) values(?,?)");
               ps.setInt(1, pinv.getProdId());
               ps.setInt(2, pinv.getProdQity());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    public  void productinventoryShow() {
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+productinventory);
            while(rs.next()) {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println();
            }		
	}
        catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
	}
    }
    public boolean productinventoryUpdate(product_Inv pinv) {
        // UserDAO dao = new UserDAO();
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select *from "+productinventory +" where  inventory_id = "+pinv.getId());
             while(rs.next()) {
                 
            	 if(pinv.getProdQity() == 0) {
            		 pinv.setProdQity(rs.getInt(1));
            	 }
             System.out.print(rs.getInt(2));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ productinventory+" set quantity=? where inventory_id=? ");
               ps.setInt(1, pinv.getProdQity());
               ps.setInt(2, pinv.getId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
    
     public boolean productinventoryDelete(int id) {
    	try {

        	Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 int i = stmt.executeUpdate("delete from "+ productinventory +" where inventory_id= "+id);
        	
        	 if(i==1) {
        		 return true;
        	 }
        		
		} catch (Exception e) {
			
			 System.out.print("=="+e);
		       	// TODO: handle exception
		}
    	return false;
    }
     public boolean userinfo(UserInfo pcate) {
        
    
        try {
               PreparedStatement ps =con.ConnectionData(db).prepareStatement("insert into "+ userinfo+"(first_name, last_name,telephone) values(?,?,?)");
               ps.setString(1, pcate.getFirstName());
               ps.setString(2, pcate.getLastName());
               ps.setString(3, pcate.getTelephone());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
     public boolean UserInfoUpdate(UserInfo pcate) {
    
        try {
        	Connection com = con.ConnectionData(db);
        	
        	Statement stmt =com.createStatement();
        	ResultSet rs = stmt.executeQuery("select first_name,last_name,telephone from "+userinfo +" where  user_id = "+pcate.getUserId());
             while(rs.next()) {
             
            	 if(pcate.getFirstName().equals("")) {
            		 pcate.setFirstName(rs.getString(1));
            		 
            	 }
            	 if(pcate.getLastName().equals("")) {
            		 pcate.setLastName(rs.getString(2));
            	 }
                  if(pcate.getTelephone().equals("")) {
            		 pcate.setTelephone(rs.getString(3));
            	 }
            	 System.out.print(rs.getString(1));
             System.out.print(rs.getString(2));
             System.out.print(rs.getString(3));
             System.out.println();
             }
             
             
               PreparedStatement ps =com.prepareStatement("update "+ userinfo+" set first_name =?, last_name=?,telephone=? where user_id=? ");
               ps.setString(1, pcate.getFirstName());
               ps.setString(2, pcate.getLastName());
               ps.setString(3, pcate.getTelephone());
               ps.setInt(4, pcate.getUserId());
             
               int i = ps.executeUpdate();
               if(i==1){
                     return true;
                }
             } catch (Exception e) {
            System.out.println(""+e);
        }
        
        return false;
    }
      public  List UserInfoShow() {
        List<String> list = new ArrayList<>();
    	try {
    		Connection com = con.ConnectionData(db);
        	Statement stmt =com.createStatement();
        	 ResultSet rs = stmt.executeQuery("select *from "+userinfo);
                 
             /*while(rs.next()) {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println();
       }   */
             while(rs.next()){
                 
                 list.add(rs.getString(1));
                 list.add(rs.getString(2));
                 list.add(rs.getString(3));
                 
             }
             
    	
			
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.print(e);
		}
        return list;
    }
}
