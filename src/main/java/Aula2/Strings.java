package Aula2;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        // String java = new String("Java(Um texto é um objeto)");
//        String java = "Java"; // forma simplificada de escrever a mesma coisa
//        //Métodos
//        System.out.println(java.toLowerCase());//minuscula
//        System.out.println(java.toUpperCase());//maiuscula
//        System.out.println(java.charAt(3));//caractere com base na sua posição
//        System.out.println(java.indexOf("va"));//indice do primeiro caractere da substring
//        System.out.println(java.replace("v", "c"));//substituir x por y
//        System.out.println(java.replaceAll("a", "i"));//substituir todos os x por y
//        System.out.println(java.substring(2, 4));//indice inicial, indice final+1
//        System.out.println(java.length());//tamanho do texto
//
//        String nome1 = "Alvi";
//        String nome2 = "Alvi";
//        System.out.println(nome1 == nome2); // compara os objetos nome1 e nome2
//        System.out.println(nome1.equals(nome2)); // compara os textos
//        System.out.println(nome1.equalsIgnoreCase(nome2)); // compara os textos sem ser case sensitive
//        System.out.println("texto".equals("texto2") && "texto2".equals("texto3"));// comparando 3 textos ou mais

        Scanner scanner = new Scanner(System.in);

        String texto = "Vamos para o break, retorno 10:35";
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()){ //verifica se está vazio
            System.out.println("Conteúdo vazio");
        }
        else if(texto.contains(palavra)) {
            System.out.println("Contém");
        }
        else {
            System.out.println("Não contém");
        }
//        System.out.println(" ".isEmpty());//considera os espaços
    }
}
