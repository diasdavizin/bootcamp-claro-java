package sistema_smart_tv_metodos;

public class SmartTv {

    // Exemples of Methods in Java.

    /* Let's create an example of a class to represent a SmartTV where:
    1. It has the characteristics: on (boolean), channel (int) and volume (int);
    2. Our TV will be able to turn on and off and thus change its on state;
    3. Our TV will always increase and decrease the volume by +1 or -1;
    4. Our TV will be able to change channels 1 by 1 or by setting the corresponding number.
    */

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
