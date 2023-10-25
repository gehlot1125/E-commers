/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import AdminDAO.Admindao;
/**
 *
 * @author DELL
 */
public class paymentDAO {
    private int payment_id;
    private int amount;
    private int order_id;
    private String pay_status;
    private String provider;
    
    public paymentDAO(int payment_id , int amount , int order_id, String pay_status, String provider){
        this.order_id = order_id;
        this.amount = amount;
        this.pay_status = pay_status;
        this.provider = provider;
        
    }
     public int getorder_id(){
         return order_id;
     }
      public int getamount(){
          return amount;
      }
      public int getpayment_id(){
          return payment_id;
      }
      public String getpay_status(){
          return pay_status;
      }
      public String getprovider(){
          return provider;
      }
}
