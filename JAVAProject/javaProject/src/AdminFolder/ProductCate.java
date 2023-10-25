package AdminFolder;

import java.util.Scanner;

import AdminDAO.Product_Cate;
import ProductControl.ProductControl;
import AdminDAO.product_Dis;
import AdminDAO.product_Name;
import AdminDAO.product_Inv;
import java.util.List;

public class ProductCate {
	public ProductCate() {
		Scanner sc = new Scanner(System.in);

		ProductControl pc = new ProductControl();
		while (true) {
			System.out.print(
					"1 enter for add 'p_cate' and \n2 for show 'p cate' \n3 for product discount \n4 for show product discount \n5 for product name \n6 for show product name \n7 for product inventory \n8 for show product inventory \n9 for break");
			System.out.print(
					"\n10 pro cate delete \n11 pro cate update \n12 pro dis delete \n13 pro dis update \n14 pro name delete \n15 pro name update \n16 pro inv delete \n17 pro inv update");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.print("Enter product_cate_name , product_cate_desc, create_date");
				String p = sc.next();
				String d = sc.next();
				Product_Cate pcate = new Product_Cate(0, p, d, "", "");

				if (pc.ProductCate(pcate)) {
					System.out.println("pro_cate inserted ");

				}
			} else if (ch == 2) {
				System.out.print("Product_cate_show ");
				System.out.println("******** ");
				List<String> l = pc.ProductCateShow();
                                
                                for(int i=0;i<l.size();i++){
                                    System.out.println(l.get(i));
                                }
				System.out.println("******** ");

			} else if (ch == 10) {

				System.out.println("Product_cate_Delete  enter id");
				System.out.println("******** ");
				int id = sc.nextInt();
				if (pc.ProductCateDelete(id)) {
					System.out.println("*** delete *****");
				}
			}

			else if (ch == 11) {
				String p = "";
				String d = "";
				System.out.print("Enter update product id");
				int id = sc.nextInt();
				System.out.print("update product_cate_name  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product cate name");

					p = sc.next();
				}

				System.out.print("update product_desc  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product cate desc");
					d = sc.next();
				}
				Product_Cate pcate = new Product_Cate(id, p, d, "", "");

				if (pc.ProductCateUpdate(pcate)) {
					System.out.println("pro_cate Updated ");

				}
			} else if (ch == 3) {

				System.out.print("Enter name , prod_disc_desc,discount percent, active, create_date, deleted date");
				String p = sc.next();
				String d = sc.next();
				int w = sc.nextInt();
				String v = sc.next();
				product_Dis pdis = new product_Dis(0, p, d, w, v, "", "");

				if (pc.productdis(pdis)) {
					System.out.println("product discount inserted ");
				}
			} else if (ch == 4) {
				System.out.println("Product_disc_show");
				System.out.println("********** ");
				pc.productdisShow();
				System.out.println("********** ");
			} else if (ch == 12) {

				System.out.println("Product_dis_Delete  enter id");
				System.out.println("******** ");
				int id = sc.nextInt();
				if (pc.productdisDelete(id)) {
					System.out.println("*** delete *****");
				}
			} else if (ch == 13) {
				String p = "";
				String d = "";
				System.out.print("Enter update product id");
				int id = sc.nextInt();
				System.out.print("update product_dis_name  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product cate name");

					p = sc.next();
				}

				System.out.print("update product_desc  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product cate desc");
					d = sc.next();
				}
				product_Dis pdis = new product_Dis(id, p, d, 0, "", "", "");

				if (pc.productdisUpdate(pdis)) {
					System.out.println("pro_dis Updated ");

				}
			}

			else if (ch == 5) {
				System.out.print(
						"Enter product name, product desc,sku,category id, product price,discount id, create_date, modified date, deleted date");
				String n = sc.next();
				String d = sc.next();
				String s = sc.next();
				int c = sc.nextInt();
				int p = sc.nextInt();
				int v = sc.nextInt();

				product_Name pname = new product_Name(0, n, d, s, c, p, v, "", "", "");

				if (pc.productname(pname)) {
					System.out.println("product name inserted");
				}
			} else if (ch == 6) {
				System.out.println("Product_name_show");
				System.out.println("********** ");
				pc.productnameShow();
				System.out.println("********** ");
			} else if (ch == 14) {

				System.out.println("Product_name_Delete  enter id");
				System.out.println("******** ");
				int id = sc.nextInt();
				if (pc.productnameDelete(id)) {
					System.out.println("*** delete *****");
				}
			} else if (ch == 15) {
				String p = "";
				String d = "";
				System.out.print("Enter update product id");
				int id = sc.nextInt();
				System.out.print("update product_name  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product name");

					p = sc.next();
				}

				System.out.print("update product_desc  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product name desc");
					d = sc.next();
				}
				product_Name pname = new product_Name(id, p, d, "", 0, 0, 0, "", "", "");

				if (pc.productnameUpdate(pname)) {
					System.out.println("pro_name Updated ");

				}
			}

			else if (ch == 7) {
				System.out.print("Enter prod_id, prod_qity");
				int i = sc.nextInt();
				int q = sc.nextInt();

				product_Inv pinv = new product_Inv(0, i, q, "", "", "");

				if (pc.productinventory(pinv)) {
					System.out.println("product inventory inserted");
				}
			} else if (ch == 8) {
				System.out.println("Product_inv_show");
				System.out.println("********** ");
				pc.productinventoryShow();
				System.out.println("********** ");
			} else if (ch == 16) {

				System.out.println("Product_inv_Delete  enter id");
				System.out.println("******** ");
				int id = sc.nextInt();
				if (pc.productinventoryDelete(id)) {
					System.out.println("*** delete *****");
				}
			} else if (ch == 17) {
				int p = 0;
				int d = 0;
				System.out.print("Enter update product inv id");
				int id = sc.nextInt();
				System.out.print("update product_quantity  'yes' or  'no'");
				if (sc.next().equalsIgnoreCase("yes")) {
					System.out.print("enter product quantity");

					p = sc.nextInt();
				}
				product_Inv pinv = new product_Inv(id, 0, p, "", "", "");

				if (pc.productinventoryUpdate(pinv)) {
					System.out.println("pro_inv Updated ");

				}
			}

			else if (ch == 9) {
				break;
			}
		}
	}
}