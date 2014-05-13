package Tools;

import ManagedBeans.Database;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teddy
 */
public class Date {
    
    private Date maDate;
    
    public Date(){
        maDate = new Date();
    }

    public Date getMaDate() {
        return maDate;
    }

    public void setMaDate(Date maDate) {
        this.maDate = maDate;
    }
    
    public String dateJavaToSQL(java.util.Date datejava){
        String convert = datejava.toString();
         String dd =convert.substring(0,2);
         String mm= convert.substring(3,5);
         String aa= convert.substring(6,10);
       
         String dateSQL=aa+"-"+mm+"-"+dd;
        
         System.out.println(dateSQL);
        return dateSQL;
    }
    
    public static java.util.Date stringToDate(String sDate, String sFormat) { 
        SimpleDateFormat sdf = new SimpleDateFormat(sFormat); 
        try { 
            return sdf.parse(sDate);
        } catch (ParseException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public java.util.Date dateSQLToJava(java.sql.Date dateSQL){
      
        int dd = dateSQL.getDate();
        int mm = (dateSQL.getMonth())+1;
        int aaaa = dateSQL.getYear();

        java.util.Date da = new java.util.Date(dd,mm,aaaa);

        return da;
    }
    
    public void printDate() {
	  System.out.print(this.maDate);
  }
    
    public boolean compareDate(Date pdate) {
        return (this.maDate == pdate);
}
}
