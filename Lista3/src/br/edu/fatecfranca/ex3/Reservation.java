package br.edu.fatecfranca.ex3;

import java.util.ArrayList;
import java.time.LocalDate;

public class Reservation {
    private int id;
    private LocalDate date;
    private ArrayList<Passenger> passengers;
    private Flight flight;

    public Reservation() {
        this.passengers = new ArrayList<>();
    }

    public Reservation(int id, LocalDate date, Flight flight) {
        this.id = id;
        this.date = date;
        this.flight = flight;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passengers=" + passengers +
                ", flight=" + flight +
                '}';
    }
}
