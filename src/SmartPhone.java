public class SmartPhone implements AparelhoTelefonico, NavegadorInternet {

    private String numeroTelefone;
    private String url;
    private String[] historico;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a página "+url+" no SmartPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no SmartPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no SmartPhone.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo uma ligação pelo SmartPhone para o número "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Aterndendo ligação no SmartPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no SmartPhone");
    }
    
    
}
