public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private int[] listaDeMusica;
    private int musicaAtual;
    private String numeroTelefone;
    private String url;
    private String[] historico;

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música do iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música do iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a página "+url+" no iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no iPhone.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo uma ligação pelo iPhone para o número "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Aterndendo ligação no iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }
    
}
