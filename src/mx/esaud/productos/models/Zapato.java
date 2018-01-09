/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.esaud.productos.models;

/**
 *
 * @author israe
 */
public final class Zapato extends Producto {
    
    private Character talla; // s,m,l
    private String tipo; // casual, deportivo, 
    private String color; // negro, azul, café

    public Zapato() {
    }

    public Zapato(Character talla, String tipo, String color) {
        this.talla = talla;
        this.tipo = tipo;
        this.color = color;
    }

    public Zapato(Character talla, String tipo, String color, Integer id) {
        super(id);
        this.talla = talla;
        this.tipo = tipo;
        this.color = color;
    }

    public Zapato(Character talla, String tipo, String color, String nombre) {
        super(nombre);
        this.talla = talla;
        this.tipo = tipo;
        this.color = color;
    }

    public Zapato(
            Character talla, 
            String tipo, 
            String color, 
            Integer id, 
            String nombre, 
            String descripcion, 
            Float precio) 
    {
        super(id, nombre, descripcion, precio); // Proucto p = new Producto(a,B,C,D)
        this.talla = talla;
        this.tipo = tipo;
        this.color = color;
    }
    
    

//    public Zapato(Character talla, String tipo, String color) {
//        this.talla = talla;
//        this.tipo = tipo;
//        this.color = color;
//    }

    @Override
    public String getNombre(){
        return "Soy un zapato";
    }
    
    public Character getTalla() {
        return talla;
    }

    public void setTalla(Character talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
