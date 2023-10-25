/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerFolder;


import ConnectionDb.ConnectionDb;
import DAO.UserInfo;
import ProductControl.ProductControl;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adimi
 */
public class CustomerShow {
    ConnectionDb con =new ConnectionDb();
    String db ="java5";
    public CustomerShow(){
        Scanner sc=new Scanner(System.in);
        ProductControl pc =new ProductControl();
        while(true) {
        System.out.println("0 for user info \n 1 for show product name \n 2 for prouct discount \n 3 for product category \n 4 for enter user adress \n 5 for update user adress ");
        System.out.println("6 for delete user adress \n 7 for card items \n 8 for shopping session");
        System.out.println("9 for order details \n 10 for order items \n 11 for payment details \n 12 for user payment \n 13 update user info");
         int ch = sc.nextInt();
         if(ch==0){
              System.out.println("enter first name, last name, telephone");
              String p = sc.next();
		String d=sc.next();
                String v=sc.next();
		UserInfo pcate = new UserInfo(0,p,d,v,"");
		
		if(pc.userinfo(pcate))
		{
			System.out.println("user details inserted ");
			
			}
         }
         else if(ch==1){
             System.out.print("Product_cate_show ");
				 System.out.println("Product_name_show");
                    System.out.println("************************** ");
                    pc.productnameShow();
                    System.out.println("************************** ");
         }
         
         else if(ch==2){
              System.out.println("Product_disc_show");
                    System.out.println("************************** ");
                    pc.productdisShow();
                    System.out.println("************************** ");
         }
         
         else if(ch==3){
             System.out.print("Product_cate_show ");
				System.out.println("********************");
				List<String> l = pc.ProductCateShow();
                                
                                for(int i=0;i<l.size();i++){
                                    System.out.println(l.get(i));
                                }
			System.out.println("********************** ");
         }
         
         else if(ch==4){
             System.out.println("enter user adress");
             
         }
         else if(ch==5){
              System.out.println("update user adress");
         }
         
         else if(ch==6){
              System.out.println("delete user adress");
         }
         
         else if(ch==7){
              System.out.println(" show card items");
         }
         
         else if(ch==8){
              System.out.println("shopping session");
         }
         
         else if(ch==9){
              System.out.println("order details");
         }
         else if(ch==10){
              System.out.println("order items");
         }
         else if(ch==11){
              System.out.println("payment detail");
         }
           else if(ch==12){
              System.out.println("user payment");
         }
           else if(ch==13){
               System.out.println("update user info");
               String p="";
			String d="";
			System.out.print("Enter update product id");
			int id = sc.nextInt();
			System.out.print("update product_cate_name  'yes' or  'no'");
			if(sc.next().equalsIgnoreCase("yes")) {
				System.out.print("enter product cate name");

				p = sc.next();		
			}

			System.out.print("update product_desc  'yes' or  'no'");
			if(sc.next().equalsIgnoreCase("yes")) {
				System.out.print("enter product cate desc");
					d=sc.next();
				}
			UserInfo pcate = new UserInfo(id,p,d,"","");
		
			if(pc.UserInfoUpdate(pcate))
			{
				System.out.println("user info Updated ");
	
			}
           }
        }
    }
}

