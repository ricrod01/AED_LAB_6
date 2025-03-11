/**
 * @author Ricardo Rodríguez
 * @version 1
 * Clase encargada de crear el Map que usará el programa.
 * fecha_creación = 06/03/2025
 * fecha_modificación = 09/03/2025
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


class MapFactory
{

    /**
     * @param tipo,, es el tipo de Map que escoge el usuario.
     * @return Objeto tipo <K, V> Map<K, V>, el cual es la estructura que almacenará a los pokemon.
    */

    public static <K, V> Map<K, V> tipoMapa(String tipo)
    {
        switch (tipo)
        {
            case "1":
                return new HashMap<>();
            case "2":
                return new TreeMap<>();
            case "3":
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("No existe el tipo elegido.");
        }
    }
}