package interfataLogistica;

import javax.swing.*;
import java.awt.*;

public class FrameMedicament extends JFrame {
    private JPanel mainPanel;
    private JLabel numeMedic;
    private JLabel distMedic;
    private JLabel nrProdMedic;
    private JLabel ziMedic;
    private JLabel lunaMedic;
    private JLabel anMedic;
    private JLabel nrProdCutieMedic;
    private JLabel dozarecMedic;
    private JLabel dozajMedic;
    private JTextField nume;
    private JTextField dist;
    private JTextField nrProd;
    private JTextField zi;
    private JTextField luna;
    private JTextField an;
    private JTextField nrProdCutie;
    private JTextField dozarec;
    private JTextField dozaj;
    private JButton buttonMedic;


    public FrameMedicament()
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
        numeMedic = new JLabel("Nume medicament:");
        distMedic = new JLabel("Nume distribuitor:");
        nrProdMedic = new JLabel("Nr produse:");
        ziMedic = new JLabel("Zi exp:");
        anMedic = new JLabel("An exp:");
        lunaMedic = new JLabel("Luna exp:");
        nrProdCutieMedic  =new JLabel("Nr prod/cutie:");
        dozarecMedic = new JLabel("Doza recomandata:");
        dozajMedic = new JLabel("Dozaj:");
        nume = new JTextField(13); //6 columns (characters)
        dist = new JTextField(13); //6 columns (characters)
        nrProd = new JTextField(13);
        zi = new JTextField(13);
        an= new JTextField(13);
        luna = new JTextField(13);
        nrProdCutie  =new JTextField(13);
        dozarec = new JTextField(13);
        dozaj = new JTextField(13);

        buttonMedic = new JButton("Adauga medicament!");

        JPanel mainP =new JPanel(new FlowLayout());

        mainP.add(numeMedic);
        mainP.add(nume);
        mainP.add(distMedic);
        mainP.add(dist);
        mainP.add(nrProdMedic);
        mainP.add(nrProd);
        mainP.add(ziMedic);
        mainP.add(zi);
        mainP.add(lunaMedic);
        mainP.add(luna);
        mainP.add(anMedic);
        mainP.add(an);

        mainP.add(nrProdCutieMedic);
        mainP.add(nrProdCutie);
        mainP.add(dozajMedic);
        mainP.add(dozaj);
        mainP.add(dozarecMedic);
        mainP.add(dozarec);
        mainP.add(Box.createRigidArea(new Dimension(10,20)));


        mainP.setLayout(new GridLayout(5, 1));
        mainPanel.add(mainP);
        mainPanel.add(buttonMedic);
        //add(mainPanel);
       // add(new JScrollPane(mainPanel), BorderLayout.CENTER);




    }

    public JTextField getNume() {
        return nume;
    }

    public JTextField getDist() {
        return dist;
    }

    public JTextField getNrProd() {
        return nrProd;
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

    public JTextField getNrProdCutie() {
        return nrProdCutie;
    }

    public JTextField getDozarec() {
        return dozarec;
    }

    public JTextField getDozaj() {
        return dozaj;
    }

    public JButton getButtonMedic() {
        return buttonMedic;
    }

    public void setButtonMedic(JButton buttonMedic) {
        this.buttonMedic = buttonMedic;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }


}
