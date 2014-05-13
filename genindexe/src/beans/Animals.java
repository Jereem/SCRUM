package beans;


 

public class Animals {
  /**
   * The animal belongs to a specie.
   */
  private String specie;
  private String nom;
  private Boolean sexe;
  private java.util.Date numberBirthday;

  public Animals(){
      
  }
  public Animals(String specie, java.util.Date birthday, String nom) {
    // Bouml preserved body begin 00020D83
	  this.specie = specie;
	  this.numberBirthday = birthday;
	  this.nom = nom;
    // Bouml preserved body end 00020D83
  }
  public Animals(java.util.Date birthday, String nom) {
    // Bouml preserved body begin 00020D83
	  this.sexe = sexe;
	  this.numberBirthday = birthday;
	  this.nom = nom;
    // Bouml preserved body end 00020D83
  }

    public Boolean getSexe() {
        return sexe;
    }

    public void setSexe(Boolean sexe) {
        this.sexe = sexe;
    }

  public String getSpecie() {
    // Bouml preserved body begin 00022C83
	  return this.specie;
    // Bouml preserved body end 00022C83
  }

  public java.util.Date getNumberBirthday() {
    // Bouml preserved body begin 00022D03
	  return this.numberBirthday;
    // Bouml preserved body end 00022D03
  }
  
  public String getNom()
  {
	  return this.nom;
  }

  public void setSpecie(String new_Specie) {
    // Bouml preserved body begin 00022D83
	  this.specie = new_Specie;
    // Bouml preserved body end 00022D83
  }

  public void setNumberBirthday(java.util.Date new_NumberBirthday) {
    // Bouml preserved body begin 00022E03
	  this.numberBirthday = new_NumberBirthday;
    // Bouml preserved body end 00022E03
  }
  
  public void setNom(String nom){
	  this.nom = nom;
  }

}
