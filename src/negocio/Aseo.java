/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Gabriel Serrano
 */
public class Aseo extends Producto{
        /*Ver clase Abarrotes para más comentarios
    */
    
    
    //Atributos agregados por que sí.
    private int unidades;
    private char medida;
    private String material;

    public Aseo() {
    }

    public Aseo(int unidades, char medida, String material) {
        this.unidades = unidades;
        this.medida = medida;
        this.material = material;
    }

    public Aseo(int unidades, char medida, String material, int codigo, int precio, int dscto, int cantidad, String descripcion) {
        super(codigo, precio, dscto, cantidad, descripcion);
        this.unidades = unidades;
        this.medida = medida;
        this.material = material;
    } 
    
    /*Con este constructor se hace todo. Ya que no se utilizaran todos los atributos.
    Solo usaremos Descripción, cantidad, precio y dscto para hacer todo. El resto de los atributos
    se guardarán como NULL pero da lo mismo.
    */
    /*Además cumplimos con la sobrecarga de constructores ya que hemos hecho muchos
    con el mismo nombre ("Aseo") pero con distintos argumentos.
    */
    public Aseo(int precio, int dscto, int cantidad, String descripcion) {
        super(precio, dscto, cantidad, descripcion);
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public char getMedida() {
        return medida;
    }

    public void setMedida(char medida) {
        this.medida = medida;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "Aseo{" + "unidades=" + unidades + ", medida=" + medida + ", material=" + material + '}';
    }
    
    
    
}
