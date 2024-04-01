package exceptioninmobilebrand;

public class Product {

	private String brand;
	private int price;
	private String color;
	public Product(String brand, int price, String color)throws InvalidException {
		super();
		setBrand(brand);
		setPrice(price);
		setColor(color);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		
		return price;
	}
	public void setPrice(int price)throws InvalidException {
		if(price>10000)
		{
			this.price = price;
			
		}else {
			throw new InvalidException("Invalid Price");
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	

}
