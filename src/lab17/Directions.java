package lab17;

public enum Directions {
    N( "Północ", "North"),
    NE( "Północny wschód", "North-East"),
    E( "Wschód", "East"),
    SE("Południowy wschód", "South-East"),
    S( "Południa", "South"),
    SW( "Południowy zachód", "South-West"),
    W("Zachód", "West"),
    NW( "Północy zachód", "North-West");

    private String namePl;
    private String nameEn;

    Directions( String namePl, String nameEn) {
        this.namePl = namePl;
        this.nameEn = nameEn;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    @Override
    public String toString() {
        return "Directions{" +
                ", namePl='" + namePl + '\'' +
                ", nameEn='" + nameEn + '\'' +
                '}';
    }
}
