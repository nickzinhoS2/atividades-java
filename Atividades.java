import java.util.Scanner;

public class Atividades {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("escreva dois numeros inteiros:");
        int numeros = entrada.nextInt();
        int valor = entrada.nextInt();
        int total  = numeros + valor;
        
       System.out.println("Soma de tudo:" +total);
        
       System.out.println
        ("=============================================");

        System.out.println(" escreva um numero em M para tranformar em CM:");
        int cm = entrada.nextInt();
        int mult = cm * 100;
        System.out.println("transformando em cm o valor e: " + mult);
        
        System.out.println
        ("============================================");

        System.out.println("Escreva um numero: ");
        double numero1 = entrada.nextDouble();
        if(numero1 %2==0){
            System.out.println("Seu numero e par");
        }else{
            System.out.println("Seu numero é impar");
        }

        System.out.println
        ("============================================");

        System.out.println("velocidade do carro: ");
        double number1 = entrada.nextDouble();
        if(number1 > 80){
            double acima = number1 = 80;
            double multa = acima *5;
            System.out.println("voce ultrapassou a velocidade permitida, sua multa e de: "+multa);
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }
    }

}
