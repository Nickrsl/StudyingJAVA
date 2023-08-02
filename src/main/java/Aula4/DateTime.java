package Aula4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println("Ano: " + dataHoraAtual.getYear());
        System.out.println("Mês: " + dataHoraAtual.getMonth());
        System.out.println("Dia do mês: " + dataHoraAtual.getDayOfMonth());
        System.out.println("Dia da semana: " + dataHoraAtual.getDayOfWeek());

        int ano = 2023;
        int mes = 8;
        int dia = 1;
        LocalDate data = LocalDate.of(2024, mes,dia);

        if (hoje.isAfter(data)) {//tbm tem .isBefore
            System.out.println("A data "+ data + " já passou");
        } else {
            System.out.println("A data "+ data + " ainda não passou");
        }

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("EE/MM/yyyy HH:mm:ss");
        //yy -> 23 ao inves de 2023
        //MMM -> mês por extenso abreviado
        //MMMM -> mês por extenso
        //EE no lugar de dd -> dia da semana
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr);
        System.out.println(dataHoraAtualFormatada);

        String dataString = "2023-07-14";
        LocalDate dataValida = LocalDate.parse(dataString); // instância
        System.out.println(dataValida);
    }
}
