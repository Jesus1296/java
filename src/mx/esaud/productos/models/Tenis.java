/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.esaud.productos.models;

/**
 *
 * @author israe
 */
public class Tenis extends Producto {
    
    private String color;
    private String material;
    private String velocidad;
    
    public Tenis(){}

    public Tenis(String color, String material, String velocidad) {
        this.color = color;
        this.material = material;
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}
