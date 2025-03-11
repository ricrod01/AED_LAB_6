/**
 * @author Ricardo Rodríguez
 * @version 1
 * Clase que almacena las cualidades del pokemon.
 * fecha_creación = 06/03/2025
 * fecha_modificación = 09/03/2025
 */

import java.util.Arrays;

public class Pokemon
{
    private String nombre;
    private int numero_pokedex;
    private String tipo_principal;
    private String tipo_secundario;
    private String clasificacion;
    private float tamanio;
    private float peso;
    private String[] habilidades;
    private int generacion;
    private boolean legendario;

    /**
     * @param nombre, almacena el nombre del pokemon.
     * @param numero_pokedex, almacena el número del pokemon respecto a la pokedex.
     * @param tipo_principal, almacena el tipo princpal del pokemon.
     * @param tipo_secundario, almacena el tipo secundario del pokemon.
     * @param clasificacion, almacena la clasificacion del pokemon.
     * @param tamanio, almacena el tamaño, en metros, del pokemon.
     * @param habilidades, almacena una lista con las habilidades del pokemon.
     * @param generacion, almacena el número de generación a la cual pertenece el pokemon.
     * @param legendario, almacena un valor booleano que indica si el pokemon es legendario o no.
    */

    public Pokemon(String nombre, int numero_pokedex, String tipo_principal, String tipo_secundario, String clasificacion, float tamanio, float peso, String[] habilidades, int generacion, boolean legendario)
    {
        this.nombre = nombre;
        this.numero_pokedex = numero_pokedex;
        this.tipo_principal = tipo_principal;
        this.tipo_secundario = tipo_secundario;
        this.clasificacion = clasificacion;
        this.tamanio = tamanio;
        this.peso = peso;
        this.habilidades = habilidades;
        this.generacion = generacion;
        this.legendario = legendario;
    }

    /**
     * @return El nombre del pokemon.
    */

    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return El número de pokedex del pokemon.
    */

    public int getNumeroPokedex()
    {
        return numero_pokedex;
    }

    /**
     * @return El tipo principal del pokemon.
    */

    public String getTipoPrincipal()
    {
        return tipo_principal;
    }

    /**
     * @return El tipo secundario del pokemon.
    */

    public String getTipoSecundario()
    {
        return tipo_secundario;
    }

    /**
     * @return La clasificación del pokemon.
    */

    public String getClasificacion()
    {
        return clasificacion;
    }

    /**
     * @return El tamaño del pokemon.
    */

    public float getTamanio()
    {
        return tamanio;
    }

    /**
     * @return El peso del pokemon.
    */

    public float getPeso()
    {
        return peso;
    }

    /**
     * @return Las habilidades del pokemon.
    */

    public String[] getHabilidades()
    {
        return habilidades;
    }

    /**
     * @return La generación a la cual pertenece el pokemon.
    */

    public int getGeneracion()
    {
        return generacion;
    }

    /**
     * @return Indica si el pokemon es legendario.
    */

    public boolean getLegendario()
    {
        return legendario;
    }

    /**
     * @param habilidad, es la habilidad que se desea verificar.
     * @return Indica si el pokemon tiene la habilidad.
    */

    public boolean tieneHabilidad(String habilidad)
    {
        for (String h : habilidades)
        {
            if (h.equalsIgnoreCase(habilidad))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @return El string que contiene toda la información del pokemon.
    */

    @Override
    public String toString()
    {
        return "Nombre='" + nombre + '\'' +
                "numero_pokedex=" + numero_pokedex +
                "tipo_principal='" + tipo_principal + '\'' +
                "tipo_secundario='" + (tipo_secundario != null ? tipo_secundario : "N/A") + '\'' +
                "clasificacion='" + clasificacion + '\'' +
                "tamanio=" + tamanio +
                "peso=" + peso +
                "habilidades=" + Arrays.toString(habilidades) +
                "generacion=" + generacion +
                "legendario=" + legendario;
    }
}
