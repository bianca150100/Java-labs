package interfataProg;

import javax.swing.*;
import java.awt.*;

public class FrameModificaProgramare extends JFrame {
    private JPanel mainPanel;
    private JLabel nrProg;
    private JLabel ziProg;
    private JLabel lunaProg;
    private JLabel oraProg;
    private JLabel indiceMedic;
    private JTextField zi;
    private JTextField luna;
    private JTextField ora;
    private JTextField indice;
    private JTextField nr;

    private JButton modificaProg;

    public FrameModificaProgramare()
    {
        initComponents();
    }

    private void initComponents() {

        setLayout(new FlowLayout());
        mainPanel = new JPanel(new FlowLayout());
        nrProg = new JLabel("Numar Programare:");
        ziProg = new JLabel("Zi dorita:");
        lunaProg = new JLabel("Luna dorita:");
        oraProg = new JLabel("Ora dorita:");
        indiceMedic = new JLabel("Aveti prog la medicul:");
        nr = new JTextField(13);
        zi  =new JTextField(13);
        luna = new JTextField(13);
        ora = new JTextField(13);
        indice = new JTextField(13);

        //buttonMedic = new JButton("Adauga medicament!");

        JPanel mainP =new JPanel(new FlowLayout());
        modificaProg= new JButton("Modifica programare!");
        mainP.add(nrProg);
        mainP.add(nr);
        mainP.add( indiceMedic);
        mainP.add(indice);
        mainP.add(ziProg);
        mainP.add(zi);
        mainP.add(lunaProg);
        mainP.add(luna);
        mainP.add(oraProg);
        mainP.add(ora);



        mainP.add(Box.createRigidArea(new Dimension(10,20)));
        mainP.add(modificaProg);

        mainP.setLayout(new GridLayout(6, 1));
        mainPanel.add(mainP);

        // mainPanel.add(buttonMedic);
        //add(mainPanel);
        // add(new JScrollPane(mainPanel), BorderLayout.CENTER);




    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getZi() {
        return zi;
    }

    public JTextField getLuna() {
        return luna;
    }

    public JTextField getOra() {
        return ora;
    }

    public JTextField getIndice() {
        return indice;
    }

    public JTextField getNr() {
        return nr;
    }

    public JButton getModificaProg() {
        return modificaProg;
    }
}
