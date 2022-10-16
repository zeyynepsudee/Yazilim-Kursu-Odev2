
public class classesWithAttributes {

	public static void main(String[] args) {
	Product product = new  Product(1, "Laptop", "Asus Laptop", 300, 2, "siyah");

	//product.setname("Laptop");
	//product.setId(1);
	//product.setdescription("Asus Laptop");
	//product.setprice(5000);
	//product.setstockAmount(3);

	ProductManager productManager= new ProductManager();
	productManager.Add(product);
	
	//System.out.println(product.name);//
	}

}
