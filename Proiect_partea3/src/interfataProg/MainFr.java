package interfataProg;

import database.DatabasePacientProgramare;
import interfataLogistica.MainFR;
import model.*;
import serviciu.ServiciuAudit;
import serviciu.ServiciuLogistica;
import serviciu.ServiciuProgramari;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MainFr extends JFrame {
    ServiciuAudit serviciu;
    FrameAdaugaProgramare fp = new FrameAdaugaProgramare() ;
    FrameModificaProgramare fmp = new FrameModificaProgramare();
    FrameAnuleazaProgramare fap = new FrameAnuleazaProgramare();
    DatabasePacientProgramare dpp = DatabasePacientProgramare.getInstance();
    private JPanel mainPanel2;
    private JLabel text1;



    private JButton genereazaListaMedici;
    private JButton verificaDispMedic;
    private JLabel text2;

    ServiciuProgramari sp;
    GestiuneMedici g;
    public MainFr() throws SQLException, ClassNotFoundException {
        super("Programari");
        initComponents();
        pack();
        setVisible(true);
        setSize(1500,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        sp = new ServiciuProgramari();
        g = new GestiuneMedici();

        serviciu = ServiciuAudit.getInstance();
        try {
            serviciu.deschideFis("ServiciuAudit.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void initComponents() {

        text1 = new JLabel();
        text2 = new JLabel();
        genereazaListaMedici = new JButton("Genereaza lista medici!");
        Box box = Box.createVerticalBox();
        mainPanel2 = new JPanel(new FlowLayout());
        box.add(Box.createRigidArea(new Dimension(5,15)));
        box.add(text1);

        box.add(genereazaListaMedici);
        Box box2 = Box.createHorizontalBox();
        box.add(Box.createRigidArea(new Dimension(5,15)));
        box2.add(fp.getMainPanel());
        box2.add(Box.createRigidArea(new Dimension(5,15)));
        box2.add(fmp.getMainPanel());

        box2.add(fap.getMainPanel());
        box.add(box2);
        box.add(Box.createRigidArea(new Dimension(5,15)));
        box.add(text2);

        verificaDispMedic = new JButton("Verifica disponibilitate medic!");

        box.add(Box.createRigidArea(new Dimension(5,7)));


        box.add(verificaDispMedic);
        mainPanel2.add(box);

        add(mainPanel2);

        mainPanel2.add(text2);
        genereazaListaMedici.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Secretariat scr = new Secretariat("Popescu","Maria", 1990, g);
                String result = scr.genereazaListaMedici();
                serviciu.adaugaServiciu("genereazaListaMedici");
                //System.out.println(result);;
                text1.setText(result);


            }
        });
        fp.getAdaugaProg().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int sursa = 0;
                Programare i = new Programare();
                Pacient p = new Pacient();
                p.setNrIdentificare(hashCode());
                p.setNume(fp.getNume().getText());
                p.setPrenume(fp.getPrenume().getText());
                p.setVarsta(Integer.parseInt(fp.getVarsta().getText()));
                p.setZi_nastere(Integer.parseInt(fp.getZiN().getText()));
                p.setAn_nastere(Integer.parseInt(fp.getAnN().getText()));
                p.setLuna_nastere(Integer.parseInt(fp.getLunaN().getText()));
                int indice_medic = Integer.parseInt(fp.getIndice().getText());
                int ziua = Integer.parseInt(fp.getZi().getText());
                int luna = Integer.parseInt(fp.getLuna().getText());
                int an = Integer.parseInt(fp.getAn().getText());
                int ora = Integer.parseInt(fp.getOra().getText());
                Medic[] medici = g.getMedici();


                //System.out.println(medici[indice_medic]);
                Programare pp = new Programare(ziua, luna, an, ora, p, medici[indice_medic]);
                p.setProgramare(pp);
                //adaug prog + pacientul in baza de date
                dpp.adaugaPacient(p, indice_medic);
                serviciu.adaugaServiciu("adaugaPacient");
                sp.serviciuAdaugaProg(g,pp,indice_medic,0);
                serviciu.adaugaServiciu("adaugaProgramare");
                //System.out.println(pp);;
                List<Pacient> listaP = dpp.citestePacient();
                System.out.println(" Nr pacienti: "  +listaP.size());
                String str = pp.toString();


                text1.setText(str);
                // System.out.println(m);

            }
        });
        fmp.getModificaProg().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Modifica prog");;
                int sursa = 0;
                int nr_inreg =Integer.parseInt( fmp.getNr().getText());
                int indice_medic = Integer.parseInt(fmp.getIndice().getText());
                int zi = Integer.parseInt(fmp.getZi().getText());
                int luna = Integer.parseInt(fmp.getLuna().getText());
                int ora = Integer.parseInt(fmp.getOra().getText());
                String k = sp.serviciuModificaProg(g,nr_inreg,indice_medic,zi,luna,ora,sursa);
                dpp.updateProgramare(nr_inreg,ora,zi,luna);
                serviciu.adaugaServiciu("modificaProgramare");
                if (k == "")
                    k = "Modificare cu succes!";
                // System.out.println(m);

                text1.setText(k);

            }
        });

        fap.getAnuleazaProg().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Anuleaza prog");;
                int sursa = 0;
                int nr_inreg =Integer.parseInt( fap.getNr().getText());
                String k = sp.servicuAnuleazaProg(g,nr_inreg,sursa);
                serviciu.adaugaServiciu("modificaProgramare");
                // System.out.println(m);
                dpp.stergePacient(k);
                text1.setText("Numele d-vostra" + k);
                List<Pacient> listaP = dpp.citestePacient();
                System.out.println(" Nr pacienti ramasi dupa anularea prog: "  +listaP.size());
            }
        });

        verificaDispMedic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Schimba");;
                FrameVerificaDisp fvd = new FrameVerificaDisp(g);
                serviciu.adaugaServiciu("verificaDisponibilitateMedic");


            }
        });







    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MainFr frame = new MainFr();
    }

}
