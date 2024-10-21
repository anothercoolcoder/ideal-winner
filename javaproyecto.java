//importar librerias
import java.util.Scanner;
class javaproyecto { 
  public static void main(String[] args) {
    //scanner inicializado
    Scanner elScanner = new Scanner(System.in);
    //declaracion
    float n1, n2, resultado, usuario;

    //Pregunta
    System.out.println("Escriba un numero para la variable #1");
    n1 = elScanner.nextFloat();
    System.out.println("Escriba un numero para la variable #2");
    n2 = elScanner.nextFloat();
    //Operacion
    float suma = n1 + n2;
    float resta = n1 - n2;
    float multiplicacion = n1 * n2;
    float division = n1 / n2;
    //Menu
    System.out.println("Escriba un numero");
    System.out.println("1- Suma");
    System.out.println("2- Resta");
    System.out.println("3- Multiplicacion");
    System.out.println("4- Division");
    usuario = elScanner.nextInt();
    //operador ternario
    resultado = usuario == 1? suma : (usuario == 2? resta: (usuario == 3? multiplicacion :usuario == 4? division: 0));
    //pantalla final
    System.out.println("El resultado es: " + resultado);
    
    }  
}