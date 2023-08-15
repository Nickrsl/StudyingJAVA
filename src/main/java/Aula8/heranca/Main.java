package Aula8.heranca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.5F, "1579563");
        System.out.println(batata.getCodigo());
        System.out.println(batata.getNome());
        System.out.println(batata.getPreco());

        Livro cleanCode = new Livro ("Clean Code", 50.9F, "17492897", 300, "123.123.123.123");
        System.out.println(cleanCode.getCodigo());
        System.out.println(cleanCode.getNome());
        System.out.println(cleanCode.getPreco());
        System.out.println(cleanCode.getNumPaginas());
        System.out.println(cleanCode.getIsbn());

        Comida tapioca = new Comida ("Tapioca", 5.75F, "16349272", LocalDate.of(2023,8,31), 35.8F);
        System.out.println(tapioca.getCodigo());
        System.out.println(tapioca.getNome());
        System.out.println(tapioca.getPreco());
        System.out.println(tapioca.getPrazoDeValidade());
        System.out.println(tapioca.getCaloria());

        Carne picanha = new Carne ("Picanha", 100.0F, "5342746", LocalDate.of(2023,8,21), 350.4F, "Bovina");
        System.out.println(picanha.getCodigo());
        System.out.println(picanha.getNome());
        System.out.println(picanha.getPreco());
        System.out.println(picanha.getPrazoDeValidade());
        System.out.println(picanha.getCaloria());
        System.out.println(picanha.getCategoria());
    }
}
