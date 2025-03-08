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

    // Constructor
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

    // Getters
    public String getNombre()
    {
        return nombre;
    }

    public int getNumeroPokedex()
    {
        return numero_pokedex;
    }

    public String getTipoPrincipal()
    {
        return tipo_principal;
    }

    public String getTipoSecundario()
    {
        return tipo_secundario;
    }

    public String getClasificacion()
    {
        return clasificacion;
    }

    public float getTamanio()
    {
        return tamanio;
    }

    public float getPeso()
    {
        return peso;
    }

    public String[] getHabilidades()
    {
        return habilidades;
    }

    public int getGeneracion()
    {
        return generacion;
    }

    public boolean getLegendario()
    {
        return legendario;
    }

    public boolean tieneHabilidad(String habilidad)
    {
        for (String h : habilidades)
        {
            if (h.equalsIgnoreCase(habilidad)) {
                return true;
            }
        }
        return false;
    }

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
