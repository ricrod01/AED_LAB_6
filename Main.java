import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) 
    {
        String opcion =  "";
        boolean flag = true;
        boolean flag2 = false;
        Scanner sc = new Scanner(System.in);

        while (flag)
        { 
            System.out.println("¿Qué estructura desea usar para el almacenamiento?");
            System.out.println("1) HashMap");
            System.out.println("2) TreeMap");
            System.out.println("3) LinkedHashMap");
            System.out.println("4) Salir");
            opcion = sc.nextLine();
            
            if(opcion.equals("1") || opcion.equals("2") || opcion.equals("3"))
            {
                flag = false;
                flag2 = true;
            }
            else if(opcion.equals("4"))
            {
                flag = false;
                System.out.println("Adiós");
            }
            else
            {
                System.out.println("Opción incorrecta.");
            }
        }

        if (flag2)
        {
            Pattern pattern = Pattern.compile( "([^,]+),([^,]+),([^,]+),([^,]+),([^,]+),([^,]+),([^,]+),\"([^\"]+)\",([^,]+),([^,]+)");

            Map<String, Pokemon> pokemonMap = MapFactory.tipoMapa(opcion);
            String csvFile = "pokemon_data_pokeapi.csv";
            String line;

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
            {
                br.readLine();

                while ((line = br.readLine()) != null)
                {
                    Matcher matcher = pattern.matcher(line);

                    if (!matcher.matches())
                    {
                        System.out.println("Linea con errores: " + line);
                        continue;
                    }

                    String nombre = matcher.group(1);
                    int numeroPokedex = Integer.parseInt(matcher.group(2));
                    String tipoPrincipal = matcher.group(3);
                    String tipoSecundario = matcher.group(4).isEmpty() ? null : matcher.group(4);
                    String clasificacion = matcher.group(5);
                    float tamanio = Float.parseFloat(matcher.group(6));
                    float peso = Float.parseFloat(matcher.group(7));
                    String[] habilidades = matcher.group(8).split(", "); 
                    int generacion = Integer.parseInt(matcher.group(9));
                    boolean legendario = matcher.group(10).equalsIgnoreCase("Yes");


                    Pokemon pokemon = new Pokemon(nombre, numeroPokedex, tipoPrincipal, tipoSecundario, clasificacion, tamanio, peso, habilidades, generacion, legendario);
                    pokemonMap.put(nombre, pokemon);
                }
            }
            catch (IOException e)
            {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            } catch (NumberFormatException e)
            {
                System.out.println("Error al convertir datos numéricos: " + e.getMessage());
            }

            if(pokemonMap.size()>0)
            {
                Map<String, Pokemon> MiPokedex = MapFactory.tipoMapa(opcion);
                flag = true;
                String menu = "";

                while (flag)
                {
                    System.out.println("\n¿Qué desea hacer?");
                    System.out.println("1) Agregar un nuevo pokemon.");
                    System.out.println("2) Mostrar datos de un pokemon.");
                    System.out.println("3) Mostrar nombre y tipo principal en tu colección.");
                    System.out.println("4) Mostrar nombre y tipo de todos los pokemon");
                    System.out.println("5) Mostrar pokemon por habilidad.");
                    System.out.println("6) Mostrar pokemon por habilidad.");
                    menu = sc.nextLine();

                    if(menu.equals("1"))
                    {
                        System.out.println("Ingrese el nombre del pokemon que desea agregar.");
                        String nuevo_pokemon = sc.nextLine();
                    }
                    else if(menu.equals("2"))
                    {

                    }
                    else if(menu.equals("3"))
                    {

                    }
                    else if(menu.equals("4"))
                    {

                    }
                    else if(menu.equals("5"))
                    {

                    }
                    else if(menu.equals("6"))
                    {

                    }
                    else
                    {
                        System.out.println("Opción incorrecta.");
                    }
                }
            }
            else
            {
                System.out.println("La lista está vacía.");
            }
        }

    }
}
