public class Phone implements AparelhoTelefonico {

    private String numeroTelefone;

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo uma ligação pelo Phone para o número "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Aterndendo ligação no Phone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Phone");
    }
    
}
