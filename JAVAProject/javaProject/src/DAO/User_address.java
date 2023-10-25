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
public class User_address {
    
     private int user_add_id;
     private int user_id;
     private String address_line1;
     private String address_line2;
     private String city;
     private int telephone;
     private int mobile;
     private int postal_city;
     
     public User_address(int user_add_id, int user_id, String address_line1 , String address_line2 , String city, int telephone , int mobile , int postal_city){
         
         this.postal_city = postal_city;
         this.address_line1 = address_line1;
          this.address_line2 = address_line2;
           this.city = city;
            this.mobile = mobile;
            this.user_add_id = user_add_id;
             this.user_id = user_id;
             this.telephone = telephone;
         
     }
     
     public int getPostal_city(){
          return postal_city;
          
     }
      public int getTelephone(){
           return telephone;
      }
       public int getMobile(){
            return mobile;
       }
        public String getAddress_line2(){
             return address_line2;
        }
         public String getAddress_line1(){
              return address_line1;
         }
          public int getUser_add_id(){
              return user_add_id;
          }
           public int getUSer_id(){
                return user_id;
           }
        public String getCity(){
           return city;}
}
