package ie.atu.exam;

public class Ship {
    private String shipName;
    private String year;
    private Integer minCrew;

    public Ship(){
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getMinCrew() {
        return minCrew;
    }

    public void setMinCrew(Integer minCrew) {
        this.minCrew = minCrew;
    }
}
