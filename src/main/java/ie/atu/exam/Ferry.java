package ie.atu.exam;

public class Ferry extends Ship{

    private int maxPassengers;

    public Ferry(){

    }

    public Ferry(String shipName, String year, int minCrew, int maxPassengers){
        super(shipName, year, minCrew);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

   /* public static void main(String[] args) {
        Ferry vesselDetails = new Ferry();
        vesselDetails.shipName();
        System.out.println(vesselDetails.shipName + " " + vesselDetails.maxPassengers);
    }*/

  /*  public Ferry(String shipName, int maxPassengers) {
        super(shipName, maxPassengers);
        System.out.println("Name : " + shipName + "  Max Passengers" +  maxPassengers);
    }*/

    @Override
    public String toString() {
        return super.toString() + " " + shipName + " " + maxPassengers;
    }
}
