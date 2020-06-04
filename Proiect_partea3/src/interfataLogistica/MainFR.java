package interfataLogistica;

import database.DatabaseMedicament;
import model.Dotare;
import model.Medicament;
import model.UstensileAparatura;
import serviciu.ServiciuLogistica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainFR extends  JFrame{
    FrameMedicament fm = new FrameMedicament();
    FrameUstensila fu = new FrameUstensila();
    DatabaseMedicament dm= DatabaseMedicament.getInstance();
    private JPanel mainPanel2;
    private JButton caseaza;
    private JButton afiseazaLogistica;
    private JLabel text;

    ServiciuLogistica sr;

    public MainFR() throws SQLException, ClassNotFoundException {
        super("Logistica");
        initComponents();
        pack();
        setVisible(true);
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sr = new ServiciuLogistica();


    }

    private void initComponents() {
        //setLayout(new FlowLayout());
        Box box = Box.createVerticalBox();
        mainPanel2 = new JPanel(new FlowLayout());
        box.add(fm.getMainPanel());
        box.add(Box.createRigidArea(new Dimension(5,15)));
        box.add(fu.getMainPanel());

       // mainPanel2.add(fm.getMainPanel());
        caseaza = new JButton("Casare!");
        afiseazaLogistica = new JButton("Afiseaza logistica!");
       // mainPanel2.add(fu.getMainPanel());
        //caseaza.setBounds(1000,180, 20, 20);
        box.add(Box.createRigidArea(new Dimension(5,25)));
        box.add(caseaza);
        box.add(Box.createRigidArea(new Dimension(5,15)));
        box.add(afiseazaLogistica);
        mainPanel2.add(box);
        //mainPanel2.setLayout(new GridLayout(2, 1));
        add(mainPanel2);
        text = new JLabel();
        mainPanel2.add(text);
        fm.getButtonMedic().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Medicament m = new Medicament(fm.getNume().getText(), Integer.parseInt(fm.getNrProd().getText()),
                        fm.getDist().getText(), Integer.parseInt(fm.getZi().getText()), Integer.parseInt(fm.getLuna().getText()),
                        Integer.parseInt(fm.getAn().getText()), Integer.parseInt(fm.getNrProdCutie().getText()),
                        Integer.parseInt(fm.getDozarec().getText()), Float.parseFloat(fm.getDozaj().getText()));
                sr.adaugaProdus(m);
                dm.adaugaMedicament(m);
                dm.afiseazaMedicament(fm.getNume().getText());
                System.out.println(sr.getProduseCabinet());



            }
        });

        fu.getButtonUstensila().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                UstensileAparatura u = new UstensileAparatura(fu.getDen().getText(), Integer.parseInt(fu.getNrProd().getText()),
                        fu.getDist().getText(), Boolean.parseBoolean(fu.getUnicaFol().getText()), fu.getUtilizare().getText(),
                        fu.getIntrebuintare().getText(), Integer.parseInt(fu.getAn().getText()), Integer.parseInt(fu.getTimp().getText()));
                sr.adaugaProdus(u);
                System.out.println(sr.getProduseCabinet());



            }
        });
        caseaza.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Buton caseaza!");
                sr.caseaza_produse();
                System.out.println(sr.getProduseCabinet());
                System.out.println("Medicamente expirate: ");
                System.out.println(sr.getMedicamenteExpirate());
                ArrayList<Dotare> medicamenteExpirate= sr.getMedicamenteExpirate();
                //stergem din baza de date pe cele expirate !
                for (int i=0;i<medicamenteExpirate.size();i++)
                {
                    String nume = medicamenteExpirate.get(i).getDenumire();
                    dm.stergeMedicament(nume);
                }
                List<Medicament> listM = dm.citesteMedicament();
                System.out.println("Dupa casare au ramas un numar de medicamente egal cu: " + listM.size());

                // System.out.println(m);

            }
        });

        afiseazaLogistica.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // System.out.println(m);
                String str ="<html>";
                for (int i=0; i<sr.getProduseCabinet().size();i++)
                {
                    Dotare d=  sr.getProduseCabinet().get(i);
                    str += d.toString();
                    str += "<br>";

                    //text.setText("\n");
                }
                str +="</html>";
                text.setText(str);
               // text.setText(sr.getProduseCabinet().toString());

            }
        });






    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MainFR frame = new MainFR();
    }





}
