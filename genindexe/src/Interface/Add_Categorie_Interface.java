package Interface;

import java.awt.GridLayout;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import ManagedBeans.Database;

/**
 ** Classe interface pour la fenetre de creation de nouvelle categorie.
 **/

public class Add_Categorie_Interface extends JPanel{
	
	JLabel L_titre = new JLabel("Cr�er Interface");
	JLabel L_nom_new_cat = new JLabel("Nom de la nouvelle cat�gorie : \n");
	JLabel L_type_echantillon = new JLabel("Type d'�chantillons pr�levables : \n");
	JLabel L_autre = new JLabel("Autre type : ");
	JTextField TF_nom_new_cat = new JTextField();
	JTextField TF_new_type_echantillon = new JTextField();
	JList List_type_echantillon;
	JScrollPane Scroll_list;
	JButton B_new_type_echantillon = new JButton("Ok");
	JButton B_submit = new JButton("Valider");
	Database DB = new Database();
	java.util.List<String> List_type_sample = new ArrayList<>();
	
	
	
	public Add_Categorie_Interface() {
		// TODO Auto-generated constructor stub
		
		
		/*
		 * On recupere la liste des type d'echantillons existant
		 */
		try {
			List_type_sample=DB.GetListTypeSamples();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		remplirListEchantillon();
		List_type_echantillon.setVisibleRowCount(4);
		List_type_echantillon.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		Scroll_list = new JScrollPane(List_type_echantillon);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(L_titre);
		this.add(L_nom_new_cat);
		this.add(TF_nom_new_cat);
		this.add(L_type_echantillon);
		this.add(Scroll_list);
		this.add(L_autre);
		this.add(TF_new_type_echantillon);
		this.add(B_new_type_echantillon);
		this.add(B_submit);
		
		
		
	}
	
	
	/**
	 * Methode qui remplis la liste a choix multiples des echantillons
	 */
	public void remplirListEchantillon(){
		String type[] = new String[List_type_sample.size()];
		for(int i=0; i<List_type_sample.size(); i++){
			type[i]=List_type_sample.get(i);
			
		}
		List_type_echantillon = new JList<>(type);
	}
	
	
	
	
	 public static void main(String[] args) {
		 Add_Categorie_Interface IT = new Add_Categorie_Interface();
		 JFrame myFrame = new JFrame("Test interface");
		 myFrame.setLayout(new GridLayout(1, 2));
		 myFrame.add(IT);
		 myFrame.pack();
			myFrame.setVisible(true);
		 
	 }
}
