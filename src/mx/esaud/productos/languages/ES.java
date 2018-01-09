/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.esaud.productos.languages;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author israe
 */
public final class ES {
                                   
    public static String translate(String s){
        Map<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("Hello", "Hola");
        diccionario.put("God bay", "Adios");
        return diccionario.get(s);
    }
    
}
