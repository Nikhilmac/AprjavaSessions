package OOP2_Encapsulation;
/**
 * This Code is for hiding the Variables : 
 * 
 * 
 * @author ADMIN
 *
 */

public class Product {
	
	private String productName;
	private double productPrice;
	private String productDescription;
	private String sellerName;
	private String productBrand;
	
	//getter and Setter :
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	
	
}
