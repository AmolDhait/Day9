import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonDetails {
    public static ArrayList<Person> list = new ArrayList<>();

    public PersonDetails() {super();}

    public void findAll()
    {
        if(list.size()==0)
        {
            System.out.println("Empty Details");
            return;
        } else{
            Iterator<Person> iter = list.iterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
            }
        }
    }

    public boolean add(int phoneNumber)
    {
        if(list.size()==0)
        {
            return true;
        }
        for (Person per : list)
        {
            if (per.getPhoneNumber() == phoneNumber)
            {
                System.out.println("Phone Number Already Exists");
                return false;
            }
        }
        return true;
    }

    public boolean update(int phoneNumber, int zip, String fName, String city,
                          String lName, String address, String emailId)
    {
       if (list.size()==0)
       {
           return false;
       }
       for (Person per : list)
       {
           if (per.getPhoneNumber() == phoneNumber)
           {
               per.setAddress(address);
               per.setCity(city);
               per.setEmailId(emailId);
               per.setfName(fName);
               per.setlName(lName);
               per.setZip(zip);
               list.set(phoneNumber-1, per);
               return true;

           }
       }
       if (true)
       {
           System.out.println("No Match Found");

       }
       return false;
    }

    public boolean delete(int phoneNumber)
    {
        if (list.size()==0)
        {
            return false;
        }
        for (Person per : list)
        {
            if (per.getPhoneNumber()==phoneNumber)
            {
                list.remove(phoneNumber - 1);
                System.out.println("Delete Successful");
                return true;
            }
        }
        System.out.println("Person Details Not Exit");
        return true;
    }

    public void index()
    {
        PersonDetails pd = new PersonDetails();
        s: while (true){
            System.out.println("Select Option");
            System.out.println("1. Person details");
            System.out.println("2. Add Person Details");
            System.out.println("3. Update Person Details");
            System.out.println("4. Delete Person Details");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
          s2:  while (true)
            {
                if (num==1)
                {
                    pd.findAll();
                    break;
                }else if (num==2){
                    System.out.println("Please Input the person phone number");

                    int phoneNumber = new Scanner(System.in).nextInt();
                    if (pd.add(phoneNumber)==false)
                    {
                        break s2;
                    }
                    System.out.println("Enter first Name");
                    String fName= new Scanner(System.in).nextLine();
                    System.out.println("Enter last Name");
                    String lName= new Scanner(System.in).nextLine();
                    System.out.println("Enter zip code");
                    int zip = new Scanner(System.in).nextInt();
                    System.out.println("Enter Address");
                    String address = new Scanner(System.in).nextLine();
                    System.out.println("Enter Email Id");
                    String emailId = new Scanner(System.in).nextLine();
                    System.out.println("Enter City");
                    String city = new Scanner(System.in).nextLine();
                    Person per = new Person(fName,lName,phoneNumber,zip,address,emailId,city);
                    list.add(per);
                    System.out.println("Added Successfully");
                    break ;
                }else if (num==3)
                {
                    System.out.println("Enter first Name");
                    String fName= new Scanner(System.in).nextLine();
                    System.out.println("Enter last Name");

                    String lName= new Scanner(System.in).nextLine();
                    System.out.println("Enter Phone Number");

                    int phoneNumber = new Scanner(System.in).nextInt();
                    System.out.println("Enter zip code");

                    int zip = new Scanner(System.in).nextInt();
                    System.out.println("Enter Address");

                    String address = new Scanner(System.in).nextLine();
                    System.out.println("Enter Email Id");

                    String emailId = new Scanner(System.in).nextLine();
                    System.out.println("Enter City");

                    String city = new Scanner(System.in).nextLine();
                    if (pd.update (phoneNumber, zip, fName, city, lName, address, emailId) == false)
                    {
                        break s2;
                    }
                    System.out.println("Update Succeeded");
                    break ;
                }else if (num==4)
                {
                    System.out.println("enter Phone Number");
                    int phoneNumber = new Scanner(System.in).nextInt();
                    if (pd.delete(phoneNumber)==false)
                    {
                        break s2;
                    }
                    break ;
                }else if (num==0)
                {
                    System.out.println("Exit");
                    System.exit(0);
                    break s;
                }else {
                    System.out.println("Input error");
                }
            }
        }
    }
}

