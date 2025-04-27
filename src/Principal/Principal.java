package Principal;

import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Auto da Cumpadecida 2", 2002);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.setDiretor("Amado Batista");

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.getDiretor());

        Filme meuFilme2 = new Filme("A jaca caiu", 2021);
        meuFilme2.setDuracaoEmMinutos(300);
        meuFilme2.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo ();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());

        Serie lost = new Serie ("Lost", 2000);
        lost.avalia(10);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setAtivar(true);
        lost.setEpisodiosPorTemporadas(24);
        lost.setMinutosPorEpisodio(40);

        calculadora.inclui(lost);

        Episodio episodio = new Episodio ();
        episodio.setNumero(1);
        episodio.setSerie(lost);

        var filmeMaedson = new Filme ("Naruto", 2005);
        filmeMaedson.setDuracaoEmMinutos(200);
        filmeMaedson.avalia(10);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(filmeMaedson);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        System.out.println("Duração para Maratonar Lost: " + lost.getDuracaoEmMinutos());

        System.out.println(" O tempo para maratonar tudo é de " + calculadora.getTempoTotal());


        System.out.println("Tamanho da lista " + lista.size());
        System.out.println("Primeiro filme " + lista.get(0).getNome());

    }

}
