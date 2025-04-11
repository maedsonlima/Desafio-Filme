public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = " O Alto da Cumpadecida 2";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.totalDeAvaliacoes = 20;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
    }

}