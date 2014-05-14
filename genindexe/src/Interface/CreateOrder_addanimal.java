/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import ManagedBeans.Database;
import ManagedBeans.ManagedAnimal;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Johanne
 */
public class CreateOrder_addanimal extends javax.swing.JPanel {
    private Integer id_client;
    private List<Integer> listAnimauxChoisi = new ArrayList<Integer>();
    

    /**
     * Creates new form NewJFrame
     */
    public CreateOrder_addanimal(List<Integer> listAnimauxChoisi, Integer id_client) {
      this.id_client=id_client;
      this.listAnimauxChoisi=listAnimauxChoisi;
      initComponents(listAnimauxChoisi,id_client);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(List<Integer> listAnimauxChoisi, Integer id_client) {
		Database DB = new Database();
                ManagedAnimal data = new ManagedAnimal();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList(); /// correspond à List<Integer> listAnimauxChoisi
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search_animal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
		
        add_animal_button = new javax.swing.JButton();
        confirm_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAnimal = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        animauxChoisi = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        previous_step = new javax.swing.JButton();
        next_step = new javax.swing.JButton();

        jScrollPane2.setViewportView(jList2);


        jLabel1.setText("Selection d'un Animal");

        jLabel2.setText("Entrer les 3 premieres lettres :");

        search_animal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_animalKeyReleased(evt);
            }
        });

        jLabel3.setText("Ou");

        add_animal_button.setText("Ajouter Animal au Client");
        add_animal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_animal_buttonActionPerformed(evt);
            }
        });

        confirm_button.setText("Ajouter Animal a la liste");
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Supprimer Dernier Animal");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        listAnimal = DB.getJListAnimalCustomer(id_client,"");///liste des animaux du client
        jScrollPane1.setViewportView(listAnimal);
//a modifier
        animauxChoisi=data.getJListAnimals(listAnimauxChoisi);///liste des animaux choisi
        jScrollPane3.setViewportView(animauxChoisi);

        jLabel4.setText("Votre choix :");

        previous_step.setText("Etape Précédente");
        previous_step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous_stepActionPerformed(evt);
            }
        });

        next_step.setText("Etape Suivante");
        next_step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_stepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(search_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(add_animal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(confirm_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_button)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(previous_step, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(next_step, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(add_animal_button))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel_button)
                    .addComponent(confirm_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previous_step)
                    .addComponent(next_step))
                .addContainerGap(37, Short.MAX_VALUE))
        );

       DB.Close();
       
    }// </editor-fold>                        


	

    private void add_animal_buttonActionPerformed(java.awt.event.ActionEvent evt) {
            JFrame CreerAnimal = new JFrame("Creer un nouvel animal");
            CreerAnimal.add(new CreateAnimal());
            CreerAnimal.setExtendedState(CreerAnimal.MAXIMIZED_HORIZ);
            CreerAnimal.pack();
            CreerAnimal.setVisible(true);// ajouter panel de teddy
    }

    private void search_animalKeyReleased(java.awt.event.KeyEvent evt) {     
        int taille_chaine = 0;
        String chaine = search_animal.getText();
        taille_chaine = chaine.length();
        if ((taille_chaine > 2)) {
          Database instance = new Database();
                           
                listAnimal = (JList) instance.getJListAnimalCustomer(id_client,chaine);
                jScrollPane1.setViewportView(listAnimal);
                
           
            instance.Close();

        }
        else {
            Database instance = new Database();
                          
                listAnimal = (JList) instance.getJListAnimalCustomer(id_client,"");
                jScrollPane1.setViewportView(listAnimal);
                
          
            instance.Close();
        }
    }

private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) { 
        
        System.out.println(listAnimal.getSelectedValue());
        
        String id_select=(String) listAnimal.getSelectedValue();
        int id_added_animal;
        int fin_id=id_select.indexOf(": ");
        id_added_animal=Integer.parseInt(id_select.substring(0,(fin_id)));
        System.out.println("id_animal");
        System.out.println(id_added_animal);
        listAnimauxChoisi.add(id_added_animal);
        
        
                for(int i = 0; i < listAnimauxChoisi.size(); i++)
                    {
                        System.out.println("donnée à l'indice " + i + " = " + listAnimauxChoisi.get(i));
                        }
        Database instance = new Database();
        try {
              
        listAnimal = (JList) instance.getJListAnimalCustomer(listAnimauxChoisi);
        jScrollPane1.setViewportView(listAnimal);
                
        } catch (SQLException ex) {
         System.out.println("SQLException: " + ex.getMessage());
             System.out.println("SQLState: " + ex.getSQLState());
              System.out.println("VendorError: " + ex.getErrorCode());
            }
         instance.Close();    
         
         ManagedAnimal data= new ManagedAnimal();
         animauxChoisi=data.getJListAnimals(listAnimauxChoisi);///liste des animaux choisi
         jScrollPane3.setViewportView(animauxChoisi);
    }                                              

private List<Integer> cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (listAnimauxChoisi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Aucun Animal Supprimer");
        this.setVisible(false);
        System.out.println(listAnimauxChoisi);
        return (List) listAnimauxChoisi;
        }
        else{
            JOptionPane d = new JOptionPane();
            int retour = d.showConfirmDialog(this, "Suppression du dernier animal selectionne ?", 
      "Suppression", JOptionPane.YES_NO_OPTION);
            if (retour==0){
                listAnimauxChoisi.remove(listAnimauxChoisi.size()-1);
                //test list
                for(int i = 0; i < listAnimauxChoisi.size(); i++)
                    { System.out.println("donnée à l'indice " + i + " = " + listAnimauxChoisi.get(i));}
                //confirmation suppression
                JOptionPane.showMessageDialog(this,"Suppression reussi");
                ManagedAnimal data= new ManagedAnimal();
                animauxChoisi=data.getJListAnimals(listAnimauxChoisi);///liste des animaux choisi
                jScrollPane3.setViewportView(animauxChoisi);
                Database instance = new Database();
                try {
                    listAnimal = (JList) instance.getJListAnimalCustomer(listAnimauxChoisi);
                    jScrollPane1.setViewportView(listAnimal);
                } catch (SQLException ex) {
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                }
                instance.Close();  
                }
         ManagedAnimal data= new ManagedAnimal();
         animauxChoisi=data.getJListAnimals(listAnimauxChoisi);///liste des animaux choisi
         jScrollPane3.setViewportView(animauxChoisi);   
          
        return null;}
        
        
    }                                             


    private void previous_stepActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void next_stepActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         



    // Variables declaration - do not modify   
    private javax.swing.JButton add_animal_button;
    private javax.swing.JList animauxChoisi;
    private javax.swing.JButton cancel_button;
    private javax.swing.JButton confirm_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listAnimal;
    private javax.swing.JButton next_step;
    private javax.swing.JButton previous_step;
    private javax.swing.JTextField search_animal;
    // End of variables declaration                   

    public static void main(String[] args) throws SQLException {
        JFrame myFrame = new JFrame("Test interface");
        Integer id_client = 16;
        List<Integer> listAnimauxChoisi = new ArrayList<>();
        CreateOrder_addanimal test = new CreateOrder_addanimal(listAnimauxChoisi,id_client);
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

