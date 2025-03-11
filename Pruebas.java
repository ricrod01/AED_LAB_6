/**
 * @author Ricardo Rodríguez
 * @version 1
 * Clase para pruebas unitarias
 * fecha_creación = 11/03/2025
 * fecha_modificación = 11/03/2025
 */

 import static org.junit.jupiter.api.Assertions.*;
 import org.junit.jupiter.api.Test;

public class Pruebas
{

    // Se prueba el método Traductor.
    
    @Test
    public void testHabilidadTrue()
    {
        String[] habilidades = {"Impasible", "Fuerza mental"};
        Pokemon pokemon = new Pokemon("Lucario", 448, "Lucha", "Acero", "Aura", (float) 1.2, (float) 54, habilidades, 4, false);
        assertTrue(pokemon.tieneHabilidad("Impasible"));
    }

    // Se prueba el método Traductor.

    @Test
    public void testHabilidadFalse()
    {
        String[] habilidades = {"Impasible", "Fuerza mental"};
        Pokemon pokemon = new Pokemon("Lucario", 448, "Lucha", "Acero", "Aura", (float) 1.2, (float) 54, habilidades, 4, false);
        assertFalse(pokemon.tieneHabilidad("Mar Llamas"));
    }

}