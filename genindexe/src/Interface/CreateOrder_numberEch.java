/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner.*;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author jeremygillet
 */
public class CreateOrder_numberEch extends javax.swing.JPanel {
    private Integer id_client;
    private List<Integer> listAnimauxChoisi = new ArrayList<Integer>();
    private List<Integer> NbEchantillon = new ArrayList<Integer>();
    private Integer AnimalChoisi;
    /**
     * Creates new form CreateOrder_numberEch
     * @param listAnimauxChoisi
     * @param id_client
     * @param NbEchantillon
     * @throws java.sql.SQLException
     */
    public CreateOrder_numberEch(List<Integer> listAnimauxChoisi, Integer id_client)  {
        
        this.listAnimauxChoisi=listAnimauxChoisi;
        this.id_client=id_client;
        megaComponents(listAnimauxChoisi, id_client,NbEchantillon);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private JPanel megaComponents(List<Integer> AnimauxChoisi, Integer id_client,List<Integer> NbEchantillon) {		
        JPanel jPanel1 = new javax.swing.JPanel();	
        jPanel1.setLayout(new GridLayout(4,1));
        jLabel1 = new javax.swing.JLabel();        
        jLabel1.setText("Nombre d'echantillon par animal");
        jPanel1.add(jLabel1);
        for(int i = 0; i < listAnimauxChoisi.size(); i++){
	this.add(initComponents(listAnimauxChoisi.get(i),id_client,NbEchantillon));
		}
        previous_step= new javax.swing.JButton();
        next_step = new javax.swing.JButton();
	previous_step.setText("Etape Precedente");
        previous_step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_stepActionPerformed(evt);
            }
        });
	next_step.setText("Etape Suivante");
        next_step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //next_stepActionPerformed(evt);
            }
        });
        this.add(previous_step);
        this.add(next_step);
        return jPanel1;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private JPanel initComponents(Integer AnimalChoisi, Integer id_client,List<Integer> NbEchantillon)  {
		JPanel jPanel1 = new javax.swing.JPanel();	
		this.AnimalChoisi=AnimalChoisi;
		this.NbEchantillon=NbEchantillon;

		SpinnerNumberModel snm = new SpinnerNumberModel(0,0,666,1); 
		JSpinner jSpinner1 = new JSpinner(snm); 
		
        Animal = new javax.swing.JLabel("Animal : "+AnimalChoisi);

        

        Animal.setText("Animal : "+AnimalChoisi);

        

       
		jPanel1.setLayout(new GridLayout(1,2));
		jPanel1.add(Animal);
		jPanel1.add(jSpinner1);
        return jPanel1;
       
    }// </editor-fold>//GEN-END:initComponents


    
    public void previous_stepActionPerformed(java.awt.event.ActionEvent evt){
        this.remove();
        //jPanel1=new CreateOrder_numberEch();
        javax.swing.GroupLayout layoutP = new javax.swing.GroupLayout(this);
        this.setLayout(layoutP);
        layoutP.setHorizontalGroup(
            layoutP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layoutP.setVerticalGroup(
            layoutP.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        this.repaint();
        this.revalidate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Animal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton next_step;
    private javax.swing.JButton previous_step;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) throws SQLException {
        JFrame myFrame = new JFrame("Test interface");
        Integer id_client = 16;
        List<Integer> listAnimauxChoisi = new ArrayList<>();
        listAnimauxChoisi.add(94);
        listAnimauxChoisi.add(109);
        List<Integer> NbEchantillon = new ArrayList<>();
        CreateOrder_numberEch test = new CreateOrder_numberEch(listAnimauxChoisi,id_client);
        myFrame.setLayout(new GridLayout(1, 2));
        myFrame.add(test);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        for(int i = 0; i < listAnimauxChoisi.size(); i++)
    {
      System.out.println("donnée à l'indice " + i + " = " + listAnimauxChoisi.get(i));
    }
        
    }

}
