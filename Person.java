public class Person {
    private String fName,lName;
    private String address;
    private  String city;
    private int zip;
    private int phoneNumber;
    private String emailId;
    public Person(){ super();}
 public Person (String fName,String lName,int phoneNumber,int zip,String address,String emailId,String city)
 {
     super();
     this.address= address;
     this.city=city;
     this.phoneNumber=phoneNumber;
     this.emailId=emailId;
     this.fName=fName;
     this.lName=lName;
     this.zip=zip;
 }
    public int getZip(){ return zip; }
    public void setZip(int zip){this.zip=zip;}
    public int getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(int phoneNumber){this.phoneNumber=phoneNumber;}
    public String getfName(){return fName;}
    public void setfName(String fName){this.fName=fName;}
    public String getlName(){return lName;}
    public void setlName(String lName){this.lName=lName;}
    public String getAddress(){return address;}
    public void setAddress(String address){this.address=address;}
    public String getCity(){return city;}
    public void setCity(String city){this.city=city;}
    public String getEmailId(){return emailId;}
    public void setEmailId(String emailId){this.emailId=emailId;}
    @Override
    public String toString() {
        return "Person[fName=" + fName + ", lName="+ lName +", zip=" +zip+ "," +
         "phoneNumber=" +phoneNumber+ ", address="+address+",emailId="+emailId+"]";
    }
}
