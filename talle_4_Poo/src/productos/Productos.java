package productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
    /**Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
        precio. Implementa getters y setters para aplicar el encapsulamiento.
         */

        private String nombre;
        private double precio;
        private int id;

        public Productos(String nombre, double precio, int id){
            this.nombre = nombre;
            this.precio = precio;
            this.id = id;
        }

        public int getId(){
            return id;
        }
        
        public String getName(){
            return nombre;
        }

        public double getPrice(){
            return precio;
        }

        public void setProducto(String nombre, double precio, int id){
            this.nombre = nombre;
            this.precio = precio;
            this.id = id;
        }

        public void interFace(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        /*Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
        Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
        por nombre o categoría. */

        ArrayList<ProductoUnitario> listProducts = new ArrayList<>();
        String option = "";
        int productId = 0;
        do {
            System.out.println("""
                    1. Añadir producto
                    2. Eliminar producto
                    3. Listar productos
                    4. Buscar producto por nombre o categoria
                    5. Salir
                    """);
                    System.out.println("Pon la opcion que quieras");
                    option = scanner.nextLine();
                    scanner.nextLine();

                    switch (option) {
                        case "1":
                        System.out.println("Cuantos productos quieres ingresar");
                        int numberProduct = scanner.nextInt();
                        scanner.nextLine();
                
                        for (int i = 0; i < numberProduct; i++) {
                            System.out.println("Introduce el nombre del producto: ");
                            String name = scanner.nextLine().toLowerCase();
                            scanner.nextLine();
                            System.out.println("Introduce la categoria del producto: ");
                            String category = scanner.nextLine().toLowerCase();
                            System.out.println("Introduce el precio del producto: ");
                            double price = scanner.nextDouble();
                            productId++;
    
                            ProductoUnitario product = new ProductoUnitario(name, price, productId, category);
                            listProducts.add(product);
                        }
                        break;
                        case "2":
                        System.out.println("Introduce el id del producto que quieres eliminar: ");
                        int id = scanner.nextInt();
                        boolean isFind = false;
                        
                        for (int i = 0; i < listProducts.size(); i++) {
                            if(listProducts.get(i).getId() == id){
                                listProducts.remove(i);
                                isFind = true;
                                System.out.println("Producto eliminado con exito");
                            }
                        }
                        if(!isFind){
                            System.out.println("No se encontro el producto con el id: " + id);
                        }
                        break;
                        case "3":
                        System.out.println("Listado de productos: ");
                        for (int i = 0; i < listProducts.size(); i++) {
                            System.out.println(listProducts.get(i).getProducto());
                        }
                        break;

                        case "4":
                        System.out.println("Introduce el nombre o categoria del producto que quieres buscar: ");
                        String search = scanner.nextLine().toLowerCase();
                        boolean find = false;
                        for (int i = 0; i < listProducts.size(); i++) {
                            System.out.println(listProducts.get(i).getName().getClass().getSimpleName());
                            if(listProducts.get(i).getName().equals(search) || listProducts.get(i).getCategoria().equals(search)){
                                find = true;
                                System.out.println("Hola");
                                System.out.println(listProducts.get(i).getProducto());
                            }
                        }
                        if(!find){
                            System.out.println("No se encontro el producto con el nombre o categoria: " + search);
                        }
                        break;

                        case "5":
                        System.out.println("Saliste del programa");
                        return;

                        default:
                        break;
                    }
                        
                    
        }while (option != "5"); 
        }
}
