public class Hotel {
    private Customer customer;
    private String kingOfRoom;
    private float price;
    private int days;

    public Hotel() {
    }

    public Hotel(Customer customer, String kingOfRoom, float price, int days) {
        this.customer = customer;
        this.kingOfRoom = kingOfRoom;
        this.price = price;
        this.days = days;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getKingOfRoom() {
        return kingOfRoom;
    }

    public float getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    public float payRoom() {
        return days * price;
    }
}
