public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        smartTv.diminuirCanal();
        smartTv.trocarCanal(12);

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.volume); 
        System.out.println("Volume atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("TV está ligada? " + smartTv.ligada);
    }
}
