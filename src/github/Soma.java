package tap;
import java.util.Scanner;

public class Soma {
    public static void main (String[]Args){
        int n1, n2;
        int soma;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        
        soma = n1+n2;
        
        System.out.print("A soma dos numeros " +n1+ " + " + n2 + " é igual a: "+soma);
    }
    
}