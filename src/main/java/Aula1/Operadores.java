package Aula1;

public class Operadores {
    public static void main (String[] args){
        // Aula1.Operadores matemáticos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = b / a; // divisão entre dois int = int

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        //Divisão do jeito correto -> basta que um deles seja double
        int c = 15;
        double d = 10;
        double divisao2 = c / d;
        System.out.println("Divisão: " + divisao2);

        // Math
        double x = Math.pow(2, 3); // potência (base, expoente)
        double y = Math.sqrt(144); // raiz
        System.out.println(Math.PI);

        // Incremento/Decremento
        int valor = 5;
        ++valor; // pré incremento
        --valor; // pré decremento
        valor++; // valor = valor + 1
        valor--; // valor = valor - 1
        valor += 10; // valor = valor + 10
        valor -= 10; // valor = valor -10



        // Aula1.Operadores relacionais (<, >, ==, <=, >=, !=)
        boolean teste1 = 10 > 5; // true
        boolean teste2 = 11 < 1; // false
        boolean teste3 = 5 == 5; // true
        boolean teste4 = 4 != 5; // true
        boolean teste5 = 5 >= 5; // true
        boolean teste6 = 6 <= 8; // true


        // Aula1.Operadores lógicos (&&, ||, !)
        boolean teste7 = true && false; // false
        boolean teste8 = true || false; // true
        boolean teste9 = (5 > 10) && (1 < 5); // false
        boolean teste10 = (10 >= 0) || (1 < 5); // true
        boolean teste11 = !teste1; // false

        // Exercício
        // Calcule o IMC e mostre na tela (peso/(altura*altura))
        double altura = 1.6;
        double peso = 48.4;
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("IMC= " + IMC);
    }
}
