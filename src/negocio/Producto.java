/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Gabriel Serrano
 */

/*Aquí en la clase Producto implementamos la interface Oferta
para sobreescribir sus métodos.
*/

/*Producto es Abstracta ya que nunca la vamos a implementar.
Solo sus hijos: abarrotes, aseo, líquidos, etc.
*/
public abstract class Producto implements Oferta {
    
    /*Atributos solicitados por el caso.
    Se agrega dscto para poder usar Oferta como interface y no como clase.
    Es más lógico así ya que cualquier producto puede estar en oferta.
    Entonces en dscto agregamos el porcentaje de descuento que se tenga.
    */
    protected int codigo, dscto, precio;
    protected int cantidad;
    protected String descripcion;

    public Producto() {
    }

    public Producto(int codigo, int precio, int dscto, int cantidad, String descripcion) {
        this.codigo = codigo;
        this.dscto = dscto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    /*Constructor abreviado para solo usar los atributos importantes.
    Este constructor solo usa precio, cantidad, descuento y descripción.
    */
    public Producto(int precio, int dscto, int cantidad, String descripcion) {
        this.dscto = dscto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDscto() {
        return dscto;
    }

    public void setDscto(int dscto) {
        this.dscto = dscto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", dscto=" + dscto + ", descripcion=" + descripcion + '}';
    }

    /*Aquí cumplimos con la sobreescritura de métodos.
    Se sobreescribe el método de la interface Oferta.
    */
    @Override
    public int calcularDescuento() {
        double porcDscto = ((double) dscto / 100.0);

        int total = (int) (this.getPrecio() * porcDscto);

        return total;
    }

    /*Método customer para sacar el precio total por producto*/
    public int calcularTotalProducto() {
        return this.getCantidad() * this.getPrecio();
    }

}
