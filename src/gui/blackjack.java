
package gui;


import BlackJack.Apuestas;
import BlackJack.Cartas;
import BlackJack.Mano;
import BlackJack.Mazo;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class blackjack extends JFrame implements ActionListener {

    Mazo d = new Mazo();
    Mano cartaOponente = new Mano();
    Mano cartaPropias = new Mano();
    Apuestas game = new Apuestas();

    int ncartas=0;
    int ccartas=0;

    private int bancoPropio; // Creamos un juego con un saldo inicial de $10000
    private int cantidadApostar;
    private int nuevoBancoPropio;

    private Cartas c1;
    private Cartas c2;
    private Cartas c3;
    private Cartas c4;
    private Cartas j1;
    private Cartas j2;
    private Cartas j3;
    private Cartas j4;


    private JButton Pedir;
    private JButton Plantarse1;
    private JLabel apostar;
    private JLabel background;
    private JLabel banco;
    private JTextField cApostar;
    private JLabel cc1;
    private JLabel cc2;
    private JLabel cc3;
    private JLabel cc4;
    private JLabel crupier;
    private JLabel ficha;
    private JScrollPane info;
    private JPanel jPanel1;
    private JTextArea jTextArea1;
    private JLabel jc1;
    private JLabel jc2;
    private JLabel jc3;
    private JLabel jc4;
    private JLabel logo;

    public blackjack(int balance) {
        this.bancoPropio=balance;
        initComponents();

    }

    public void initComponents(){


        jPanel1 = new JPanel();
        jc3 = new JLabel();
        jc1 = new JLabel();
        jc4 = new JLabel();
        cc3 = new JLabel();
        cc4 = new JLabel();
        cc2 = new JLabel();
        cc1 = new JLabel();
        jc2 = new JLabel();
        logo = new JLabel();
        apostar = new JLabel();
        crupier = new JLabel();
        info = new JScrollPane();
        jTextArea1 = new JTextArea();
        cApostar = new JTextField();
        banco = new JLabel();
        Pedir = new JButton();
        ficha = new JLabel();
        Plantarse1 = new JButton();
        background = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new Dimension(1333, 854));
        setSize(new Dimension(1333, 854));
        setResizable(false);

        // Obtener el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcular la posición para centrar el JFrame
        int posX = (pantalla.width - this.getWidth()) / 2;
        int posY = (pantalla.height - this.getHeight()) / 2;

        // Establecer la posición del JFrame
        this.setLocation(posX, posY);

        jPanel1.setLayout(new AbsoluteLayout());


        jPanel1.add(jc3, new AbsoluteConstraints(350, 440, 125, 194));


        jPanel1.add(jc1, new AbsoluteConstraints(530, 490, 125, 194));


        jPanel1.add(jc4, new AbsoluteConstraints(920, 440, 125, 194));


        jPanel1.add(cc3, new AbsoluteConstraints(920, 160, 125, 194));


        jPanel1.add(cc4, new AbsoluteConstraints(350, 150, 125, 194));


        jPanel1.add(cc2, new AbsoluteConstraints(530, 80, 125, 194));


        jPanel1.add(cc1, new AbsoluteConstraints(740, 80, 125, 194));


        jPanel1.add(jc2, new AbsoluteConstraints(740, 490, 125, 194));


        jPanel1.add(logo, new AbsoluteConstraints(620, 290, 140, 140));

        apostar.setFont(new Font("Tahoma", 1, 24));
        apostar.setText("Introduce tu apuesta");
        apostar.setForeground(new Color(255, 255, 255));
        apostar.setToolTipText("Apostar");
        jPanel1.add(apostar, new AbsoluteConstraints(1060, 370, 270, 50));

        crupier.setFont(new Font("Tahoma", 1, 36));
        crupier.setForeground(new Color(255, 255, 255));
        crupier.setText("Crupier");
        jPanel1.add(crupier, new AbsoluteConstraints(620, 0, 160, 90));

        info.setBackground(new Color(0, 102, 0));
        info.setForeground(new Color(255, 255, 255));
        info.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new Color(0, 102, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Tahoma", 1, 14));
        jTextArea1.setForeground(new Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.append("Introduce tu apuesta en el panel de la derecha.\nY presiona ENTER para empezar.");
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        info.setViewportView(jTextArea1);

        jPanel1.add(info, new AbsoluteConstraints(40, 20, 260, 200));

        cApostar.setBackground(new Color(0, 102, 0));
        cApostar.setFont(new Font("Tahoma", 1, 28));
        cApostar.addActionListener(this);
        jPanel1.add(cApostar, new AbsoluteConstraints(1120, 430, 150, 50));

        banco.setFont(new Font("Tahoma", 1, 24));
        banco.setText(String.valueOf(bancoPropio));
        banco.setForeground(new Color(255, 255, 255));
        jPanel1.add(banco, new AbsoluteConstraints(70, 690, 90, 40));

        Pedir.setBackground(new Color(255, 255, 255));
        Pedir.setFont(new Font("Tahoma", 1, 36));
        Pedir.setForeground(new Color(255, 0, 0));
        Pedir.setText("Pedir ");
        Pedir.addActionListener(this);
        Pedir.setEnabled(false);
        jPanel1.add(Pedir, new AbsoluteConstraints(460, 730, 210, 70));

        ficha.setIcon(new ImageIcon("src/cartas/fichas.png"));
        jPanel1.add(ficha, new AbsoluteConstraints(30, 630, 160, 160));

        Plantarse1.setBackground(new Color(255, 255, 255));
        Plantarse1.setFont(new Font("Tahoma", 1, 36));
        Plantarse1.setForeground(new Color(255, 0, 0));
        Plantarse1.setText("Plantarse\n");
        Plantarse1.addActionListener(this);
        Plantarse1.setEnabled(false);
        jPanel1.add(Plantarse1, new AbsoluteConstraints(740, 730, 210, 70));

        background.setIcon(new ImageIcon("src/cartas/background.png"));
        jPanel1.add(background, new AbsoluteConstraints(0, 0, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1009, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cApostar){
            int cantidadApuesta=Integer.parseInt(cApostar.getText());
            if (cantidadApuesta<=bancoPropio){
                cantidadApostar=cantidadApuesta;
                game();
            }else{
                jTextArea1.append("\n¡No tienes suficiente dinero!.\n");
            }
        }
        if (e.getSource()== Pedir) {
            if (ncartas == 2) {
                j3 = d.getCartas();
                cartaPropias.añadirCarta(j3);
                jc3.setIcon(new ImageIcon("src/cartas/" + j3.toString() + ".png"));
                ncartas=3;
            } else if (ncartas == 3) {
                j4 = d.getCartas();
                cartaPropias.añadirCarta(j4);
                jc4.setIcon(new ImageIcon("src/cartas/" + j4.toString() + ".png"));
            }else {
                endGame();
            }
            jTextArea1.append("\nValor de tus cartas: "+cartaPropias.getValue()+"\n");
            if (cartaPropias.getValue()>21){
                endGame();
            }
        }
        if (e.getSource()==Plantarse1){
            endGame();
        }
    }

    public void game(){
        d.crearCartas();

        jTextArea1.append("\nApuesta:"+cantidadApostar+"\n");

        c1=d.getCartas();
        c2=d.getCartas();
        j1=d.getCartas();
        j2=d.getCartas();

        cartaOponente.añadirCarta(c1);
        cartaOponente.añadirCarta(c2);
        ccartas=2;
        cartaPropias.añadirCarta(j1);
        cartaPropias.añadirCarta(j2);
        ncartas=2;



        if (cartaOponente.getValue() <= 16) {
            c3=d.getCartas();
            cartaOponente.añadirCarta(c3);
            ccartas=3;
        }
        if (cartaOponente.getValue() <= 16) {
            c4=d.getCartas();
            cartaOponente.añadirCarta(c4);
            ccartas=4;
        }

        jc1.setIcon(new ImageIcon("src/cartas/"+j1.toString()+".png"));
        jc2.setIcon(new ImageIcon("src/cartas/"+j2.toString()+".png"));

        jTextArea1.append("\nValor de tus cartas: "+cartaPropias.getValue()+"\n");

        Pedir.setEnabled(true);
        Plantarse1.setEnabled(true);

        if (cartaPropias.getValue() > 21) {
            endGame();
        }

    }

    public void endGame(){
        Plantarse1.setEnabled(false);
        Pedir.setEnabled(false);
        cc1.setIcon(new ImageIcon("src/cartas/"+c1.toString()+".png"));
        cc2.setIcon(new ImageIcon("src/cartas/"+c2.toString()+".png"));
        if (ccartas==3){
            cc3.setIcon(new ImageIcon("src/cartas/"+c3.toString()+".png"));
        }
        if (ccartas==4){
            cc4.setIcon(new ImageIcon("src/cartas/"+c4.toString()+".png"));
        }

        if (cartaPropias.getValue() > 21) {
            nuevoBancoPropio = (bancoPropio - cantidadApostar);
            banco.setText(String.valueOf(nuevoBancoPropio));
            jTextArea1.append("\nValor de las cartas del crupier: "+ cartaOponente.getValue()+"\n"+game.perder());

        } else if (cartaOponente.getValue() > 21) {
            nuevoBancoPropio = bancoPropio + (cantidadApostar*2);
            banco.setText(String.valueOf(nuevoBancoPropio));
            jTextArea1.append("\nValor de las cartas del crupier: "+ cartaOponente.getValue()+"\n"+game.ganar());

        } else if (cartaOponente.getValue() < cartaPropias.getValue()) {
            nuevoBancoPropio = bancoPropio + (cantidadApostar*2);
            banco.setText(String.valueOf(nuevoBancoPropio));
            jTextArea1.append("\nValor de las cartas del crupier: "+ cartaOponente.getValue()+"\n"+game.ganar());

        } else if (cartaOponente.getValue() > cartaPropias.getValue()) {
            nuevoBancoPropio = bancoPropio - cantidadApostar;
            banco.setText(String.valueOf(nuevoBancoPropio));
            jTextArea1.append("\nValor de las cartas del crupier: "+ cartaOponente.getValue()+"\n"+game.perder());

        } else {
            nuevoBancoPropio = bancoPropio;
            jTextArea1.append("\nValor de las cartas del crupier: "+ cartaOponente.getValue()+"\n"+game.empatar());

        }
        new FrameSalir(nuevoBancoPropio,this);
    }
}


