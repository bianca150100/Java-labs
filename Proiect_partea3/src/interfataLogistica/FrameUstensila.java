package interfataLogistica;

import javax.swing.*;
import java.awt.*;

public class FrameUstensila extends JFrame {
    private JPanel mainPanel;
    private JLabel denUstensila;
    private JLabel nrProdUstensila;
    private JLabel distUstensila;
    private JLabel unicaFolUstensila;
    private JLabel utilizareUstensila;
    private JLabel intrebuintareUstensila;
    private JLabel timpUstensila;
    private JLabel anUstensila;
    private JTextField den;
    private JTextField nrProd;
    private JTextField  dist;
    private JTextField unicaFol;
    private JTextField utilizare;
    private JTextField intrebuintare;
    private JTextField timp;
    private JTextField an;

    private JButton buttonUstensila;


    public FrameUstensila()
    {
        //super("MEDICAMENT");
        initComponents();
        //pack();
        //setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //sr= new ServiciuLogistica();
    }

    private void initComponents() {

        setLayout(new FlowLayout());
        mainPanel = new JPanel(new FlowLayout());
        denUstensila = new JLabel("Denumire ustensila:");
        nrProdUstensila = new JLabel("Nr produse:");
        distUstensila = new JLabel("Distribuitor::");
        unicaFolUstensila = new JLabel("Unica Folosinta:");
        utilizareUstensila = new JLabel("Utilizare:");
        intrebuintareUstensila = new JLabel("Intrebuintare:");
        timpUstensila  =new JLabel("Timp utilizare:");
        anUstensila = new JLabel("An achizitionare:");
        den = new JTextField(13); //6 columns (characters)
        dist = new JTextField(13); //6 columns (characters)
        nrProd = new JTextField(13);
        unicaFol = new JTextField(13);
        an= new JTextField(13);
        utilizare = new JTextField(13);
        intrebuintare  =new JTextField(13);
        timp = new JTextField(13);


        buttonUstensila = new JButton("Adauga ustensila!");

        JPanel mainP =new JPanel(new FlowLayout());

        mainP.add(denUstensila);
        mainP.add(den);
        mainP.add(nrProdUstensila );
        mainP.add(nrProd);
        mainP.add(distUstensila);
        mainP.add(dist);
        mainP.add(unicaFolUstensila);
        mainP.add(unicaFol);
        mainP.add(utilizareUstensila);
        mainP.add(utilizare);
        mainP.add(intrebuintareUstensila);
        mainP.add(intrebuintare);

        mainP.add(timpUstensila);
        mainP.add(timp);
        mainP.add(anUstensila);
        mainP.add(an);
        mainP.add(Box.createRigidArea(new Dimension(10,20)));


        mainP.setLayout(new GridLayout(5, 1));
        mainPanel.add(mainP);
        mainPanel.add(buttonUstensila);
        //add(mainPanel);
        // add(new JScrollPane(mainPanel), BorderLayout.CENTER);




    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTextField getDen() {
        return den;
    }

    public JTextField getNrProd() {
        return nrProd;
    }

    public JTextField getDist() {
        return dist;
    }

    public JTextField getUnicaFol() {
        return unicaFol;
    }

    public JTextField getUtilizare() {
        return utilizare;
    }

    public JTextField getIntrebuintare() {
        return intrebuintare;
    }

    public JTextField getTimp() {
        return timp;
    }

    public JTextField getAn() {
        return an;
    }

    public JButton getButtonUstensila() {
        return buttonUstensila;
    }


}
