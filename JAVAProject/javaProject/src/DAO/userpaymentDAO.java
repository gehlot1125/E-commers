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
public class userpaymentDAO {
    

     private int user_id;
     private int account_no;
     private  int expiry;
     private String payment_type;
      private int payment_id;
      private String provider;
      
      public userpaymentDAO( int user_id, int payment_id , int account_no, int expiry, String payment_type, String provider){
           this.account_no = account_no;
           this.expiry = expiry;
           this.payment_id = payment_id;
           this.provider = provider;
           this.user_id = user_id;
           this.payment_type = payment_type;
      }
      
      public int getAccount_no(){
          return account_no;
      }
       public int getPayment_id(){
           return payment_id;
       }
        public String getPayment_type(){
            return payment_type;
        }
         public String  getProvider(){
             return provider;
         }
         
         public int getUser_id(){
             return user_id;
         }
         
         public int getExpiry(){
             return expiry;
         }
}
