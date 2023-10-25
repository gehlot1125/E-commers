/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


/**
 *
 * @author DELL
 */
public class orderdetails {
    
    private int order_id;
    private int user_id;
     private double total;
      private int payment_id;
       private  int created_id ; 
        private int   modified_at;
      
      public orderdetails(int order_id, int user_id, double total, int payment_id, int created_id, int modified_at){
          this.order_id = order_id;
          this.total = total;
          this.payment_id = payment_id;
          this.user_id = user_id;
          this.created_id = created_id;
           this.modified_at = modified_at;
      }
      
       public int getOrder(){
             return order_id;
         }
          public int User_id(){
              return user_id;
          }
           public int Payment_id(){
               return payment_id;
           }
           
           public int Created_id(){
               return created_id;
           }
           
           public int getModified(){
               return modified_at;
           }
}
