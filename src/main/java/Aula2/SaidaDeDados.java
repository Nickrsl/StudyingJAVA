package Aula2;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Saída no console, com quebra de linha.");
        System.out.print("Saída, sem quebra de linha.");
        System.err.println("Impressão de erro.");
        System.out.printf("O barra invertida+n\nquebra linha(muito usado com prinf, já que ele não quebra linha\n)");

        int n1 = 5;
        int n2 = 3;
        int soma = n1 + n2;
        System.out.printf("A soma de %d e %d é igual a %d.\n", n1, n2, soma);

        String nome = "Nick";
        System.out.printf("Bem vindo, %s!\n", nome);

        double n3= 15;
        double n4 = 4;
        double divisao = n3 / n4;
        System.out.printf("A divisão entre %f e %f é igual a %f: ", n3, n4, divisao);
    }
}
