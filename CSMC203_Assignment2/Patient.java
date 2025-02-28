

public class Patient {
    //Instance variables
    private String firstName, middleName, lastName, streetAddress, city, state, phNo, emergencyName, emergencyPhNo;
    private int zipCode;
    
    //Constructor
    public Patient() {
        
    }
    
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String phNo, String emergencyName, String emergencyPhNo, int zipCode) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.phNo = phNo;
        this.emergencyName = emergencyName;
        this.emergencyPhNo = emergencyPhNo;
        this.zipCode = zipCode;
    }
    
    //Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyPhNo() {
        return emergencyPhNo;
    }

    public int getZipCode() {
        return zipCode;
    }

    //Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public void setEmergencyPhNo(String emergencyPhNo) {
        this.emergencyPhNo = emergencyPhNo;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
    //Methods
    public String buildFullName() {
    	return firstName + " " + middleName + " " + lastName;
    }
    
    public String buildAddress() {
    	return streetAddress + " " + city + " " + state + " " + zipCode;
    }
    
    public String buildEmergencyContact() {
    	return emergencyName + " " + emergencyPhNo;
    }
    
    public String toString() {
    	return "	Name: " + buildFullName() + "\n	Address: " + buildAddress() + "\n	EmergencyContact: " + buildEmergencyContact();
    }
}