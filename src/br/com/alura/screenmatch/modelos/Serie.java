package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativar;
    private int minutosPorEpisodio;


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public boolean isAtivar() {
        return ativar;
    }

    public void setAtivar(boolean ativar) {
        this.ativar = ativar;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }
}


