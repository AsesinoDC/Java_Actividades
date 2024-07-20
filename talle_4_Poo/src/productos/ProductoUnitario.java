package productos;

public class ProductoUnitario extends Productos{
    /*Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
        categoria o marca. */
    
    private String categoria;

    public ProductoUnitario(String name, double precio, int id, String catagoria){
        super(name, precio, id);
        this.categoria = catagoria;
    }
    public String getName(){
        return super.getName();
    }

    public String getCategoria(){
        return categoria;
    }

    /* public String getProducto(){
        System.out.println("  Id:   Producto:   Precio:    Categoria:");
        System.out.println("|----|-----------|----------|------------|");
        return  "| %-4s | %-10s | %-9s | %-10s |\n" + " Id: " + super.getId() +" Producto: " + super.getName() + " Precio: " + super.getPrice() 
        + " Categoria: " + categoria;
    } */

    public String getProducto() {
        return String.format("| %-4s | %-10s | %-9s | %-10s |\n",
                super.getId(), super.getName(), super.getPrice(), categoria);
    }

}
