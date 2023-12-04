
package actividad2pooe10;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio resuelto #10");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario digitar NI = Número de inscripción NOM = Nombres PAT = Patrimonio y ES = Estrato social
        System.out.print("Ingrese el Número de inscripción: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        int NI = Integer.parseInt(entrada1);
        
        System.out.print("Ingrese los Nombres: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        String NOM = entrada2;
        
        System.out.print("Ingrese el Patrimonio: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        double PAT = Double.parseDouble(entrada3);
        
        System.out.print("Ingrese el Estrato social: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada4 = scanner.nextLine();
        int ES = Integer.parseInt(entrada4);
        
        //Definimos el valor del pago de matrícula
        double PAGMAT = 50000;
        
        //Toma de decisiones
        if (PAT > 2000000 && ES > 3) {
            PAGMAT = PAGMAT + (PAT * 0.03);
        } else {
        }
        
        System.out.println("El estudiante con Número de Inscripción: " + NI + " y Nombre: " + NOM + " debe pagar: $" + PAGMAT);
        
    }
    
}
