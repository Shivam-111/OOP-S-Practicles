// Abstract class Ride
abstract class Ride {
    protected double distance;  // distance in km

    // Constructor
    public Ride(double distance) {
        this.distance = distance;
    }

    // Abstract method
    public abstract double calculateFare();
}

// Subclass BikeRide
class BikeRide extends Ride {
    public BikeRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 5;  // ₹5 per km
    }
}

// Subclass AutoRide
class AutoRide extends Ride {
    public AutoRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 8;  // ₹8 per km
    }
}

// Subclass CarRide
class CarRide extends Ride {
    public CarRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 12;  // ₹12 per km
    }
}

// Main class to test
public class RideBookingApp {
    public static void main(String[] args) {
        // Store different rides in an array
        Ride[] rides = {
            new BikeRide(10),   // 10 km bike ride
            new AutoRide(15),   // 15 km auto ride
            new CarRide(20)     // 20 km car ride
        };

        // Calculate fares using runtime polymorphism
        for (Ride ride : rides) {
            System.out.println(
                ride.getClass().getSimpleName() + " Fare: ₹" + ride.calculateFare()
            );
        }
    }
}