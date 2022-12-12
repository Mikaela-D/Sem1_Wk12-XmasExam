package ie.atu.exam;

public class Ship {
    private String shipName;
    private String year;
    private int minCrew;

    public Ship(){ //Default constructor
    }

    public Ship(String shipName, String year, int minCrew){
        this.shipName = shipName;
        this.year = year;
        this.minCrew = minCrew;
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

    public int getMinCrew() {
        return minCrew;
    }

    public void setMinCrew(int minCrew) {
        this.minCrew = minCrew;
    }

    @Override
    public String toString() {
        return super.toString() + "Ship Name : " + shipName + "Year : " + year + "Minimum Crew : " + minCrew;
    }


    /*static void vesselDetails(){
        System.out.println("Ship name : " + );
    }*/

   /* public static void main(String[] args) {
        Ship vesselDetails = new Ship(shipName, maxPassengers);
        System.out.println("Name : " + vesselDetails.shipName + "  Year : " + vesselDetails.year + "  Minimum Crew : " + vesselDetails.minCrew);
    }*/

}
