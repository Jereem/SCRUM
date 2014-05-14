package ManagedBeans;

import Tools.ConnectBDD;
import Tools.DateTools;
import beans.Animals;
import beans.Orders;
import beans.Samples;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Teddy
 */
public class ManagedSample {
    private Samples selectedSample;

    public ManagedSample() {
    }

    public ManagedSample(Samples selectedSample) {
        this.selectedSample = selectedSample;
    }

    public Samples getSelectedSample() {
        return selectedSample;
    }

    public void setSelectedSample(Samples selectedSample) {
        this.selectedSample = selectedSample;
    }
    
    public Samples searchSample(String id) throws SQLException {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        int id_number = Integer.parseInt(id);

        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("SELECT * FROM Echantillon NATURAL JOIN Type_Echantillon NATURAL JOIN Animal NATURAL JOIN Espece WHERE Id_Ech='" + id_number + "'");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        java.sql.Date date_sampling = result.getDate("Date_recep");
        java.sql.Date date_storage = result.getDate("Date_stock");
        DateTools d = new DateTools();
        Samples sa2 = new Samples(id, result.getString("Type_Ech"), d.dateSQLToJava(date_sampling), d.dateSQLToJava(date_storage), new Animals((result.getString("Nom_Espece")), d.dateSQLToJava(result.getDate("Date_Naissance")), result.getString("Nom_Espece")));

        return sa2;
    }

    public List<Samples> getListSamples() {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        List<Samples> listS = new ArrayList<>();
        listS.add(this.selectedSample);
        return (listS);
    }
    
    public List<String> GetListTypeSamples() throws SQLException {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
    	PreparedStatement ps;
    	ps=con.prepareStatement("Select * From Type_Echantillon");
    	ResultSet result = ps.executeQuery();
    	List<String> LS = new ArrayList<>();
    	while(result.next()){
    		
    		LS.add(result.getString("Type_Ech"));
    	}
    	return LS;
    }

    public String saveSample(Samples sample, Date dReception, int idCommande) {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        this.selectedSample = sample;
        int pIdCommande = idCommande;
        //retourne l'id du type d'ech
        int pIdTypeEchantillon = searchIdTypeSample(this.selectedSample);
        int pIdAnimal = sample.getAnimal().getID();
        Date pDateReception = dReception;
        try{
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps = b.prepareStatement("INSERT INTO Echantillon(ID_COMMANDE, ID_TYPE_ECHANTILLON, ID_ANIMAL, DATE_RECEPTION) VALUES (?,?,?,?)");
            ps.setInt(1, pIdCommande);
            ps.setInt(2, pIdTypeEchantillon);
            ps.setInt(3, pIdAnimal);
            ps.setDate(4, (java.sql.Date)pDateReception);
            int statut = ps.executeUpdate();
            b.close();
            return "success";
        }
        catch(SQLException ex) {
            System.out.println("ma requete");
            System.out.println("SQLException checkAnimal " + ex.getMessage());
            System.out.println("SQLState checkAnimal: " + ex.getSQLState());
            System.out.println("VendorError checkAnimal: " + ex.getErrorCode());
            b.close();
        return "failed";
        }
    }
        
        

    public int searchIdTypeSample(Samples sample) {
        ConnectBDD b = new ConnectBDD();
        Connection con = b.getMyConnexion();
        int resultID = 0;
        try {
            if (con == null) {
                throw new SQLException("Can't get database connection");
            }
            PreparedStatement ps;
            ps = con.prepareStatement("select ID_TYPE_ECHANTILLON from TYPE_ECHANTILLON where TYPE_ECH = '" + sample.getType() + "'");
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                resultID = (result.getInt("ID_TYPE_ECHANTILLON"));
            }
        } catch (SQLException ex) {
            System.out.println("ma requete");
            System.out.println("SQLException checkAnimal " + ex.getMessage());
            System.out.println("SQLState checkAnimal: " + ex.getSQLState());
            System.out.println("VendorError checkAnimal: " + ex.getErrorCode());
            b.close();
        }
        return resultID;
    }
}
