package Aula5;

public class Fruta {
   String nome;
   String cor;
   float acidez;
   boolean suculencia;
   boolean madura = false;
   String[] vitaminas;
   void amadurecer(int dias) {
      madura = true;
   }
}
