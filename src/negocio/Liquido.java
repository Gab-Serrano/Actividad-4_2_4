/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Gabriel Serrano
 */
public class Liquido extends Producto{
    
    /*Ver clase Abarrotes para más comentarios
    */
    
    //Atributos agregados por que sí.
    private int contNeto, grados;
    private char medida;
    private String tipo;
    
    public Liquido() {
    }

    public Liquido(int contNeto, int grados, char medida, String tipo) {
        this.contNeto = contNeto;
        this.grados = grados;
        this.medida = medida;
        this.tipo = tipo;
    }

    public Liquido(int contNeto, int grados, char medida, String tipo, int codigo, int precio, int dscto, int cantidad, String descripcion) {
        super(codigo, precio, dscto, cantidad, descripcion);
        this.contNeto = contNeto;
        this.grados = grados;
        this.medida = medida;
        this.tipo = tipo;
    }
    
    /*Con este constructor se hace todo. Ya que no se utilizaran todos los atributos.
    Solo usaremos Descripción, cantidad, precio y dscto para hacer todo. El resto de los atributos
    se guardarán como NULL pero da lo mismo.
    */
    /*Además cumplimos con la sobrecarga de constructores ya que hemos hecho muchos
    con el mismo nombre ("Congelado") pero con distintos argumentos.
    */
    public Liquido(int precio, int dscto, int cantidad, String descripcion) {
        super(precio, dscto, cantidad, descripcion);
    }

    public int getContNeto() {
        return contNeto;
    }

    public void setContNeto(int contNeto) {
        this.contNeto = contNeto;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public char getMedida() {
        return medida;
    }

    public void setMedida(char medida) {
        this.medida = medida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Liquido{" + "contNeto=" + contNeto + ", grados=" + grados + ", medida=" + medida + ", tipo=" + tipo + '}';
    }
        
}
