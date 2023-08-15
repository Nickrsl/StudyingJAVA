package Aula6;

public class Modificadores {
    // Acesso:
    // public -> pode ser acessado fora da classe e pacote que foi definido
    // private -> acessado apenas pela própria classe
    // protected -> a própria classe ou filhos podem acessá-lo
    // default (padrão) -> Pode ser acessado apenas por classes dentro do pacote em que foi definido

    // Não acesso:
    // static -> não pertence ao objeto, pertence a classe, é membro dela, ou seja, não precisa de instância
    // final -> Definir uma constante
    // Escapsulamento -> Garantir a consistência dos dados de uma classe

    public static final double PI = 3.1415; // criar uma constante
    public static void main(String[] args) {
        //Cliente.validarEmail("gabriel@mail.com");

        Cliente maria = new Cliente("Maria", 25, 1.70);
        maria.setNome("Maria de Fátima");
        System.out.println(maria.getNome());
        System.out.println(maria.getIdade());
        System.out.println(maria.getDataNascimento());
        System.out.println(maria.getAltura());
        System.out.println(maria.getCpf());
        Cliente joao = new Cliente("João", 21, 1.65);
        joao.setEmail("joao@mail.com");
    }
}
