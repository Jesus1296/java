package mx.esaud.productos.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.esaud.productos.languages.ES;
import mx.esaud.productos.models.Producto;
import mx.esaud.productos.models.Tenis;
import mx.esaud.productos.models.Zapato;

/**
 *
 * @author israe
 */
public class Carrito {
    
    private Float subTotal; // 0.0
    private Float total; // 0.0
    private final Float IVA = (float) 0.16;
    private List<Producto> carrito = new ArrayList<Producto>();
    
    public Carrito(){}
    
    public Boolean addProducto(Producto p){
        if(p instanceof Zapato || p instanceof Tenis){
            this.getCarrito().add(p);
            return true;
        }
        return false;
    }
    
    public String removeProducto(String nombre){
        if(!getCarrito().isEmpty()){
            for(int i = 0; i < getCarrito().size(); i++){
                if( getCarrito().get(i).getNombre().compareTo(nombre) == 0 ){
                    Producto tmp = getCarrito().get(i);
                    String mje = "Producto " + tmp.getNombre() + " eliminado ";
                    getCarrito().remove(i);
                    return mje;
                }
            }
            return "El producto no existe en el carrito " + ES.translate("Hello");
        }
        return "El carrito de compras está vacio";
    }
    
    public Float getSubTotal() {
        Iterator i = getCarrito().iterator();
        while(i.hasNext()){
            Producto tmp = (Producto) i.next();
            subTotal += tmp.getPrecio();
        }
        return subTotal;
    }

    public Float getTotal() {
        Float subt = getSubTotal();
        total = subt * (IVA + 1); 
        return total;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }
    
    public Float getIva(){
        return IVA * getSubTotal();
    }

}
