/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/*Importamos para hacer los Array*/
import java.util.ArrayList;
import java.util.List;
import negocio.ComentarCompra;
import negocio.Producto;

/**
 *
 * @author Gabriel Serrano
 */

/*Aquí implementaremos la interfaz COmentarCompra del problema*/
public class Compras implements ComentarCompra{
    
    /*Declaramos el array como atributo*/
    private List<Producto> listaCompras;

    /*Hacemos un constructor vacío y lo llenamos con la inicialización del Array*/
    public Compras() {
        listaCompras = new ArrayList<>();
    }
    
    /*Método para agregar elementos al array*/
    public void agregarProducto(Producto producto){
        listaCompras.add(producto);
    }
    
    /*Método para sacar una boleta sencilla*/
    public void generarBoleta(String direccion){
        /*Declaración de acumuladores*/
        int totalCompra = 0;
        int dscto = 0;
        int totalDsctos = 0;
        
        System.out.println("***** Total Compra *****");
        /*For para hacer cada ítem de la boleta*/
        for (Producto item : listaCompras) {
            /*Si tiene descuento, se imprime una línea más indicando el valor*/
            System.out.println(item.getDescripcion() + " - " + item.getCantidad() + " Unidades - $" + item.calcularTotalProducto());
            if (item.getDscto() > 0) {
                dscto = item.calcularDescuento()*item.getCantidad();
                System.out.println("Descuento: -&" + dscto);
                /*Aquí se acumulan los descuentos*/
                totalDsctos = totalDsctos + dscto;
            }
            System.out.println("");
            /*Se acumulan valores*/
            totalCompra = totalCompra + (item.calcularTotalProducto()-(item.calcularDescuento()*item.getCantidad()));
                        
        }
        
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Total descuentos: $" + totalDsctos);
        System.out.println("***** Detalles de envío ******");
        /*Llamamos a un método de la misma clase*/
        System.out.println(detallarDireccionEnvio(direccion));
    }

    /*Sí o sí hay que importar todos sus métodos*/
    @Override
    public String detallarDireccionEnvio(String direccion) {
        return "La dirección de envío es " + direccion;
    }
    
}
