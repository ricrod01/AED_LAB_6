import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;


class MapFactory
{
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