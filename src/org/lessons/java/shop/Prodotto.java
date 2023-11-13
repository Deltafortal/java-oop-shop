package org.lessons.java.shop;

public class Prodotto {

	
	//Defining variables
	
	private int code;
	public String name;
	public String description;
	public double price;
	private int iva;
	
	
	//Constructor
	public Prodotto(int code, String name, String description, double price, int iva) {
		
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
		
	}
	
	
	
	//Code functions
	public int getCode() {
		return code;
	}
	
	
	private void setCode(int code) {
		this.code = code;
	}
	
	
	
	
	//Name functions
	public String getName() {
		return name;	
	}
	
	
	public String getFullName() {
		return code + "-" + name;
	}
	
	
	public void setName(String name)  {
		this.name = name;
	}
	
	
	
	
	//Description functions
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	// Price functions
	public double getPrice() {
		return price;
	}
	
	
	public double getFullPrice() {
		return price = price + (price / 100) * iva;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	//IVA functions
	public double getIva() {
		return iva;
	}
	
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	
	// To String
	
	@Override
	public String toString() {
		return String.format("Prodotto: %08d |Nome: %s |Nome Intero: %s |Descrizione: %s |Prezzo: %.2f |Prezzo IVA: %.2f |IVA: %.2f%%",
                getCode(), getName(), getFullName(), getDescription(), getPrice(), getFullPrice(), getIva());
	}
	
	
}
