package exemplos;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {      
        Scanner entrada = new Scanner (System.in);
        System.out.println ("digite um número: ");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++)
        {
            System.out.println("O seu numero é " + i );
        }    
                
        
    }
    
}
