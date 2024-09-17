import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        try{
            contar(num1,num2);
        } catch(ParametrosInvalidosException e ){
            System.out.println("Primeiro número tem que ser menor que o segundo número");
        }
    

        


    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
    if(num1 > num2)
        throw new ParametrosInvalidosException();

        for(int i = 1; i<=(num2 - num1); i++){
            System.out.println("Imprimindo o número: " + i);
        }    

    }
        
}
