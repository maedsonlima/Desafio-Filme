package exercicios;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "Rap do zodiáco";
        musica1.artista = "Bruno e Marrone";
        musica1.anoLancamento = 2021;

       musica1.exibeFichaTecnica();

       musica1.avaliacao(10);
       musica1.avaliacao(15);
       musica1.avaliacao(4);

        System.out.println(musica1.somaDasAvaliacoes);
    }
}
