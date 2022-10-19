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

/*Aqu� implementaremos la interfaz COmentarCompra del problema*/
public class Compras implements ComentarCompra{
    
    /*Declaramos el array como atributo*/
    private List<Producto> listaCompras;

    /*Hacemos un constructor vac�o y lo llenamos con la inicializaci�n del Array*/
    public Compras() {
        listaCompras = new ArrayList<>();
    }
    
    /*M�todo para agregar elementos al array*/
    public void agregarProducto(Producto producto){
        listaCompras.add(producto);
    }
    
    /*M�todo para sacar una boleta sencilla*/
    public void generarBoleta(String direccion){
        /*Declaraci�n de acumuladores*/
        int totalCompra = 0;
        int dscto = 0;
        int totalDsctos = 0;
        
        System.out.println("***** Total Compra *****");
        /*For para hacer cada �tem de la boleta*/
        for (Producto item : listaCompras) {
            /*Si tiene descuento, se imprime una l�nea m�s indicando el valor*/
            System.out.println(item.getDescripcion() + " - " + item.getCantidad() + " Unidades - $" + item.calcularTotalProducto());
            if (item.getDscto() > 0) {
                dscto = item.calcularDescuento()*item.getCantidad();
                System.out.println("Descuento: -&" + dscto);
                /*Aqu� se acumulan los descuentos*/
                totalDsctos = totalDsctos + dscto;
            }
            System.out.println("");
            /*Se acumulan valores*/
            totalCompra = totalCompra + (item.calcularTotalProducto()-(item.calcularDescuento()*item.getCantidad()));
                        
        }
        
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Total descuentos: $" + totalDsctos);
        System.out.println("***** Detalles de env�o ******");
        /*Llamamos a un m�todo de la misma clase*/
        System.out.println(detallarDireccionEnvio(direccion));
    }

    /*S� o s� hay que importar todos sus m�todos*/
    @Override
    public String detallarDireccionEnvio(String direccion) {
        return "La direcci�n de env�o es " + direccion;
    }
    
}
