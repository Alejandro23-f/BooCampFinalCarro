package ejercicio;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {

	private String nombre ;
	private BigDecimal precio;
	private Tax tax;
	
	
	public Product(String nombre, BigDecimal precio, Tax tax) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}

	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;

	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}



}
