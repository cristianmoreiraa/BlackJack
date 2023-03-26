
package gui;


import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JFrame implements ActionListener {

    private JButton jButton1;
    private Log logFrame;

    public Info(Log logFrame ) {

        this.logFrame=logFrame;

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

        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1333, 854));

        jButton1.setIcon(new ImageIcon("src/cartas/infoblack.png"));
        jButton1.addActionListener(this);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 1333, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 854, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 273, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jButton1){
            this.dispose();
            logFrame.setExtendedState(JFrame.NORMAL);

        }
    }

}
