package EnumExample;

public enum Country {
    PL("Polska"), EN("Anglia"), DE("Niemcy");

    private String fullname;

    Country(String fullname) {this.fullname = fullname;}

    public String getFullname() {return this.fullname;}
}
