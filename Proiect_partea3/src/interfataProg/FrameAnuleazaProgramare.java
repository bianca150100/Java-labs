package interfataProg;

import javax.swing.*;
import java.awt.*;

public class FrameAnuleazaProgramare extends JFrame {

    private JPanel mainPanel;
    private JLabel nrProg;
    private JTextField nr;

    private JButton anuleazaProg;

    public FrameAnuleazaProgramare()
    {
        initComponents();
    }

    private void initComponents() {

        setLayout(new FlowLayout());
        mainPanel = new JPanel(new FlowLayout());
        nrProg = new JLabel("Numar Programare:");
        nr = new JTextField(13);


        JPanel mainP =new JPanel(new FlowLayout());
        anuleazaProg= new JButton("Anuleaza programare!");
        mainP.add(nrProg);
        mainP.add(nr);


        mainP.add(Box.createRigidArea(new Dimension(10,20)));
        mainP.add(anuleazaProg);

        mainP.setLayout(new GridLayout(3, 1));
        mainPanel.add(mainP);
       // mainPanel.add(nrProg);

        // mainPanel.add(buttonMedic);
        //add(mainPanel);
        // add(new JScrollPane(mainPanel), BorderLayout.CENTER);




    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getNr() {
        return nr;
    }

    public JButton getAnuleazaProg() {
        return anuleazaProg;
    }
}
