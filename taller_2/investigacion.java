import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class investigacion {
    public static void main(String[] args) {
        /**¿Qué es un ArrayList?

        Un ArrayList es una implementación de la interfaz List de Java, que forma parte del framework de colecciones. 
        Se utiliza para almacenar un conjunto de elementos que pueden ser accedidos de manera indexada. 
        A diferencia de un arreglo tradicional, un ArrayList puede cambiar de tamaño dinámicamente, 
        lo que significa que puedes agregar o eliminar elementos sin necesidad de definir el tamaño de la lista desde el principio.
        */

        //System.out.println(ejemploArrayList());


        /*El map
        ------------------------------------------------
         -------------------------------------------------
         -------------------------------------------------
         -------------------------------------------------
         */

        /**Que es el "map"?
        
         
        Un Map en Java es una estructura de datos que asocia claves únicas a valores. 
        A diferencia de una lista o un conjunto, un Map no almacena elementos en un orden específico, 
        sino que se basa en pares clave-valor. 
        
        
        Características Principales del Map(Importante)

        Claves Únicas: Cada clave en un Map debe ser única; no puedes tener dos entradas con la misma clave. 
        Sin embargo, los valores asociados a diferentes claves pueden ser iguales.

        Acceso Rápido: Permite un acceso eficiente a los valores a través de sus claves, 
        generalmente en tiempo constante (O(1)).

        Diversas Implementaciones: Hay varias implementaciones de Map en Java, entre las más comunes están:

        HashMap: No garantiza el orden de los elementos. Es rápido y eficiente para operaciones de 
        inserción, eliminación y búsqueda.

        TreeMap: Garantiza el orden de los elementos. Es más lento que HashMap, pero 
        permite operaciones de búsqueda por rangos,  Almacena las entradas en orden ascendente según las claves. 
        Implementa la interfaz SortedMap..

        LinkedHashMap: Mantiene el orden de inserción de los elementos. 
        Combina las características de HashMap y TreeMap.

        Métodos Comunes de Map

        put(K clave, V valor): Agrega un nuevo par clave-valor o actualiza el valor si la clave ya existe.

        get(Object clave): Retorna el valor asociado a la clave especificada, o null si la clave no existe.

        remove(Object clave): Elimina la entrada para la clave especificada.

        containsKey(Object clave): Verifica si el mapa contiene la clave especificada.

        size(): Devuelve el número de pares clave-valor en el mapa.

        keySet(): Devuelve un conjunto que contiene todas las claves del mapa.

        values(): Devuelve una colección que contiene todos los valores del mapa.

        entrySet(): Devuelve un conjunto de las entradas (pares clave-valor) del mapa.

        */

        //Todos estos utilizan los mismos metodos
        //System.out.println(hashMap());
        //System.out.println(treeMap());
        //System.out.println(linkedHashMap());
        //System.out.println(map());


        /*El oop
        ------------------------------------------------
         -------------------------------------------------
         -------------------------------------------------
         -------------------------------------------------
         */


         /**La Programación Orientada a Objetos (OOP) es un paradigma de programación que utiliza  
          "objetos" para representar datos y comportamientos. A continuación, te explico sus conceptos fundamentales:
            
          Principios de OOP

        Clases y Objetos:
        Clase: Es un plano o plantilla que define las propiedades (atributos)  
        y comportamientos (métodos) de un tipo de objeto.

        Objeto: Es una instancia de una clase. Representa un elemento 
        específico que tiene un estado y comportamiento.
        


        Encapsulamiento:
        Consiste en ocultar los detalles internos de un objeto y exponer solo lo necesario.
        Esto se logra mediante modificadores de acceso (public, private, protected).

    
        Herencia:
        Permite que una clase herede atributos y métodos de otra clase. 
        Esto facilita la reutilización de código y la creación de jerarquías de clases.

        Polimorfismo:
        Permite que diferentes clases puedan ser tratadas como instancias de la misma clase a través de una interfaz común. 
        Esto se logra mediante la sobrecarga y la sobrescritura de métodos.

        
        Ventajas de OOP

        Reutilización de Código: A través de la herencia, puedes reutilizar código existente.

        Mantenimiento: Facilita el mantenimiento del código, ya que los cambios 
        en una clase no afectan a otras si están bien encapsuladas.

        Flexibilidad: Permite crear sistemas más flexibles y escalables. */
    }

    public static Map<String, Integer> map(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);
        hashMap.put("C#", 4);
        hashMap.put("JavaScript", 5);
        return hashMap;
    }


    public static LinkedHashMap<String, Integer> linkedHashMap(){
        /**LinkedHashMap:

        Características: Mantiene el orden de inserción. 
        Es una combinación de HashMap y una lista doblemente enlazada.
        Permite operaciones de inserción, eliminación y búsqueda en tiempo constante (O(1)).

        Uso: Útil cuando necesitas mantener el orden de inserción 
        mientras aprovechas la rapidez de un HashMap. */
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Manzana", 1);
        mapa.put("Banana", 2);
        mapa.put("Naranja", 3);
        
        System.out.println("Mapa con orden de inserción: " + mapa);
        return mapa;
    }

    public static TreeMap<String, Integer> treeMap (){
        /**TreeMap:

        Características: Mantiene el orden de las claves de forma natural o según un comparador. 
        No permite claves nulas.
        Uso: Ideal cuando necesitas mantener los elementos ordenados. */

        TreeMap<String, Integer> mapa = new TreeMap<>();
        mapa.put("Manzana", 1);
        mapa.put("Banana", 2);
        mapa.put("Naranja", 3);
        
        System.out.println("Mapa ordenado: " + mapa);

        return mapa;
    }


    public static HashMap<String, Integer> hashMap() {
        /*HashMap:

        Características: No mantiene el orden, permite un acceso rápido, 
        permite claves y valores nulos.

        Uso: Ideal para búsquedas rápidas sin necesidad de orden. */



        // Crear un nuevo HashMap que asocia cadenas (nombre de la fruta) a enteros (cantidades)
        //Puede contener cualquier clave valor
        //      Clave    Valor
        HashMap<String, Integer> mapa = new HashMap<>();
        
        // Agregar elementos al map con el metodo put
        //         Clave      Valor
        mapa.put("Manzana", 1);  // Asocia "Manzana" con el valor 1
        mapa.put("Banana", 2);   // Asocia "Banana" con el valor 2
        mapa.put("Naranja", 3);  // Asocia "Naranja" con el valor 3
        
        // Busca, obtiene y mostrar el valor asociado a la clave "Manzana" o lo que quieras obtener
        System.out.println("Valor de Manzana: " + mapa.get("Manzana")); // Imprime 1
        
        // Mostrar el contenido actual del "map"
        System.out.println("Mapa: " + mapa);
        
        // Verificar si una clave existe
        if (mapa.containsKey("Naranja")) {
            System.out.println("Naranja está en el mapa.");
        }

        // Tamaño del mapa
        System.out.println("Número de elementos: " + mapa.size());
        
        // Eliminar lo que quieras con la clave "Banana"
        mapa.remove("Banana");
        
        // Mostrar el mapa después de eliminar "Banana"
        System.out.println("Después de eliminar Banana: " + mapa);

        // Recorrer el mapa
        System.out.println("Hola sda" + mapa.keySet());
        for (String clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }
        
        // Devolver el mapa resultante
        return mapa;
    }


    public static ArrayList<String> ejemploArrayList(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java:");
        lista.add("ArrayList");
        lista.add("Es");
        lista.add("Fácil");

        System.out.println("Array list original" + lista);

        System.out.println("");
        System.out.println("Array list en la posición 1: " + lista.get(1));//Busca algo en el array dependiendo del index

        System.out.println("");
        lista.set(1, "Pera");//Modifica el array
        System.out.println("Array list después de la modificación: " + lista);

        System.out.println("");
        lista.remove("Es");//Elimina lo que quieras
        // lista.remove(0);//Elimina lo que quieras
        System.out.println("Array list después de eliminar Es: " + lista);

        System.out.println("");
        // Tamaño de la lista
        System.out.println("Tamaño del Array list: " + lista.size());

        // Verificar si un elemento existe en el arrayList
        if (lista.contains("Hola")) {
            System.out.println("La lista contiene Hola.");
        }
        
        return lista;
    }
}
