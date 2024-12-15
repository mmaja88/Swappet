package Swappet.controller;

public class OglasDTO {

    private int id;  // idOglas iz Oglasa
    private String description;  // opis iz Oglasa
    private String type;  // tipOglas iz Oglasa
    private Double price;  // cijena iz Ulaznice
    private String address;  // combination ulice i grada iz Oglasa
    private String date;  // datum iz Oglasa
    private Integer numberOfTickets; // broj ulaznica


    public OglasDTO(int id, String description, String type, Double price, String address, String date,Integer numberOfTickets) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.price = price;
        this.address = address;
        this.date = date;
        this.numberOfTickets = numberOfTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}