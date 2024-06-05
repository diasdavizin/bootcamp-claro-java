package sistema_smart_tv_metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{

        // Exemples of Methods in Java.


        /* Let's create an example of a class to represent a SmartTV where:
        1. It has the characteristics: on (boolean), channel (int) and volume (int);
        2. Our TV will be able to turn on and off and thus change its on state;
        3. Our TV will always increase and decrease the volume by +1 or -1;
        4. Our TV will be able to change channels 1 by 1 or by setting the corresponding number.
        */

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("O novo canal é o: " + smartTv.canal);

        System.out.println("O volume atual é de: " + smartTv.volume);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual: " + smartTv.canal);
        System.out.println("Qual o volume atual: "+ smartTv.volume);


        smartTv.ligar ();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume ();
        System.out.println("Novo status -> O volume aumentou para: " + smartTv.volume);

        smartTv.diminuirVolume ();
        System.out.println("Novo status -> O volume diminuiu para: " + smartTv.volume);

    }
}
