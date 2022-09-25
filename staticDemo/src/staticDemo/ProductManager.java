package staticDemo;

public class ProductManager {
	//Manager araçlar static olarak kullanılmaz. Genelde yardımcı araçlar static yapılabilir.
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		

	}
}
