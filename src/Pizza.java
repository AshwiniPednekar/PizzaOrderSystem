
public class Pizza {

	String Name;
	int price;
	int quantity;
	String type;
	int Finalrate;
	

	public Pizza(String Name, int price, int quantity, String type) {
		// TODO Auto-generated constructor stub
		this.Name=Name;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getFinalrate() {
		return Finalrate;
	}
	public void setFinalrate(int finalrate) {
		Finalrate = finalrate;
	}
	
	public void displayDetails()
	{
		System.out.println("Pizza Name : " +getName());
		System.out.println("Pizza Type : " +getType());
		System.out.println("Pizza Quantity :" +getQuantity());
		System.out.println("Pizza Price :" +getPrice());
		System.out.println("- - - - - - - - - -");
	}
	
	public int generatePrice()
	{
		Finalrate=this.getPrice()*this.getQuantity();
		return Finalrate;
		
	}
	
	public int generateTax()
	{
		int tax=8;
		return (this.generatePrice()*tax/100);
	}
	
	public void ApplyInterest(){
		Finalrate=this.getFinalrate()+generateTax();
	}

}




