import  java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner (System.in) ;
       
      
        final double saldo = 250.48;
        
        System.out.println("Por favor, digite o numero da Agencia !");
        int numero = teclado.nextInt();
        
        System.out.println("digite a sua agencia");
        String agencia = teclado.next();
                        teclado.nextLine(); // Um nextLine() extra para consumir a linha restante
                                                
        System.out.println("Digite o seu Nome");
        String nome = teclado.nextLine();
        
              teclado.close();
      
        System.out.printf("Olá ["+nome+"] obrigado por criar uma conta em nosso banco, sua agencia é  [ "+agencia+" ] , conta [ "+numero +" ] seu saldo ["+ saldo +" R$] já esta disponivel para saque");
      
      
    
    }
}


