package ManagedBeans;

/**
 * This class manage all the methods of the different classes which interact
 * with the database.
 */
<<<<<<< HEAD


=======
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM
import Tools.ConnectBDD;
import beans.Adress;
import beans.Analysis;
import beans.Animals;
import beans.Customers;
import beans.Date;
import beans.Orders;
import beans.Samples;
import beans.Storage;
import beans.Types_analysis;
import beans.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
<<<<<<< HEAD
	private Animals animal;
=======
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Samples sample;
=======
    private Animals animal;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Types_analysis typeAna;
=======
    private Samples sample;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Analysis analysis;
=======
    private Types_analysis typeAna;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Users user;
=======
    private Analysis analysis;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Date d1;
=======
    private Users user;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Date d2;
=======
    private Date d1;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Customers customer;
=======
    private Date d2;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private Orders order;
=======
    private Customers customer;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	/**
	 * The adress of a customer.
	 */
	private Adress adress;
=======
    private Orders order;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Storage storage;
=======
    /**
     * The adress of a customer.
     */
    private Adress adress;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	private ConnectBDD b;
	private Connection con;
=======
    public Storage storage;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Database() {
		// Bouml preserved body begin 00043002
		b = new ConnectBDD();
		con = b.getMyConnexion();
=======
    private ConnectBDD b;
    private Connection con;
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
		// Bouml preserved body end 00043002
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
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
=======
    /**
     * This function permits to search the order in the database that has this
     * id.
     */
    public Orders searchOrder(int id) {
        // Bouml preserved body begin 00042F82
        return (this.order);
        // Bouml preserved body end 00042F82
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	/**
	 * This function permits to search the order in the database that have the customer in parameter.
	 */
	public Orders searchOrder(Customers customer) {
		// Bouml preserved body begin 00042F02
		return(this.order);
		// Bouml preserved body end 00042F02
	}
=======
    /**
     * This function permits to save in the database the order in parameter.
     */
    public void saveOrder(Orders order) {
        // Bouml preserved body begin 00043082
        this.order = order;
        // Bouml preserved body end 00043082
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	/**
	 * This function permits to search the order in the database that has this id.
	 */
	public Orders searchOrder(int id) {
		// Bouml preserved body begin 00042F82
		return(this.order);
		// Bouml preserved body end 00042F82
	}
=======
    public Samples searchSample(String id) {
        // Bouml preserved body begin 00043102
        return this.sample;
        // Bouml preserved body end 00043102
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	/**
	 * This function permits to save in the database the order in parameter.
	 */
	public void saveOrder(Orders order) {
		// Bouml preserved body begin 00043082
		this.order =order;
		// Bouml preserved body end 00043082
	}
=======
    public List<Samples> getListSamples() {
        // Bouml preserved body begin 00043182
        List<Samples> listS = new ArrayList<Samples>();
        listS.add(this.sample);
        return (listS);
        // Bouml preserved body end 00043182
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Samples searchSample(String id) {
		// Bouml preserved body begin 00043102
		return this.sample;
		// Bouml preserved body end 00043102
	}
=======
    public void saveSample(Samples sample) {
        // Bouml preserved body begin 00043202
        this.sample = sample;
        // Bouml preserved body end 00043202
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public List<Samples> getListSamples() {
		// Bouml preserved body begin 00043182
		List<Samples> listS = new ArrayList<Samples>();
		listS.add(this.sample);
		return(listS);
		// Bouml preserved body end 00043182
	}

	public void saveSample(Samples sample) {
		// Bouml preserved body begin 00043202
		this.sample = sample;
		// Bouml preserved body end 00043202
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public List<Animals> searchAnimal(String specie) throws SQLException {
		List<Animals> list = new ArrayList<>();
		if (con == null) {
			throw new SQLException("Can't get database connection");
		}
		PreparedStatement ps;
		ps = con.prepareStatement("select * from Animal natural join Espece where Nom_Espece = " + specie +"");
		//get customer data from database
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			Animals pAnimal = new Animals();
			pAnimal.setNumberBirthday(result.getString("Date_Naissance"));
			pAnimal.setNom(result.getString("Nom_Animal"));
			pAnimal.setSpecie(specie);
			list.add(pAnimal);
		}
		return(list);
		// Bouml preserved body end 00043282
	}
=======
    /**
     * This function permits to get the user that use this session.
     */
    public Users getUser() {
        // Bouml preserved body begin 00043502
        return user;
        // Bouml preserved body end 00043502
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	/**
	 * This function permits to get the user that use this session.
	 */
	public Users getUser() {
		// Bouml preserved body begin 00043502
		return user;
		// Bouml preserved body end 00043502
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
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
		return(listC);
		// Bouml preserved body end 000234C5
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Customers searchCustomerName(String name) throws SQLException {
		// Bouml preserved body begin 00023545
		Customers client = new Customers();
		PreparedStatement ps= con.prepareStatement("Select * FROM Client where nom_client="+name);
		ResultSet result = ps.executeQuery();
		client.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
		client.setID(result.getInt("ID_Client"));
		client.setAdress(new Adress(result.getInt("Cdp"), result.getString("Ville")));
		client.setPhone(result.getString("Tel"));
		if(name.equals(client.getLastName()))
		{
			return client;
		}
		else
		{
			Customers cust = new Customers("jean", "dupond", 86000,"Poitiers", "090909",1);
			return cust;
		}
		// Bouml preserved body end 00023545
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Customers searchCustomerID(int ID) throws SQLException {
		// Bouml preserved body begin 000235C5
		Customers client = new Customers();
		PreparedStatement ps= con.prepareStatement("Select * FROM Client where ID_Client="+ID);
		ResultSet result = ps.executeQuery();
		client.setName(result.getString("Nom_Client"), result.getString("Prenom_Client"));
		client.setID(result.getInt("ID_Client"));
		client.setAdress(new Adress(result.getInt("Cdp"), result.getString("Ville")));
		client.setPhone(result.getString("Tel"));
		if(client.getID()==ID)
		{
			return client;
		}
		else
		{
			Customers cust = new Customers("jean", "dupond", 86000,"Poitiers", "090909",1);
			return cust;
		}
		// Bouml preserved body end 000235C5
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public void saveCustomer(Customers cust) throws SQLException {
		// Bouml preserved body begin 00023645
		PreparedStatement ps= con.prepareStatement("Select ID_client From client where Id_Client ="+cust.getID());
		ResultSet result=ps.executeQuery();
		if(!result.wasNull())
		{
			b.getMyStatement().executeUpdate("Update Client Set Nom_Client="+cust.getFirstName()+", Prenom_client="+cust.getLastName()+", Cdp="+cust.getAdress().getZipCode()+", Ville="+cust.getAdress().getCity()+", Tel="+cust.getPhone()+" where id_client="+cust.getID());
		}
		else
		{
			b.getMyStatement().executeUpdate("Insert Into Client(Nom_Client, Prenom_Client, Cdp, Ville, Tel) Values("+cust.getFirstName()+", "+cust.getLastName()+", "+cust.getAdress().getZipCode()+", "+cust.getAdress().getCity()+", "+cust.getPhone());
			System.out.println("new data record");
		}
		// Bouml preserved body end 00023645
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
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
		return(listTA);
		// Bouml preserved body end 000236C5
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public List<Analysis> searchAnalysis(Types_analysis type) throws SQLException {
		// Bouml preserved body begin 00023745
		List<Analysis> listA = new ArrayList<>();
		PreparedStatement ps= con.prepareStatement("Select ID_Type From Type_Analyse where Type_Analy= "+type.getType());
		ResultSet result = ps.executeQuery();
		ps=con.prepareStatement("Select * From Analyse where ID_Type="+result.getInt("ID_Type"));
		result = ps.executeQuery();
		if(!result.wasNull())
		{
			while(result.next()){
				int day, month, year;
				ps=con.prepareStatement("Select Date_ana_lot From Lot where ID_lot in (select ID_lot from Tube where ID_Analyse="+result.getString("ID_Analyse")+")");
				ResultSet R2D2 = ps.executeQuery();
				day=R2D2.getDate("Date_ana_lot").getDay();
				month=R2D2.getDate("Date_ana_lot").getMonth();
				year=R2D2.getDate("Date_ana_lot").getYear();
				
				Date date = new Date(day, month, year);
				Analysis analyse = new Analysis(result.getInt("ID_Analyse"), type, date);
			}
		}
		else
		{
			Analysis ana = new Analysis(2, typeAna, d2);
			return ana;
		}
		// Bouml preserved body end 00023745
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Analysis searchAnalysisID(int ID) {
		// Bouml preserved body begin 000237C5
		if(this.analysis.getID()== ID)
		{
			return this.analysis;
		}
		else
		{
			Analysis ana = new Analysis(2, typeAna, d2);
			return ana;
		}
		// Bouml preserved body end 000237C5
	}
=======
    public void saveAnalysis(Analysis analysis) {
        // Bouml preserved body begin 00023845
        if (analysis.getID() == this.analysis.getID()) {
            this.analysis = analysis;
        } else {
            System.out.println("new data record");
        }
        // Bouml preserved body end 00023845
    }
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public void saveAnalysis(Analysis analysis) {
		// Bouml preserved body begin 00023845
		if(analysis.getID()==this.analysis.getID())
		{
			this.analysis = analysis;
		}
		else
		{
			System.out.println("new data record");
		}
		// Bouml preserved body end 00023845
	}
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public Types_analysis searchTypesAnalysis(String name) {
		// Bouml preserved body begin 000238C5
		if(name.equals(this.typeAna.getType()))
		{
			return this.typeAna;
		}
		else
		{
			Types_analysis tAna = new Types_analysis("PCR", 45);
			return tAna;
		}
		// Bouml preserved body end 000238C5
	}
=======
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
        ConnectBDD con = new ConnectBDD();
        Connection b = con.getMyConnexion();
        if (b == null) {
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
            PreparedStatement ps = b.prepareStatement("INSERT INTO Client(ID_CLIENT, Nom_Client, Tel) VALUES (?,?,?)");
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

<<<<<<< HEAD
	public void saveAnalysisType(Types_analysis typeAnalysis) {
		// Bouml preserved body begin 00023945
		if(typeAnalysis.getType().equals(this.typeAna.getType()))
		{
			this.typeAna = typeAnalysis;
		}
		else
		{
			System.out.println("new data record");
		}
		// Bouml preserved body end 00023945
	}

	public String saveBddCustomer() throws SQLException {
		ConnectBDD con = new ConnectBDD();
		Connection b = con.getMyConnexion();
		if (b == null) {
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
			PreparedStatement ps = b.prepareStatement("INSERT INTO Client(ID_CLIENT, Nom_Client, Tel) VALUES (?,?,?)");
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
=======
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
>>>>>>> branch 'develop' of https://github.com/Jereem/SCRUM

}
