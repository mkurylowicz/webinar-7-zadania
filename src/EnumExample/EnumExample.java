package EnumExample;

public class EnumExample {
    public static void main(String[] args) {

        Country country = Country.PL;
        Country country2 = Country.DE;

        System.out.println("To jest mój kraj PL");
        System.out.println("To jest mój kraj Polska");
        System.out.println("To jest mój kraj " + country.getFullname());
        System.out.println("Mieszkam w " + country);
        System.out.println(" A ja mieszkam w " + country2);
        System.out.println(" A ja mieszkam w " + country2.getFullname());
    }
}
