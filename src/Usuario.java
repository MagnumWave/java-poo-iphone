public class Usuario {
    public static void main(String[] args) throws Exception {

        IPhone iPhone = new IPhone();

        IPod iPod = new IPod();
        Phone dumbPhone = new Phone();
        SmartPhone smartPhone = new SmartPhone();

        iPod.tocar();
        iPhone.tocar();

        System.out.println("-------------");

        dumbPhone.atender();
        smartPhone.atender();
        iPhone.atender();
        iPhone.ligar("269-6969");

        System.out.println("-------------");

        smartPhone.atualizarPagina();
        iPhone.atualizarPagina();
        iPhone.exibirPagina("web.dio.me");
        
    }
}
