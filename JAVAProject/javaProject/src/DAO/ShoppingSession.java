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
public class ShoppingSession {
    
    private int session_id;
    private int user_id;
    private int total;
    
    public ShoppingSession(int session_id , int user_id, int total){
        
        this.session_id = session_id;
        this.total = total;
        this.user_id = user_id;
    }
    
      public int getSession_id(){
           return session_id;
      }
       public int user_id(){
           return user_id;
       }
       
       public int total(){
           return total;
       }
}
