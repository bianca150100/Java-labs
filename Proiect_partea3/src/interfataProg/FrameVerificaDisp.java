package interfataProg;

import model.GestiuneMedici;
import model.Medic;
import model.Secretariat;
import serviciu.ServiciuLogistica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameVerificaDisp extends JFrame {
    private ServiciuLogistica sr;
    private JPanel mainPanel;
    private JLabel nrMedic;
    private JLabel ziMedic;
    private JLabel lunaMedic;
    private JLabel anMedic;
    private JLabel oraMedic;
    private JLabel text1;
    private JTextField nr;
    private JTextField zi;
    private JTextField luna;
    private JTextField an;
    private JTextField ora;
    private JButton button;
    private JButton back;
    GestiuneMedici g;

    public FrameVerificaDisp(GestiuneMedici g)
    {
        super("MEDICAMENT");
        initComponents();
        pack();
        setVisible(true);
        setSize(1500,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sr= new ServiciuLogistica();
        this.g = g;
    }

    private void initComponents() {

        setLayout(new FlowLayout());
        mainPanel = new JPanel(new FlowLayout());
        text1 = new JLabel();
        GestiuneMedici g1 = new GestiuneMedici();
        Secretariat scr = new Secretariat("Popescu","Maria", 1990, g1);
        String result = scr.genereazaListaMedici();
        System.out.println(result);;
        text1.setText(result);

        nrMedic = new JLabel("Numar medic:");
        ziMedic = new JLabel("Zi dorita:");
        anMedic = new JLabel("Anul dorit:");
        lunaMedic = new JLabel("Luna dorita:");
        oraMedic = new JLabel("Ora dorita:");

        nr = new JTextField(13);
        zi = new JTextField(13);
        an= new JTextField(13);
        luna = new JTextField(13);
        ora = new JTextField(12);


        button = new JButton("Verifica disponibilitate medic!");
        back = new JButton("Inapoi pe pagina principala!");


       //
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));

        mainPanel.add(text1);
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));

        mainPanel.add(ziMedic);
        mainPanel.add(zi);
        mainPanel.add(lunaMedic);
        mainPanel.add(luna);
        mainPanel.add(anMedic);
        mainPanel.add(an);
        mainPanel.add(oraMedic);
        mainPanel.add(ora);

        mainPanel.add(nrMedic);
        mainPanel.add(nr);
        mainPanel.add(Box.createRigidArea(new Dimension(5,15)));
        mainPanel.add(button);

        mainPanel.add(back);
        mainPanel.setLayout(new GridLayout(19, 0));

        add(mainPanel);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){


                int indice = Integer.parseInt(nr.getText());

                int ziua = Integer.parseInt(zi.getText());
                int l = Integer.parseInt(luna.getText());
                int a = Integer.parseInt(an.getText());
                int o = Integer.parseInt(ora.getText());
                Medic[] medici = g.getMedici();
                String str="";
                if (medici[indice].verifica_disponibilitate_medic(ziua,l,a,o))
                    str="Este disponibil!";
                else
                    str="Nu este disponibil!Ne pare rau!";

                text1.setText(str);

            }
        });

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                setVisible(false);

            }
        });


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



   // public static void main(String[] args) {
    //    FrameVerificaDisp frame = new FrameVerificaDisp();
  //  }
}
