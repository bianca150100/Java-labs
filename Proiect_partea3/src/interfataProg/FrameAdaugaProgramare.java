package interfataProg;

import javax.swing.*;
import java.awt.*;

public class FrameAdaugaProgramare extends JFrame {
    private JPanel mainPanel;
    private JLabel numePacient;
    private JLabel prenumePacient;
    private JLabel varstaPacient;
    private JLabel anNPacient;
    private JLabel lunaNPacient;
    private JLabel ziNPacient;
    private JLabel ziProg;
    private JLabel lunaProg;
    private JLabel anProg;
    private JLabel oraProg;
    private JLabel indiceMedic;
    private JTextField nume;
    private JTextField prenume;
    private JTextField varsta;
    private JTextField anN;
    private JTextField lunaN;
    private JTextField ziN;
    private JTextField zi;
    private JTextField luna;
    private JTextField an;
    private JTextField ora;
    private JTextField indice;
    private JLabel inregProg;
    private JTextField inreg;
    private JButton adaugaProg;

    public FrameAdaugaProgramare()
    {
        initComponents();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getNume() {
        return nume;
    }

    public JTextField getPrenume() {
        return prenume;
    }

    public JTextField getVarsta() {
        return varsta;
    }

    public JTextField getAnN() {
        return anN;
    }

    public JTextField getLunaN() {
        return lunaN;
    }

    public JTextField getZiN() {
        return ziN;
    }

    public JTextField getZi() {
        return zi;
    }

    public JTextField getLuna() {
        return luna;
    }

    public JTextField getAn() {
        return an;
    }

    public JTextField getOra() {
        return ora;
    }

    public JTextField getIndice() {
        return indice;
    }

    private void initComponents() {

        setLayout(new FlowLayout());
        mainPanel = new JPanel(new FlowLayout());
        numePacient = new JLabel("Nume:");
        prenumePacient = new JLabel("Prenume:");
        varstaPacient = new JLabel("Varsta:");
        ziNPacient = new JLabel("Zi nastere:");
        anNPacient = new JLabel("An nastere:");
        lunaNPacient = new JLabel("Luna nastere:");
        ziProg  =new JLabel("Zi programare:");
        lunaProg = new JLabel("Luna programare:");
        anProg = new JLabel("An programare:");
        oraProg = new JLabel("Ora programare:");
        indiceMedic = new JLabel("Indice medic:");
        inregProg = new JLabel("Numar programare(generat automat):");
        inreg = new JTextField(13);
        nume = new JTextField(13); //6 columns (characters)
        prenume = new JTextField(13); //6 columns (characters)
        varsta = new JTextField(13);
        ziN = new JTextField(13);
        anN= new JTextField(13);
        lunaN = new JTextField(13);
        zi  =new JTextField(13);
        luna = new JTextField(13);
        an = new JTextField(13);
        ora = new JTextField(13);
        indice = new JTextField(13);

        //buttonMedic = new JButton("Adauga medicament!");

        JPanel mainP =new JPanel(new FlowLayout());
        adaugaProg= new JButton("Adauga programare!");
        mainP.add(numePacient);
        mainP.add(nume);
        mainP.add( prenumePacient);
        mainP.add(prenume);
        mainP.add(varstaPacient);
        mainP.add(varsta);
        mainP.add(ziNPacient);
        mainP.add(ziN);
        mainP.add(lunaNPacient);
        mainP.add(lunaN);
        mainP.add(anNPacient);
        mainP.add(anN);

        mainP.add(ziProg);
        mainP.add(zi);
        mainP.add(lunaProg);
        mainP.add(luna);
        mainP.add(anProg);
        mainP.add(an);
        mainP.add(oraProg);
        mainP.add(ora);
        mainP.add(indiceMedic);
        mainP.add(indice);
        mainP.add(inregProg);
        mainP.add(inreg);
        mainP.add(Box.createRigidArea(new Dimension(10,20)));
        mainP.add(adaugaProg);

        mainP.setLayout(new GridLayout(13, 1));
        mainPanel.add(mainP);

       // mainPanel.add(buttonMedic);
        //add(mainPanel);
        // add(new JScrollPane(mainPanel), BorderLayout.CENTER);




    }

    public JButton getAdaugaProg() {
        return adaugaProg;
    }
}
