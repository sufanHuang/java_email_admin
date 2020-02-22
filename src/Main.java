public class Main {

    public static void main(String[] args) {
        Email email = new Email ("Sufan", "Huang");
        email.setAlternateMail("sufanhuang@gmail.com");
        System.out.println(email.getAlternateMail());
        System.out.println(email.showInfo());
    }
}
