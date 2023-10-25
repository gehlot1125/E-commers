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
public class product_Inv {
    private int id;
    private int prod_id;
    private int prod_qity;
    private String created_at;
    private String modified_at;
    private String deleted_at;
    
    public product_Inv(int id, int prod_id, int prod_qity, String created_at, String modified_at, String deleted_at){
        this.id = id;
        this.prod_id = prod_id;
        this.prod_qity = prod_qity;
        this.created_at = created_at;
        this.modified_at = modified_at;
        this.deleted_at = deleted_at;
    }
    
    public void setProdId(int prod_id) {
	this.prod_id = prod_id;
    }
    
    public void setProdQity(int prod_qity) {
	this.prod_qity = prod_qity;
    }
    
    public int getId(){
        return id;
    }
    
    public int getProdId(){
        return prod_id;
    }
    
    public int getProdQity(){
        return prod_qity;
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
