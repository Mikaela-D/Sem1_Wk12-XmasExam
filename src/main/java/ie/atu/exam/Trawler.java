package ie.atu.exam;

public class Trawler extends Ship{

    private Integer cargo;

    public Trawler() {
    }

    public Trawler(String shipName, String year, Integer minCrew, Integer cargo){
        super(shipName, year, minCrew);
        this.cargo = cargo;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }
}
