package subiectB.creationale;

public class Restaurant {
    private String nume;
    private int nrLocuri;
    private static Restaurant restaurant = null;

    private Restaurant(String nume, int nrLocuri) {
        this.nume = nume;
        this.nrLocuri = nrLocuri;
    }

    public static Restaurant getInstance(String nume,int nrLocuri){
        if(restaurant == null){
            restaurant = new Restaurant(nume,nrLocuri);
        }
        return restaurant;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("subiectB.creationale.Restaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
