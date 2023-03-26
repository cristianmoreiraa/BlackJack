package BlackJack;

import java.util.Scanner;
import BlackJack.Cartas;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Apuestas {

    public Apuestas (){

    }

    // Método para realizar la apuesta y que nos quite de las fichas


    public String ganar() {
        return ("\nHas ganado\n");
    }

    public String perder(){

        return ("\nHas perdido\n");

    }
    public String  empatar(){
        return ("\nHabéis empatado\n");
    }



}