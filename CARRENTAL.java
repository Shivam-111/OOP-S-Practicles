class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        Rent = GetRent();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            return 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            return 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            return 2500;
        } else {
            return 0;
        }
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL car1 = new CARRENTAL();
        car1.GetCar(101, "SUV");
        car1.ShowCar();
    }
}