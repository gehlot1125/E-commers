/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Lenovo
 */
public class SelectDAO {
    private String email;
    private String password;
    
    
   public void setEmail(String email){
       this.email = email;
   }
   
   public void setPassword(String password){
       this.password = password;
   }
   
   public String getEmail(){
       return email;
   }
   
   public String getPassword(){
       return password;
   }
}
