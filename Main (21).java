class CarRental {
    int carId;
    String carType;
    float rent;

    void getCar(int cd, String ct) {
        carId = cd;
        carType = ct;
    }

    void getRent(float r) {
        rent = r;
        System.out.println("small car: 100");
        System.out.println("van: 800");
        System.out.println("small van: 1400");

        if (rent == 100) {
            System.out.println("small car: 100");
        } else if (rent == 800) {
            System.out.println("van: 800");
        } else if (rent == 1400) {
            System.out.println("small van: 1400");
        } else {
            System.out.println("Invalid rent value");
        }
    }
}

class Main {
    public static void main(String[] args) {
        CarRental ca = new CarRental();
        ca.getCar(1, "small car");
        ca.getRent(100);
    }
}
