/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import datos.Compras;
import negocio.Abarrote;
import negocio.Aseo;
import negocio.Liquido;
import negocio.Producto;

/**
 *
 * @author Gabriel Serrano
 */
public class TestSupermercado {
    
    public static void main(String[] args) {
        
        /*Inicializamos el array con el constructor vacío que llenamos en Compras*/
        Compras listaCompra = new Compras();
        
        /*Llamamos al constructor simple para hacer los elementos
        public Producto(int precio, int dscto, int cantidad, String descripcion)
        */
        Producto atun = new Abarrote(1300, 5, 3, "Atún");
        Producto leche = new Liquido(1200, 20, 2, "Leche");
        Producto cloro = new Aseo(1340, 0, 1, "Clorox");
        
        /*Usamos el método para agregar elementos*/
        listaCompra.agregarProducto(atun);
        listaCompra.agregarProducto(leche);
        listaCompra.agregarProducto(cloro);
        
        /*Usamos el método para agregar comentarios que dice
        el problema.
        Inventaremos que es para agregar detalles de envío
        */
        String DireccionEnvio = "Jorge Ross 753";
        
        listaCompra.generarBoleta(DireccionEnvio);

    }
    
}