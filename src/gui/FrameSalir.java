package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSalir extends JFrame implements ActionListener {


    blackjack frame;
    int balance;
    private JButton rejugarButton;
    private JButton salirButton;
    private JLabel textoSalida;


    public FrameSalir(int balance, blackjack frame) {
        super("Frame de salida");
        this.balance = balance;
        this.frame = frame;

        this.setUndecorated(true);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 1));

        salirButton = new JButton("No");
        salirButton.addActionListener(this);
        panel.add(salirButton);

        rejugarButton = new JButton("Si");
        rejugarButton.addActionListener(this);
        panel.add(rejugarButton);

        textoSalida = new JLabel("Quieres volver a jugar?");
        add(textoSalida, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);


        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==salirButton){
            System.exit(0);

        }
        if (e.getSource()==rejugarButton){
            frame.dispose();
            new blackjack(balance);
        }
    }
}
