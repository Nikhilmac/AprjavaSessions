package OOP2_Encapsulation;

/**
 * This Code is for hiding the Variables : 
 * 
 * 
 * @author ADMIN
 *
 */

public class TestProduct {

	public static void main(String[] args) {
		
		
		String productNameActualVal="Apple MacBook Pro";
		
		Product p = new Product();
		p.setProductName("Apple MacBook Pro");
		p.setProductBrand("Apple");
		p.setProductDescription("16 iches white color");
		p.setProductPrice(1.98);
		p.setSellerName("Xeron Enterorise,New Delhi");
		

		System.out.println(p.getProductName());
		if(p.getProductName().equals(productNameActualVal)) {
			System.out.println("Correct Product Name :"+p.getProductName());
		}else {
			System.out.println("No Product Name");
		}

	}

}
