import java.util.Scanner;
class javaproyecto { 
  public static void main(String[] args) {
    Scanner elScanner = new Scanner(System.in);
    float n1;
    float n2;
    float resultado;
    float usuario;


    System.out.println("Escriba un numero para la variable #1");
    n1 = elScanner.nextFloat();
    System.out.println("Escriba un numero para la variable #2");
    n2 = elScanner.nextFloat();

    float suma = n1 + n2;
    float resta = n1 - n2;
    float multiplicacion = n1 * n2;
    float division = n1 / n2;
  
    System.out.println("Escriba un numero");
    System.out.println("1- Suma");
    System.out.println("2- Resta");
    System.out.println("3- Multiplicacion");
    System.out.println("4- Division");
    usuario = elScanner.nextInt();

    resultado = usuario == 1? suma : (usuario == 2? resta: (usuario == 3? multiplicacion :usuario == 4? division: 0));

    System.out.println("El resultado es: " + resultado);
    
    }  
}