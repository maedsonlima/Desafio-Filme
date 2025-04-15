import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Auto da Cumpadecida 2");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.setDiretor("Amado Batista");

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.getDiretor());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("A jaca caiu");
        meuFilme2.setAnoDeLancamento(2021);
        meuFilme2.setDuracaoEmMinutos(300);
        meuFilme2.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo ();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());



        Serie lost = new Serie ();
        lost.avalia(10);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);




        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setAtivar(true);
        lost.setEpisodiosPorTemporadas(24);
        lost.setMinutosPorEpisodio(40);

        System.out.println("Duração para Maratonar Lost: " + lost.getDuracaoEmMinutos());


    }

}