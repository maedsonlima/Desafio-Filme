package Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Auto da Cumpadecida 2", 2002);
        meuFilme.avalia(9);
        Filme meuFilme2 = new Filme("A jaca caiu", 2021);
        meuFilme2.avalia(10);
        var filmeMaedson = new Filme ("Naruto", 2005);
        filmeMaedson.avalia(6);
        Serie lost = new Serie ("Lost", 2000);
        lost.avalia(10);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeMaedson);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme)
                System.out.println("Classificação" + filme.getClassificacao());
        }



        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Bruno");
        buscaPorArtista.add("Daniel");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Aline");
        System.out.println(buscaPorArtista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);


        Collections.sort(lista);
        System.out.println(lista);




    }
}
