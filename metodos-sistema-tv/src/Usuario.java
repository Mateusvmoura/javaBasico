public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Voluma atual : " + +smartTv.volume);

        smartTv.ligar();
        System.out.println("- NOVO STATUS - TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("- NOVO STAUTS - Volume atual : " + smartTv.volume);

        smartTv.mudarCanal(12);
        System.out.println("- NOVO STAUTS - Canal atual : " + smartTv.canal);
    }
}
