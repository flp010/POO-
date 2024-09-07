package br.edu.fatecfranca.ex3;

import java.time.LocalDate;

public class MainReservation {
    public static void main(String[] args) {

        Passenger p1 = new Passenger(1, "Zé", "210.210.210-21");
        Passenger p2 = new Passenger(2, "Jão", "012.012.012-01");

        Flight f1 = new Flight(1, "Brazil", "Japão");
        Flight f2 = new Flight(2, "Japão", "Brasilia");

        LocalDate customDate1 = LocalDate.of(2023, 12, 25);
        LocalDate customDate2 = LocalDate.of(2024, 6, 26);

        Reservation r1 = new Reservation(1, customDate1, f1);
        Reservation r2 = new Reservation(2, customDate2, f2);

        r1.addPassenger(p1);
        r1.addPassenger(p2);
        r2.addPassenger(p2);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
