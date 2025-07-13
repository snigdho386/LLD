public class Ticket {

    public String ticketId;
    public long entryTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;

    Ticket(String ticketId,long entryTime, Vehicle vehicle, ParkingSpot parkingSpot){
        this.entryTime = entryTime;
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
