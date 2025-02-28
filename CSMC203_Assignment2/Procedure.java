

public class Procedure {
	//Instance variables
    private String nameProcedure, date, namePractitioner;
    private double charges;
    
    //Constructor
    public Procedure() {
        
    }
    
    public Procedure(String nameProcedure, String date) {
        this.nameProcedure = nameProcedure;
        this.date = date;
    }
    
    public Procedure(String nameProcedure, String date, String namePractitioner, double charges) {
        this.nameProcedure = nameProcedure;
        this.date = date;
        this.namePractitioner = namePractitioner;
        this.charges = charges;
    }
    
    //Accessors
    public String getNameProcedure() {
        return nameProcedure;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getNamePractitioner() {
        return namePractitioner;
    }
    
    public double getCharges() {
        return charges;
    }

    //Mutators
    public void setNameProcedure(String nameProcedure) {
        this.nameProcedure = nameProcedure;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setNamePractitioner(String namePractitioner) {
        this.namePractitioner = namePractitioner;
    }
    
    public void setCharges(double charges) {
        this.charges = charges;
    }
    
    //Methods
    public String toString() {
    	return "		Procedure: " + nameProcedure + "\n		Procedure date=" + date + "\n		Practitioner=" + namePractitioner + "\n		Charge=" + String.format("%.2f", charges) + "\n";
    }
}