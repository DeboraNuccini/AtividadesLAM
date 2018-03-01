import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        int idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        if(idade < 18){
            System.out.printf("Entrada não permitida");
        }
        else{
            System.out.printf("Entrada permitida");
        }
    }
}
