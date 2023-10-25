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
public class product_Name {
    private int id;
    private String prod_name;
    private String prod_desc;
    private String prod_sku;
    private int prod_cat;
    private int prod_price;
    private int prod_disc;
    private String created_at;
    private String modified_at;
    private String deleted_at;
    
    public product_Name(int id,String prod_name, String prod_desc, String prod_sku, int prod_cat, int prod_price, int prod_disc, String created_at, String modified_at, String deleted_at){
        this.id = id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_sku = prod_sku;
        this.prod_cat = prod_cat;
        this.prod_price = prod_price;
        this.prod_disc = prod_disc;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.deleted_at = deleted_at;
    }
    
    public void setName(String prod_name) {
	this.prod_name = prod_name;
    }
    
    public void setDesc(String prod_desc) {
	this.prod_desc=prod_desc;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return prod_name;
    }
    
    public String getProdDesc(){
        return prod_desc;
    }
    
    public String getProdSku(){
        return prod_sku;
    }
    
    public int getProdCat(){
        return prod_cat;
    }
    
    public int getProdPrice(){
        return prod_price;
    }
    
    public int getProdDisc(){
        return prod_disc;
    }
    
    public String getCreatedAt() {
	return created_at;
    }
    
    public String getModifiedAt(){
        return modified_at;
    }
    
    public String getDeletedAt() {
	return deleted_at;
    }
}
