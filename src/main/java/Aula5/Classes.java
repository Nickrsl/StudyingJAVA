package Aula5;
//POO (Programação Orientada a Objetos)
//Classes -> Fruta (Modelagem)
//Objetos -> Maçã, Pera, Banana, Goiaba
//Intância -> Processo de constução de um objeto a partir de uma classe
//Atributo ou Propriedade -> valor definido na classe, incorparado no objeto (acessamos por meio do .)
//Método/Função -> rotina/procedimento/tarefa executada pelo objeto
public class Classes {
    public static void main(String[] args) {
        Fruta maca = new Fruta();
        maca.nome = "Maçã";
        maca.cor = "Vermelha";
        maca.acidez = 7;
        maca.suculencia = true;
        maca.amadurecer(37);
        maca.vitaminas = new String[3];
        maca.vitaminas[0] = "Vitamina A";
        maca.vitaminas[1] = "Vitamina D";
        maca.vitaminas[2] = "Vitamina G";

        System.out.println(maca.madura);

        System.out.println(maca);
    }
}
