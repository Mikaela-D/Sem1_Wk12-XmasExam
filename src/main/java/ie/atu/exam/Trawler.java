package ie.atu.exam;

public class Trawler extends Ship{

    private int cargo;

    public Trawler() {
    }

    public Trawler(String shipName, String year, int minCrew, int cargo){
        super(shipName, year, minCrew);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + shipName + " " + cargo;
    }
}
