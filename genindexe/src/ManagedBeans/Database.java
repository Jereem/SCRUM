package ManagedBeans;

/**
 * This class manage all the methods of the different classes which interact
 * with the database.
 */
import Tools.ConnectBDD;
import beans.Adress;
import beans.Analysis;
import beans.Animals;
import beans.Category;
import beans.Customers;
import beans.Date;
import beans.Orders;
import beans.Samples;
import beans.Species;
import beans.Storage;
import beans.Types_analysis;
import beans.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Database {

    private Animals animal;

    private Samples sample;

    private Types_analysis typeAna;

    private Analysis analysis;

    private Users user;

    private Date d1;

    private Date d2;

    private Customers customer;

    private Orders order;
    

    /**
     * The adress of a customer.
     */
    private Adress adress;

    public Storage storage;

    private ConnectBDD b;
    private Connection con;

    public Database() {
        // Bouml preserved body begin 00043002
        b = new ConnectBDD();
        con = b.getMyConnexion();

        // Bouml preserved body end 00043002
    }

    /**
     * This function permits to list all the orders in the database.
     */
//  public List<Orders> getListOrder() throws SQLException {
//    // Bouml preserved body begin 0003D002
//	  List<Orders> list = new ArrayList<Orders>();
//          if (con == null) {
//            throw new SQLException("Can't get database connection");
//        }
//        PreparedStatement ps;
//        ps = con.prepareStatement("select * from ");
//        //get customer data from database
//        ResultSet result = ps.executeQuery();
//        while (result.next()) {
//            Orders pOrder = new Orders();
//            pOrder.setPaid(result.getString("Nom_Projet"));
//	  list.add(this.order);
//        }
//	  return(list);
//    // Bouml preserved body end 0003D002
//  }
    /**
     * This function permits to search the order in the database that have the
     * customer in parameter.
     */
    public Orders searchOrder(Customers customer) {
        // Bouml preserved body begin 00042F02
        return (this.order);
        // Bouml preserved body end 00042F02
    }

    /**
     * This function permits to search the order in the database that has this
     * id.
     */
    public Orders searchOrder(int id) {
        // Bouml preserved body begin 00042F82
        return (this.order);
        // Bouml preserved body end 00042F82
    }

    /**
     * This function permits to save in the database the order in parameter.
     */
    public void saveOrder(Orders order) {
        // Bouml preserved body begin 00043082
        this.order = order;
        // Bouml preserved body end 00043082
    }

    public Samples searchSample(String id) throws SQLException {
        // Bouml preserved body begin 00043102
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

        Samples sa2 = new Samples(id, result.getString("Type_Ech"), dateSQLToJava(date_sampling), dateSQLToJava(date_storage), new Animals((result.getString("Nom_Espece")), result.getString("Date_naissance"), result.getString("Nom_Espece")));

        return sa2;
        // Bouml preserved body end 00043102
    }

    public List<Samples> getListSamples() {
        // Bouml preserved body begin 00043182
        List<Samples> listS = new ArrayList<Samples>();
        listS.add(this.sample);
        return (listS);
        // Bouml preserved body end 00043182
    }
    
    public List<String> GetListTypeSamples() throws SQLException {
    	PreparedStatement ps;
    	ps=con.prepareStatement("Select * From Type_Echantillon");
    	ResultSet result = ps.executeQuery();
    	List<String> LS = new ArrayList<>();
    	while(result.next()){
    		
    		LS.add(result.getString("Type_Ech"));
    	}
    	return LS;
    }

    public void saveSample(Samples sample) {
        // Bouml preserved body begin 00043202
        this.sample = sample;
        // Bouml preserved body end 00043202
    }

    public List<Animals> searchAnimal(String specie) throws SQLException {
        List<Animals> list = new ArrayList<>();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from Animal natural join Espece where Nom_Espece = " + specie + "");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Animals pAnimal = new Animals();
            pAnimal.setNumberBirthday(result.getString("Date_Naissance"));
            pAnimal.setNom(result.getString("Nom_Animal"));
            pAnimal.setSpecie(specie);
            list.add(pAnimal);
        }
        return (list);
        // Bouml preserved body end 00043282
    }

    /**
     * This function permits to get the user that use this session.
     */
    public Users getUser() {
        // Bouml preserved body begin 00043502
        return user;
        // Bouml preserved body end 00043502
    }

    public List<Customers> getListCustomers() throws SQLException {
        // Bouml preserved body begin 000234C5
        List<Customers> listC = new ArrayList<>();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from Client natural join Adresse");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Customers pCustomers = new Customers();
            Adress pAdress = new Adress();
            pAdress.setCity(result.getString("Ville"));
            pAdress.setCountry(result.getString("Pays"));
            pAdress.setNumber(result.getInt("Num_Rue"));
            pAdress.setStreet(result.getString("Nom_Rue"));
            pAdress.setZipCode(result.getInt("CP"));
            pCustomers.setAdress(pAdress);
            pCustomers.setEmail(result.getString("Mail"));
            pCustomers.setID(result.getInt("ID_Client"));
            pCustomers.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
            pCustomers.setPhone(result.getString("Tel"));
            listC.add(pCustomers);
        }
        return (listC);
        // Bouml preserved body end 000234C5
    }
    
    /**
     * Surcharge de la methode precedente avec le nom du client
     * @param name
     * @return liste 
     * @throws SQLException
     */
    public List<Customers> getListCustomers(String name) throws SQLException {
        // Bouml preserved body begin 000234C5
        List<Customers> listC = new ArrayList<>();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        name+="%";
        PreparedStatement ps;
        ps = con.prepareStatement("select * from Client natural join Adresse WHERE nom_client=" + name);
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Customers pCustomers = new Customers();
            Adress pAdress = new Adress();
            pAdress.setCity(result.getString("Ville"));
            pAdress.setCountry(result.getString("Pays"));
            pAdress.setNumber(result.getInt("Num_Rue"));
            pAdress.setStreet(result.getString("Nom_Rue"));
            pAdress.setZipCode(result.getInt("CP"));
            pCustomers.setAdress(pAdress);
            pCustomers.setEmail(result.getString("Mail"));
            pCustomers.setID(result.getInt("ID_Client"));
            pCustomers.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
            pCustomers.setPhone(result.getString("Tel"));
            listC.add(pCustomers);
        }
        return (listC);
        // Bouml preserved body end 000234C5
    }
    

    public Customers searchCustomerName(String name) throws SQLException {
        // Bouml preserved body begin 00023545
        Customers client = new Customers();
        PreparedStatement ps = con.prepareStatement("Select * FROM Client where nom_client=" + name);
        ResultSet result = ps.executeQuery();
        client.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
        client.setID(result.getInt("ID_Client"));
        client.setAdress(new Adress(result.getInt("Cdp"), result.getString("Ville")));
        client.setPhone(result.getString("Tel"));
        if (name.equals(client.getLastName())) {
            return client;
        } else {
            Customers cust = new Customers("jean", "dupond", 86000, "Poitiers", "090909", 1);
            return cust;
        }
        // Bouml preserved body end 00023545
    }

    public Customers searchCustomerID(int ID) throws SQLException {
        // Bouml preserved body begin 000235C5
        Customers client = new Customers();
        PreparedStatement ps = con.prepareStatement("Select * FROM Client where ID_Client=" + ID);
        ResultSet result = ps.executeQuery();
        client.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
        client.setID(result.getInt("ID_Client"));
        client.setAdress(new Adress(result.getInt("Cdp"), result.getString("Ville")));
        client.setPhone(result.getString("Tel"));
        if (client.getID() == ID) {
            return client;
        } else {
            Customers cust = new Customers("jean", "dupond", 86000, "Poitiers", "090909", 1);
            return cust;
        }
        // Bouml preserved body end 000235C5
    }

    public void saveCustomer(Customers cust) throws SQLException {
        // Bouml preserved body begin 00023645
        PreparedStatement ps = con.prepareStatement("Select ID_client From client where Id_Client =" + cust.getID());
        ResultSet result = ps.executeQuery();
        if (!result.wasNull()) {
            b.getMyStatement().executeUpdate("Update Client Set Nom_Client=" + cust.getFirstName() + ", Prenom_client=" + cust.getLastName() + ", Cdp=" + cust.getAdress().getZipCode() + ", Ville=" + cust.getAdress().getCity() + ", Tel=" + cust.getPhone() + " where id_client=" + cust.getID());
        } else {
            b.getMyStatement().executeUpdate("Insert Into Client(Nom_Client, Prenom_Client, Cdp, Ville, Tel) Values(" + cust.getFirstName() + ", " + cust.getLastName() + ", " + cust.getAdress().getZipCode() + ", " + cust.getAdress().getCity() + ", " + cust.getPhone());
            System.out.println("new data record");
        }
        // Bouml preserved body end 00023645
    }

    public List<Types_analysis> getListAnalysisType() throws SQLException {
        // Bouml preserved body begin 000236C5
        List<Types_analysis> listTA = new ArrayList<>();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from TypeAnalyse");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Types_analysis pTypes_analysis = new Types_analysis();
            pTypes_analysis.setPrice(result.getInt("Prix_Unitaire"));
            pTypes_analysis.setType(result.getString("Type_Analy"));
            listTA.add(pTypes_analysis);
        }
        return (listTA);
        // Bouml preserved body end 000236C5
    }

    public Analysis searchAnalysis(Types_analysis type) {
        // Bouml preserved body begin 00023745
        if (this.analysis.getTypeAnalysis() == type) {
            return this.analysis;
        } else {
            Analysis ana = new Analysis(2, typeAna, d2);
            return ana;
        }
        // Bouml preserved body end 00023745
    }

    public Analysis searchAnalysisID(int ID) {
        // Bouml preserved body begin 000237C5
        if (this.analysis.getID() == ID) {
            return this.analysis;
        } else {
            Analysis ana = new Analysis(2, typeAna, d2);
            return ana;
        }
        // Bouml preserved body end 000237C5
    }

    public void saveAnalysis(Analysis analysis) {
        // Bouml preserved body begin 00023845
        if (analysis.getID() == this.analysis.getID()) {
            this.analysis = analysis;
        } else {
            System.out.println("new data record");
        }
        // Bouml preserved body end 00023845
    }

    public Types_analysis searchTypesAnalysis(String name) throws SQLException {
        Types_analysis pTypes_analysis = new Types_analysis();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from TypeAnalyse where Type_Analy = " + name +"");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            
            pTypes_analysis.setPrice(result.getInt("Prix_Unitaire"));
            pTypes_analysis.setType(result.getString("Type_Analy"));
        }
        return pTypes_analysis;
    }

    public void saveAnalysisType(Types_analysis typeAnalysis) {
        // Bouml preserved body begin 00023945
        if (typeAnalysis.getType().equals(this.typeAna.getType())) {
            this.typeAna = typeAnalysis;
        } else {
            System.out.println("new data record");
        }
        // Bouml preserved body end 00023945
    }

    public String saveBddCustomer() throws SQLException {
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        //etu.saveNewAdherent();
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramfirstName = this.customer.getFirstName();
            String paramLastName = this.customer.getLastName();
            String paramEmail = this.customer.getEmail();
            String paramPhone = this.customer.getPhone();
            int paramID = this.customer.getID();

            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement ps = con.prepareStatement("INSERT INTO Client(ID_CLIENT, Nom_Client, Tel) VALUES (?,?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setInt(1, paramID);
            ps.setString(2, paramLastName);
            ps.setString(3, paramPhone);
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }
    }
    
    /**
     * Méthode permettant d'enregistrer une nouvelle espèce
     * @param specie
     * @param category
     * @return "success" si l'espèce est sauvegardée, sinon "failed"
     * @throws java.sql.SQLException
     */
    public String saveSpecie(String specie, int category) throws SQLException {
        Category paramCat = new Category(category);
        Species paramSpecie = new Species(specie, paramCat);
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Espece(Nom_Espece, ID_CATEGORIE) VALUES (?,?)");
            ps.setString(1, paramSpecie.getNameSpecie());
            ps.setInt(2, paramSpecie.getCategory().getID());
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }

    }
    
    public List<Category> getListCategory() throws SQLException {
        // Bouml preserved body begin 000236C5
        List<Category> listC = new ArrayList<>();
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from Categorie");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Category pCategory = new Category();
            pCategory.setID(result.getInt("ID_CATEGORIE"));
            pCategory.setNameCategory(result.getString("NOM_CATEGORIE"));
            listC.add(pCategory);
        }
        return (listC);
        // Bouml preserved body end 000236C5
    }
    
    public JList getJListCategory() throws SQLException {
        JList jList = new JList();
        DefaultListModel dlm=new DefaultListModel();
        // Bouml preserved body begin 000236C5
        if (con == null) {
            throw new SQLException("Can't get database connection");
        }
        PreparedStatement ps;
        ps = con.prepareStatement("select * from Categorie");
        //get customer data from database
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            Category pCategory = new Category();
            pCategory.setID(result.getInt("ID_CATEGORIE"));
            pCategory.setNameCategory(result.getString("NOM_CATEGORIE"));
            dlm.addElement(pCategory.getNameCategory());
            jList.setModel(dlm);
        }
        return (jList);
        // Bouml preserved body end 000236C5
    }
 
    public String saveBddUser() throws SQLException {
        ConnectBDD con = new ConnectBDD();
        Connection b = con.getMyConnexion();
        if (b == null) {
            throw new SQLException("Can't get database connection");
        }
        //etu.saveNewAdherent();
        try {
            /* Récupération des paramètres d'URL saisis par l'utilisateur */
            String paramIdentifiant = this.user.getLogin();
            String paramMotDePasse = this.user.getPassword();
            /* Création de l'objet gérant les requêtes préparées */
            PreparedStatement ps = b.prepareStatement("INSERT INTO Connexion(ID_CLIENT, MAIL, Login, Mdp) VALUES (1,'teddy@gmail.com',?,?)");
            /*
             * Remplissage des paramètres de la requête grâce aux méthodes
             * setXXX() mises à disposition par l'objet PreparedStatement.
             */
            ps.setString(1, paramIdentifiant);
            ps.setString(2, paramMotDePasse);
            /* Exécution de la requête */
            int statut = ps.executeUpdate();
            return "success";
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return "failed";
        }

    }

  
   /**
     *prend une date au format java et la convertie au format SQL
     * @param datejava (dd-mm-aaaa)
     * @return dateSQl (aaaa-mm-dd)
     */
    public String dateJavaToSQL(java.util.Date datejava){
        String convert = datejava.toString();
         String dd =convert.substring(0,2);
         String mm= convert.substring(3,5);
         String aa= convert.substring(6,10);
       
         String dateSQL=aa+"-"+mm+"-"+dd;
        
         System.out.println(dateSQL);
        return dateSQL;
    }
    
    /**
     * prend une date au format SQL et la convertie au format date de java
     *
     * @param dateSQL (aaaa-mm-dd)
     * @return da
     */
    public beans.Date dateSQLToJava(java.sql.Date dateSQL){
      
        int dd = dateSQL.getDate();
        int mm = (dateSQL.getMonth())+1;
        int aaaa = dateSQL.getYear();

        beans.Date da = new Date(dd,mm,aaaa);

        return da;
    }
  
}

    



