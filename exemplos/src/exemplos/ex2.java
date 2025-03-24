package exemplos;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {      
        
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("digite um número ");
         int numero = teclado.nextInt();
         
         while (numero <=10)
         {
             System.out.println("o numero é " + numero++);
         }
         
    }
    
}
