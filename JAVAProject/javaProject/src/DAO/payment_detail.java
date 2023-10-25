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
public class payment_detail {
    
    private int order_id;
    private int payment_id;
    private int amount;
    private String provider;
    private String pay_status;
    private int created_at;
    private int modified_at;
    private int modified;
    
    public payment_detail(int order_id, int payment_id, int amount , String provider, String pay_status, int created_at, int modified_at){
        
        this.order_id = order_id;
        this.amount = amount;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.pay_status = pay_status;
        this.payment_id = payment_id;
        this.provider = provider;
        
    }
    
    public int getOrder_id(){
         return order_id;
    }
     public String getPay_status(){
          return pay_status;
     }
      public String getProvider(){
           return provider;
           
      }
       public int getPayment_id(){
            return payment_id;
       }
       public int getCreated_at(){
            return created_at;
       }
       public int getModified()
       {
           return modified;
       }
        public int getAmount(){
             return amount;
        }
}
