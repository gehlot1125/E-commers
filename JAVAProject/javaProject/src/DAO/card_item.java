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
public class card_item {
     private int  card_id;
  private int  user_id  ;  
 private  int quantity;      
 private  int created_id ; 
 private int   modified_at;
    private  int session_id;
    private int product_id;
 
         public card_item(int card_id, int user_id, int quantity,  int created_id, int modified_at,int session_id,int product_id){
             this.card_id = card_id;
             this.modified_at = modified_at;
             
             this.quantity = quantity;
             this.created_id = created_id;
             this.session_id = session_id;
             
 }        
         public int getOrder(){
             return card_id;
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
            public int getSession_id(){
                 return session_id;
            }
            
            public int getProduct_id(){
                return product_id;
            }
}
