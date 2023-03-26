
package gui;

import com.cristian.datos.PedirDatos;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log extends JFrame implements ActionListener {

    private JPasswordField contraseña;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField usuario;

    String user;
    String pwd;
    FileWriter ou=null;
    PrintWriter fich=null;



    public Log() {

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

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        jButton2 = new JButton();
        usuario = new JTextField();
        contraseña = new JPasswordField();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1333, 854));

        jPanel1.setLayout(new AbsoluteLayout());

        jButton1.setBackground(new Color(255, 255, 255));
        jButton1.setFont(new Font("Tahoma", 1, 48));
        jButton1.setForeground(new Color(255, 0, 0));
        jButton1.setText("INFO");
        jButton1.addActionListener(this);
        jPanel1.add(jButton1, new AbsoluteConstraints(100, 420, 260, 80));

        jLabel3.setFont(new Font("Tahoma", 1, 24));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("usuario");
        jPanel1.add(jLabel3, new AbsoluteConstraints(100, 30, 170, 70));

        jLabel2.setFont(new Font("Tahoma", 1, 24));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("contraseña");
        jPanel1.add(jLabel2, new AbsoluteConstraints(100, 150, 170, 70));

        jButton2.setBackground(new Color(255, 255, 255));
        jButton2.setFont(new Font("Tahoma", 1, 48));
        jButton2.setForeground(new Color(255, 0, 0));
        jButton2.setText("START");
        jButton2.addActionListener(this);
        jPanel1.add(jButton2, new AbsoluteConstraints(100, 310, 260, 80));

        usuario.setBackground(new Color(204, 204, 204));
        usuario.setFont(new Font("Tahoma", 0, 20));
        usuario.setForeground(new Color(0, 0, 0));
        usuario.addActionListener(this);
        jPanel1.add(usuario, new AbsoluteConstraints(100, 80, 260, 50));

        contraseña.setBackground(new Color(204, 204, 204));
        contraseña.setForeground(new Color(0, 0, 0));
        contraseña.addActionListener(this);
        jPanel1.add(contraseña, new AbsoluteConstraints(100, 200, 260, 50));

        jLabel1.setIcon(new ImageIcon("src/cartas/shutterstock_1715167144-1-994x559.jpg"));
        jPanel1.add(jLabel1, new AbsoluteConstraints(0, 0, 1333, 854));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 854, GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton1){
            this.setExtendedState(JFrame.ICONIFIED);
            new Info(this);
        }
        if (e.getSource()==jButton2){
            user= usuario.getText();
            pwd = String.valueOf(contraseña.getPassword());
            if (!user.isEmpty()) {
                nombreUsuario(new File("fichero.txt"));
                new blackjack(10000);
                this.dispose();
            }
        }
    }

    public void nombreUsuario(File fichero){
        String nombre= "Username: ";
        String contraseña= "\nPassword: ";
        try{
            ou = new FileWriter (fichero);
            fich = new PrintWriter(ou);
            fich.write(nombre);
            fich.print(user);
            fich.write(contraseña);
            fich.println(pwd);


        }catch (IOException ex){
            System.out.println("Error de escritura" + ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
}