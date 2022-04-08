package ejercicio;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;


public class Shopping {

	public static BigDecimal total2 = new BigDecimal("0");
	public static BigDecimal precioIva = new BigDecimal("0");
	public static BigDecimal ivaCalculado = new BigDecimal("0");
	
	public static void main(String[] args) {



		List<Product> shoppingCart = List.of(
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));



		// Implementación
		
    
	shoppingCart.stream().forEach(pro ->{
        ivaCalculado = pro.getPrecio().multiply(pro.getTax().getPrecio());
        total2= total2.add(pro.getPrecio().add(ivaCalculado));
        total2 = total2.add(precioIva);
});
	System.out.println("el total de la compra es " + total2 + "€");
	



//Los productos que empiecen con C
Stream <Product> productos=shoppingCart.stream().filter(producto->producto.getNombre().startsWith("C")).sorted();
productos.forEach((p)-> {
    System.out.println("Los productos que empiezan por C son: " + p.getNombre() + ".");
});

}
}