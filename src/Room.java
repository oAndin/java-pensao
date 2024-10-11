public class Room {

    public boolean occupied = false;
    private double price;
    private int roomsNumber;
    private String tenant;
    private String email;

    public Room(boolean occupied, double price, int roomsNumber, String tenant, String email) {
        this.occupied = occupied;
        this.price = price;
        this.roomsNumber = roomsNumber;
        this.tenant = tenant;
        this.email = email;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        tenant = tenant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "nome: "
                +
                tenant
                +
                ", email: "
                +
                email
                ;
    }
}
