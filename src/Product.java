
public class Product {
	
public Product(int id, String name, String description, int stockAmount, double price, String renk) {
	System.out.println("Yapıcı Blok Çalıştı");
	this._id=id;
	this.renk= renk;
	this._name= name;
	this._description= description;
	this._stockAmount= stockAmount;

}	
	
public Product() {
	
}	
	
	
int _id;
String _name;
String _description;
double _price;
int _stockAmount;
String renk;
private String _kod;


//getter//
public int getId() {
	return _id;
}
//setter//
public void setId(int id) {
	//this.id=id;//,
	_id=id;
}
public String getname() {
	return _name;
}
public void setname(String _name) {
	this._name = _name;
}
public String getdescription() {
	return _description;
}
public void setdescription(String _description) {
	this._description = _description;
}
public double getprice() {
	return _price;
}
public void setprice(double _price) {
	this._price = _price;
}
public int getstockAmount() {
	return _stockAmount;
}
public void setstockAmount(int _stockAmount) {
	this._stockAmount = _stockAmount;
}
public String getkod() {
	return _kod;
}
public void setkod(String kod) {
	this._kod = _kod;
}

}
