package Aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Listas {
    public static void main(String[] args) {
        // Lista é flexível, diferente dos vetores

        // generic -> <String>
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(9);
        lista.add(4);
        lista.add(5);
        lista.add(8);

        System.out.println(lista.get(2));
        lista.remove(2);
        System.out.println(lista.get(2));
        lista.add(2,5);
        System.out.println(lista.get(2));

        System.out.println();

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println();

        for (Integer numero : lista) {
            System.out.println(numero);
        }

        List<String> pessoas = new ArrayList<String>(List.of("Nick", "Alvi", "Bella", "Hope", "Tony"));
        Collections.sort(pessoas);

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
