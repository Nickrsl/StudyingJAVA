package Aula3;

public class Metodos {
    // Aula3.Metodos/Funções -> estruturas que executam uma determinada tarefa/atividade

    public String bemVindo(){
        return "Bem-vindo!";
    }//sem parametros e com retorno

    public void imprimir(String texto) {
        System.out.println(texto);
    }//com parametro e sem retorno(void)

    public static double soma (double n1, double n2, double n3) {
        double s = n1 + n2 + n3;
        return s;
    }//com parametro e com retorno

    public static void main(String[] args) {
        double resultado = soma(12.5, 5.8, 4.5);
        System.out.println(resultado);
    }
}