import java.util.Scanner;

/**
 * Aleatorios
 */
public class Aleatorios {
    public static void main(String[] args) 
    {   //invocables
        Scanner numero = new Scanner(System.in);

        int numeros[] = new int[50];
        int ingresar = 0;
        int indice = 0;
        
        while(indice < numeros.length)
        {
            int numeroAleatorio = (int)Math.round(Math.random()*10);
            if (numeroAleatorio <= 10 && numeroAleatorio >= 1) 
            {
                numeros[indice] = numeroAleatorio;
                indice++;
            }
        }
        System.out.println("\t Los numeros aleatorios son.");
        for (int k = 0; k < numeros.length; k++) 
        {
            System.out.println("#" + (k+1) + " - " + numeros[k] + " ");
        }
        System.out.println();
        System.out.print("Ingrese un numero del 1 al 10: ");
        ingresar = Integer.parseInt(numero.nextLine());
        while(ingresar < 1 || ingresar > 10)
        {
            System.out.print("¡ERROR! ingresa un numero del 1 al 10: ");
            ingresar = Integer.parseInt(numero.nextLine());
        }
        ///Ingresar es el numero a contar; numeros es el vector, 0: indice; 0 contador.
        int conteo = Procesamiento.buscarNumero(ingresar, numeros, 0, 0);
        System.out.println("El numero: " + ingresar + " se encontro: " + conteo + " veces.");

    }

}