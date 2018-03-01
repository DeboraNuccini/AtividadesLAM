import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome = "";
        System.out.printf("Digite seu nome: ");
        nome = input.next();
        System.out.printf("Meu nome é %s\n", nome);
        int idade;
        System.out.printf("Digite sua idade: ");
        idade = input.nextInt();
        System.out.printf("Minha idade é %d\n", idade);
    }
}
