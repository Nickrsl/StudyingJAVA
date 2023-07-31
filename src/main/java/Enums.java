// Enumeração - todos os atributos em letras maiúsculas
enum AccessLevel {
    COMUM, USUARIO, ADMINISTRATOR
}

// Criação de mais de uma class no mesmo arquivo
class Pessoa {
    String nome;
    int idade;
    AccessLevel accessLevel;

    public Pessoa(String nome, int idade, AccessLevel accessLevel) {
        this.nome = nome;
        this.idade = idade;
        this.accessLevel = accessLevel;
    }
}
public class Enums {
    public static void main(String[] args) {
    Pessoa Nick = new Pessoa("Nick", 18, AccessLevel.USUARIO);

        if(Nick.accessLevel == AccessLevel.ADMINISTRATOR) {
            System.out.println("Tudo liberado!");
        } else if (Nick.accessLevel == AccessLevel.USUARIO) {
            System.out.println("Apenas a área privada liberada!");
        } else if (Nick.accessLevel == AccessLevel.COMUM) {
            System.out.println("Apenas a área pública liberada!");
        }
    }
}
