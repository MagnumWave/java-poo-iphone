public class IPod implements ReprodutorMusical {

    private int[] listaDeMusica;
    private int musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo iPod.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música do iPod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música do iPod");
    }
    
}
