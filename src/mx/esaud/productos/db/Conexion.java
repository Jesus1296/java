package mx.esaud.productos.db;

import java.util.ArrayList;

/**
 *
 * @author israe
 */
interface Conexion {
    
    // solo se define la signature de los métodos
    Boolean open(String url, String pto);
    ArrayList<String> selectAll(String sql);
    Object selectOne(Integer id);
    
}
