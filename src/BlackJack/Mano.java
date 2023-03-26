
package BlackJack;

import java.util.ArrayList;
import BlackJack.Mano;

public class Mano  {

    ArrayList<Cartas> arr = new ArrayList<Cartas>();
    int posicion = 0;

    public void añadirCarta(Cartas c){
        arr.add(c);
    }

    public String toString() {
        String mano="";
        for(int i=0; i<arr.size(); i++){
            mano += arr.get(i).toString() + " ";
        }

        return mano;

    }

    public int getValue(){

        int val=0;
        boolean ace=false;

        for (int i=0; i < arr.size(); i++){

            Cartas temCartas = arr.get(i);
            int cardValue = temCartas.getValue();
            if(cardValue>10) //es una J,Q,K
                cardValue=10;
            if(cardValue==1) //es un A
                ace=true;

            val += cardValue;

        }

        if (ace == true && val + 10 <=21 )
            val = val +10;

        return val;

    }
}

