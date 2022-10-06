
public class Main {

	public static void main(String[] args) {
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		//Referans tipi olmadığı için sayi1 etkilenmez sayi1=20 olur.
		System.out.println(sayi1);
		
	}

}
