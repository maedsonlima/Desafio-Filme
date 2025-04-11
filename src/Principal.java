public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = " O Alto da Cumpadecida 2";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);

        System.out.println(meuFilme.pegaMedia());
    }

}