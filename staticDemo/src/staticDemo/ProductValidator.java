package staticDemo;

//Ana class ta Java'da "public static class ProductValidator" yazılamaz ama C# da yazılabilir.
public class ProductValidator {
	
	//1 den fazla static blok oluşturulabilir. Hepsi de birden çalışır.
	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}
	
	//Burada constructor un çalışabilmesi için "ProductValidator" ı new lemek lazım. 
	//C# da static lerde de constructorda da çalışır ama Java'da çalışmaz
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	//"isValid" static olduğundan ProductValidator" dedikten sonra "." ile direk çağırılabilir.
	public static boolean isValid(Product product) {
		//Utility lerde 1 kez oluşturup her yerde kullanabilmek için "static" öneki eklendi
		//Ama static öğe sürekli olarak hafızada yer tuttuğundan pahalıya mal olur. Dikkatli kullanmak gerekir.
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	//Aşağıdaki metodu çağırabilmek için "ProductValidator" u new lememiz lazım. Ama static yapsaydık "." ile çağırabilirdik.
public void bisey() {
		
	}
	
	//Inner Class
	//Gruplandırma amaçlı kullanılır
public static class BaskaBirClass{
	public static void Sil() {
		
	}
}
}
