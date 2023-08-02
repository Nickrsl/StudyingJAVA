package Aula1;

import java.util.Scanner;

public class Estruturas {
    public static void main(String[] args) {
        // Scanner = permite a leitura de dados do teclado
        Scanner entrada = new Scanner(System.in);

        // Println = quebra linha
        // Print = não quebra linha
        System.out.print("Oi. ");
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine(); // aguarda o texto digitado pelo usuário

        // Exercício: Leia o peso da pessoa.
        // Calcule o IMC.
        // Verifique a situação do imc calculado com
        // base em: https://www.saude.rj.gov.br/obesidade/calcule-seu-imc

        System.out.println("Digite o sua altura (em metros): ");
        double altura = entrada.nextDouble(); // digite o número com vírgula

        System.out.println("Digite o seu peso (em quilos): ");
        double peso = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.println("IMC= " + imc);

        if (imc < 17){
                System.out.println("Muito abaixo do peso.");
            } else if (imc >= 17 && imc < 18.5) {
                System.out.println("Abaixo do peso.");
            }else if (imc >= 18.5 && imc < 25) {
                System.out.println("Peso normal.");
            }else if (imc >= 25 && imc < 30) {
                System.out.println("Acima do peso.");
            }else if (imc >= 30 && imc < 35) {
                System.out.println("Obesidade I");
            }else if (imc >= 35 && imc < 48) {
                System.out.println("Obesidade II");
            } else {
                System.out.println("Obesidade III");
            }

        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - água");
        System.out.println("2 - fruta");
        System.out.println("3 - batata");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default:
                System.out.println("Escolha uma dieta válida!");
                break;
        }

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(mensagem);


        //Repetição
        //Início
        //Condição de parada
        //Atualização do valor

        System.out.println("Digite quantos alimentos você como: ");
        int total = entrada.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("Você gosta de batata!");
        }


        // Exercício: Criem uma versão com while do código acima
        int i = 0;
        while (i < total) {
            System.out.println("Você gosta de batata!");
            i++;
        }

        int j =0;

        do {
            System.out.println("Você gosta de batata!");
            j++;
        } while (j < total);
    }
}
