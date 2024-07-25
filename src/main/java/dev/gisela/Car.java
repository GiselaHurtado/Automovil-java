package dev.gisela;

public class Car {
    String brand;
    int model;
    int engineLitres;
    enum FuelType {GASOLINE, DIESEL, BIODIESEL, NATURAL_GAS, ELECTRIC, HYBRID}
    FuelType fuelType;
    enum CarType {CITY, COMPACT, FAMILY, EXECUTIVE}
    CarType carType;
    int numberOfDoors;
    int numberOfSeats;
    int maxSpeed;
    enum Color {WHITE, PEARL, RED, BLUE, PINK, BLACK, GREY}
    Color color;
    int currentSpeed = 0;

    Car(String brand, int model, int engineLitres, FuelType fuelType, CarType carType, int numberOfDoors, int numberOfSeats, int maxSpeed, Color color) {
        this.brand = brand;
        this.model = model;
        this.engineLitres = engineLitres;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngineLitres() {
        return engineLitres;
    }

    public void setEngineLitres(int engineLitres) {
        this.engineLitres = engineLitres;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void accelerate(int speedIncrement) {
        if (currentSpeed + speedIncrement < maxSpeed) {
     
            currentSpeed = currentSpeed + speedIncrement;
        } else { 
           
            System.out.println("Cannot increase to a speed higher than the car's maximum speed.");
        }
    }

    void decelerate(int speedDecrement) {
       
        if ((currentSpeed - speedDecrement) > 0) {
            currentSpeed = currentSpeed - speedDecrement;
        } else { 
          
            System.out.println("Cannot decrease to a negative speed.");
        }
    }

    void brake() {
        currentSpeed = 0;
    }

    
    double calculateArrivalTime(int distance) {
        return (double) distance / currentSpeed;
    }

    
    void print() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Engine = " + engineLitres);
        System.out.println("Fuel Type = " + fuelType);
        System.out.println("Car Type = " + carType);
        System.out.println("Number of Doors = " + numberOfDoors);
        System.out.println("Number of Seats = " + numberOfSeats);
        System.out.println("Max Speed = " + maxSpeed);
        System.out.println("Color = " + color);
    }


    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2024, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK);
        car1.print();
        car1.setCurrentSpeed(110);
        System.out.println("Current Speed = " + car1.getCurrentSpeed());
        car1.accelerate(20);
        System.out.println("Current Speed = " + car1.getCurrentSpeed());
        car1.decelerate(40);
        System.out.println("Current Speed = " + car1.getCurrentSpeed());
        car1.brake();
        System.out.println("Current Speed = " + car1.getCurrentSpeed());
        car1.decelerate(20);
    }
    
}