import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Holyday> holydayList = new ArrayList<>();

        holydayList.add(new Holyday("01/01/2023", "Confraternização mundial"));
        holydayList.add(new Holyday("21/02/2023", "Carnaval"));
        holydayList.add(new Holyday("17/04/2023", "Páscoa"));
        holydayList.add(new Holyday("21/04/2023", "Tiradentes"));
        holydayList.add(new Holyday("01/05/2023", "Dia do trabalho"));
        holydayList.add(new Holyday("08/06/2023", "Corpus Christi"));
        holydayList.add(new Holyday("07/09/2023", "Independência do Brasil"));
        holydayList.add(new Holyday("12/10/2023", "Nossa Senhora Aparecida"));
        holydayList.add(new Holyday("02/11/2023", "Finados"));
        holydayList.add(new Holyday("15/11/2023", "Proclamação da República"));
        holydayList.add(new Holyday("25/12/2023", "Natal"));

        buscaFeriado("25/12/2023", holydayList);
        buscaFeriado("20/12/2023", holydayList);
        buscaFeriado("07/09/2023", holydayList);
        buscaFeriado("10/01/2023", holydayList);
        buscaFeriado("13/10/2023", holydayList);
        buscaFeriado("12/10/2023", holydayList);
        buscaFeriado("08/06/2023", holydayList);
        buscaFeriado("17/04/2023", holydayList);
        buscaFeriado("11/06/2023", holydayList);
        buscaFeriado("22/01/2023", holydayList);
        buscaFeriado("01/01/2023", holydayList);

        listaFeriados(holydayList);

    }

    private static void buscaFeriado(String data, List<Holyday> list) {

        Holyday currentHolyday = list.stream().filter(holyday -> holyday.date.equals(data)).findFirst().orElse(null);

        if (currentHolyday != null)
            System.out.println("A data " + data + " corresponde ao feriado de " + currentHolyday.name);
        else
            System.out.println(
                    "Não existe nenhum feriado para a data " + data);
    }

    private static void listaFeriados(List<Holyday> lista) {

        String mensagem = "\n\nA lista de feriados é a seguinte: \n";

        for (Holyday h : lista) {
            mensagem += h.date + ":   " + h.name + "\n";
        }
        System.out.println(mensagem);
    }

}
