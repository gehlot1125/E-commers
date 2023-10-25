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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author adimi
 */
public class UserInfo {
     private int user_id;
        private String first_name;
        private String last_name;
        private String telephone;
	 private String created_at; 
         
         public UserInfo(int user_id,String first_name,String last_name,String telephone,String created_at){
	this.first_name=first_name; 
	this.last_name =last_name;
	this.created_at=created_at;  
        this.telephone=telephone;
        this.user_id=user_id;
}
         
        public void setFirstName(String first_name) {
	this.first_name=first_name;
        }
         public void setLastName(String last_name) {
	this.last_name=last_name;
        }
          public void setTelephone(String telephone) {
	this.telephone=telephone;
        }
          
        public int getUserId() {
	return user_id;
        }
        public String getFirstName() {
	return first_name;
        }
        public String getLastName() {
	return last_name;
        }
        public String getTelephone() {
	return telephone;
        }
        public String getCreatedAt() {
	return created_at;
        }
}

