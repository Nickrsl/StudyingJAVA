public class Variaveis {
    // variável = container de dados
    // JAVA linguagem fortemente tipada
    public static void main(String[] args){
        // para definir uma variavel:
        // <tipo> <nome> = <valor>;

        // tipos primitivos: int, long, char, boolean, double, float
        // tipos não-primitivos: String, List

        // Como declarar variáveis?
        int estoque = 150; // até 2bi
        // L ou l = sufixo(após o valor) para representar long
        long populacaoTerra = 8000000000l; // até a casa dos quintilhões
        double salariodev = 5500.99; // até 15 casas decimais de precisão
        // F ou f = sufixo(após o valor) para representar float
        float nota = 8.75f; // até 7 casas decimais de precisão
        boolean ativo = true; // true, false
        String nome = "Nick"; // usamos aspas duplas sempre
        char letra = 'A'; // apenas um caracter - aspas simples- pouco utilizado

        // Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição
        // a = 7.5f ou "batata"; // impossível atribuir outro tipo


        System.out.println("Estoque: " + estoque);
        System.out.println("População da Terra: " + populacaoTerra);
    }
}
