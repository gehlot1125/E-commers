/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminDAO;

/**
 *
 * @author Lenovo
 */
public class product_Dis {
    private int discount_id;
    private String name; 
	 private String prod_disc_desc ;
	 private int discount_percent;
         private String active;
         private String created_at;
         private String deleted_at;
public product_Dis(int discount_id,String name,String prod_disc_desc,int discount_percent,String active,String created_at,String deleted_at){
    this.discount_id = discount_id;
    this.name=name; 
	this.prod_disc_desc =prod_disc_desc;
        this.discount_percent=discount_percent;
        this.active=active;
        this.created_at=created_at;  
        this.deleted_at=deleted_at;
}

public void setName(String name) {
	this.name=name;
}
public void setDesc(String prod_disc_desc) {
	this.prod_disc_desc=prod_disc_desc;
}
public int getId(){
    return discount_id;
}
public String getName() {
	return name;
}
public String getProDiscDesc() {
	return prod_disc_desc;
}
public int getDiscountper() {
	return discount_percent;
}
public String getActive() {
	return active;
}
public String getCreatedAt() {
	return created_at;
}
public String getDeletedAt() {
	return deleted_at;
}
}
