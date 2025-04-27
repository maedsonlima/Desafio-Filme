package br.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

//
//    public void inclui (Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo) {
          this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
