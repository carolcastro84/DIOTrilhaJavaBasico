import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
        System.out.println("Por favor, digite o primeiro valor");
        int parametroUm = scanner.nextInt();

        System.out.println("Por favor, digite o segundo valor");
        int parametroDois = scanner.nextInt();

        scanner.close();
        
        contar(parametroUm, parametroDois);
    }

    static void contar (int parametroUm, int parametroDois){
        try {
            validaParametros(parametroUm, parametroDois);

            int contagem = parametroDois - parametroUm;

            for (int x = 0; x <= contagem; x++ ){
                System.out.println("Imprimindo o número " + x);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro precisar ser maior que o primeiro");
        }
    }


    static void validaParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
    }

}
