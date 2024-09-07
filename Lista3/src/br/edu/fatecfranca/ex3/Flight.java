package br.edu.fatecfranca.ex3;

// Agregação Fraca com Reservation losangulo aberto

public class Flight {
    private int number;
    private String origin;
    private String destination;

    public Flight() {
    }

    public Flight(int number, String origin, String destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getOrigin() {

        return origin;
    }

    public void setOrigin(String origin) {

        this.origin = origin;
    }

    public String getDestination() {

        return destination;
    }

    public void setDestination(String destination) {

        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
