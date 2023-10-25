/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import AdminDAO.Product_Cate;



/**
 *
 * @author DELL
 */
public class order_item {
    
 private int  order_id;
  private int  user_id  ;  
 private  int quantity;      
 
 private  int created_id ; 
 private int   modified_at;
 
         public order_item(int order_id, int user_id, int quantity,  int created_id, int modified_at){
             this.order_id = order_id;
             this.modified_at = modified_at;
             
             this.quantity = quantity;
             this.created_id = created_id;
             
 }        
         public int getOrder(){
             return order_id;
         }
          public int User_id(){
              return user_id;
          }
           public int getQuantity(){
               return quantity;
           }
           
           
           public int Created_id(){
               return created_id;
           }
           
           public int getModified(){
               return modified_at;
           }
           
}
