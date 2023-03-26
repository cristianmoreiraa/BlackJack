
package BlackJack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Mazo {

    BlackJack.Cartas cartas [] = new BlackJack.Cartas[52];
    int posicion;

    public void crearCartas() {
        String symbols = "23456789TJQKA";
        String type = "DTPC";
        int index = 0;

        for(int i=0; i < type.length(); i++) {
            for(int j=0; j<symbols.length(); j++) {
                Cartas tempCard = new Cartas();
                tempCard.setSymbol(symbols.charAt(j));
                tempCard.setType(type.charAt(i));
                this.cartas[index] = tempCard;
                index++;
            }

        }
        shuffleCards();
    }

    private void shuffleCards() {

        Collections.shuffle(Arrays.asList(this.cartas));

    }

    public Cartas getCartas() {
        if (posicion == 51) {
            System.out.println("No hay mas cartas para repartir");
            return null;
        }
        Cartas tempCartas=this.cartas[posicion];
        posicion ++;
        return tempCartas;
    }

}
