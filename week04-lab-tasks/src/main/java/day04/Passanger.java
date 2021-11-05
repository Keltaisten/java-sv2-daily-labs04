package day04;

public class Passanger {
    private String name;
    private String ticket;
    private int baggageAmount;

    public Passanger(String name, String ticket, int baggageAmount) {
        this.name = name;
        this.ticket = ticket;
        this.baggageAmount = baggageAmount;
    }

    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }
}
