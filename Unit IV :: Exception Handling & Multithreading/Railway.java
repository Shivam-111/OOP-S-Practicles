class RailwayReservation {
    private int availableTickets = 1; // Only 1 ticket available

    // Synchronized method to book ticket
    public synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            availableTickets--; // Reduce ticket count
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    private RailwayReservation reservation;
    private String passengerName;

    public Passenger(RailwayReservation reservation, String passengerName) {
        this.reservation = reservation;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        reservation.bookTicket(passengerName);
    }
}

public class Railway {
    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        // Two passengers trying to book at the same time
        Passenger p1 = new Passenger(reservation, "Shivam");
        Passenger p2 = new Passenger(reservation, "Rahul");

        p1.start();
        p2.start();
    }
}