package ie.atu.exam;

public class Ferry extends Ship{

    private Integer maxPassengers;

    public Ferry(){
    }

    public Ferry(String shipName, String year, Integer minCrew, Integer maxPassengers){
        super(shipName, year, minCrew);
        this.maxPassengers = maxPassengers;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(Integer maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
