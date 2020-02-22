import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateMail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "java.com";

    public Email( String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = getRandomPassword(defaultPasswordLength);
        System.out.println("Your password is " + password);
        email = firstName.toLowerCase() +"." + lastName.toLowerCase()+"@" + department.toLowerCase() + companySuffix;
    }

    private String setDepartment(){
        System.out.println("New Employee: " + firstName + " Department Codes: \n 1-For sales \n 2-For Development \n 3-For Accounting \n Enter department ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        if(depChoice ==1 ){ return "Sales";}
        else if( depChoice == 2){ return "Development";}
        else if( depChoice == 3){ return "Accounting";}
        else { return "";}
    }

    private String getRandomPassword(int length){
        String passwordSet = "QWERTYIOPASDFGHJKLZXCVBNM1234567890:@#$";
        char [] password = new char[length];
        for(int i=0; i<length; i++){
            int randomNumber=(int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateMail(String altEmail){
        this.alternateMail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateMail() { return alternateMail;}
    public String getPassword() { return password;}

    public String showInfo(){
        return "Display Name: "+ firstName +" " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity " + mailboxCapacity;
    }
}
