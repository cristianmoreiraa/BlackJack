
package BlackJack;


public class Cartas {

    private char symbol;  //23456789TJQKA T=10
    private char type;    //Diamantes - Treboles - Picas - Corazones

    public void setSymbol(char s) {
        this.symbol = s;
    }

    public void setType(char t) {
        this.type = t;
    }

    public char getSymbol() {
        return symbol;
    }

    public char getType() {
        return type;
    }

    public int getValue() {
        if (this.symbol == 'T') return 10;
        else if (this.symbol == 'J') return 11;
        else if (this.symbol == 'Q') return 12;
        else if (this.symbol == 'K') return 13;
        else if (this.symbol == 'A') return 1 ;
        else return Integer.parseInt(this.symbol+"");
    }

    @Override
    public String toString() {
        return this.symbol+""+this.type;
    }

}

