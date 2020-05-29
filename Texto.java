import java.util.Scanner;

public class Texto 
{
    public static void main(String[] args) 
    {
        archivos ar = new archivos();
        Scanner consola = new Scanner(System.in);
        System.out.println("Copia y pega la ruta de tu archivo.");
        String ruta1 = consola.nextLine();
        String ruta = ruta1.replaceAll("\"", "");
        String contenido = ar.leerTxt(ruta);
        // Procesar contenido del archivo.
        String contenido1 = contenido.replaceAll("\r\n", "");
        contenido1 = contenido1.replaceAll("á", "a");
        contenido1 = contenido1.replaceAll("é", "e");
        contenido1 = contenido1.replaceAll("í", "i");
        contenido1 = contenido1.replaceAll("ó", "o");
        contenido1 = contenido1.replaceAll("ú", "u");
        contenido1 = contenido1.replaceAll(",", "");
        contenido = contenido1.toLowerCase();
        //System.out.println(contenido);
        String arreglodecaracteres[] = contenido.split(" ");
        ///Imprime el texto en un arreglo en vertical sin ordenar.
        //Procesamiento.ImprimirVector(arreglodecaracteres);
        System.out.println("\n\t\t\t***Ordenando texto***");
        String[] contenidoOrdenado = Procesamiento.ordenarSeleccionMenor(arreglodecaracteres);
        System.out.print("Escribe en minusculas y sin acentos la palabra a buscar: ");
        String palabraBuscar = consola.nextLine();
        int posicionPalabra = Procesamiento.buscarPalabra(palabraBuscar, contenidoOrdenado, 0);
        System.out.println("La posicion es: "+posicionPalabra);
    }
}