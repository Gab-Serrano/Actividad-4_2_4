/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Gabriel Serrano
 */
public class Abarrote extends Producto {
    
    //Atributos agregados por que lo pide el ejercicio.
    private int contNeto, porciones;
    private char medida;
    
    public Abarrote() {
    }

    public Abarrote(int contNeto, int porciones, char medida) {
        this.contNeto = contNeto;
        this.porciones = porciones;
        this.medida = medida;
    }

    public Abarrote(int contNeto, int porciones, char medida, int codigo, int precio, int dscto, int cantidad, String descripcion) {
        super(codigo, precio, dscto, cantidad, descripcion);
        this.contNeto = contNeto;
        this.porciones = porciones;
        this.medida = medida;
    }
    
    /*Con este constructor se hace todo. Ya que no se utilizaran todos los atributos.
    Solo usaremos Descripción, cantidad, precio y dscto para hacer todo. El resto de los atributos
    se guardarán como NULL pero da lo mismo.
    */
    /*Además cumplimos con la sobrecarga de constructores ya que hemos hecho muchos
    con el mismo nombre ("Abarrote") pero con distintos argumentos.
    */
    public Abarrote(int precio, int dscto, int cantidad, String descripcion) {
        super(precio, dscto, cantidad, descripcion);
    }

    public int getContNeto() {
        return contNeto;
    }

    public void setContNeto(int contNeto) {
        this.contNeto = contNeto;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public char getMedida() {
        return medida;
    }

    public void setMedida(char medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return super.toString() + "Abarrote{" + "contNeto=" + contNeto + ", porciones=" + porciones + ", medida=" + medida + '}';
    }

}
