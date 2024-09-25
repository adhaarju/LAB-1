/*Create a class Car with attributes: make, model, and year. 
Write a constructor to initialize these attributes and a method displayDetails() to print the car's details. */

class Car {

    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("car make: " + make);
        System.out.println("car model: " + model);
        System.out.println("car year: " + year);
    }

    public static void main(String[] args) {
        Car mycar = new Car("Renault", "Duster", 2012);
        mycar.displayDetails();
    }
}
