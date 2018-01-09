package mx.esaud.productos.models;

import mx.esaud.productos.tools.Fecha;

/**
 * Model || POJO || Entity Bean
 * @author israel
 */
public class Producto {
    
    private Integer id; // 0
    private String nombre; // ""
    private String descripcion; // ""
    private Float precio; // 0,0
    public Fecha fechaAlta = new Fecha();
    
    public final Integer IVA = 16;

    public Producto() {
    }
    
    Producto(Integer id) {
        this.id = id;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(Integer id, String nombre, String descripcion, Float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        if(precio <= 0.0){
            this.precio = (float) 0;
        }
        else{
            this.precio = precio;
        }
    }

}