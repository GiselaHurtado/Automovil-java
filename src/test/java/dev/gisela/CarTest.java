package dev.gisela;

import org.junit.jupiter.api.Test;
import dev.gisela.Car.CarType;
import dev.gisela.Car.Color;
import dev.gisela.Car.FuelType;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testAccelerate() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.accelerate(50);
        assertEquals(50, car.getCurrentSpeed());
    }

    @Test
    void testBrake() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.accelerate(50);
        car.brake();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testCalculateArrivalTime() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setCurrentSpeed(60);
        assertEquals(1.0, car.calculateArrivalTime(60));
    }

    @Test
    void testDecelerate() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.accelerate(100);
        car.decelerate(30);
        assertEquals(70, car.getCurrentSpeed());
    }

    @Test
    void testGetBrand() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals("Tesla", car.getBrand());
    }

    @Test
    void testGetCarType() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(CarType.EXECUTIVE, car.getCarType());
    }

    @Test
    void testGetColor() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(Color.BLACK, car.getColor());
    }

    @Test
    void testGetEngineLitres() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(3, car.getEngineLitres());
    }

    @Test
    void testGetFuelType() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(FuelType.ELECTRIC, car.getFuelType());
    }

    @Test
    void testGetIsAutomatic() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertTrue(car.getIsAutomatic());
    }

    @Test
    void testGetMaxSpeed() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(250, car.getMaxSpeed());
    }

    @Test
    void testGetModel() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(2025, car.getModel());
    }

    @Test
    void testGetNumberOfDoors() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(5, car.getNumberOfDoors());
    }

    @Test
    void testGetNumberOfSeats() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(6, car.getNumberOfSeats());
    }

    @Test
    void testGetPenalty() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertEquals(0, car.getPenalty());
    }

    @Test
    void testHasPenalties() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        assertFalse(car.hasPenalties());
    }

    @Test
    void testMain() {
        Car.main(new String[]{});
    }

    @Test
    void testPrint() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.print();
    }

    @Test
    void testSetBrand() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setBrand("Honda");
        assertEquals("Honda", car.getBrand());
    }

    @Test
    void testSetCarType() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setCarType(CarType.FAMILY);
        assertEquals(CarType.FAMILY, car.getCarType());
    }

    @Test
    void testSetColor() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setColor(Color.BLUE);
        assertEquals(Color.BLUE, car.getColor());
    }

    @Test
    void testSetCurrentSpeed() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setCurrentSpeed(90);
        assertEquals(90, car.getCurrentSpeed());
    }

    @Test
    void testSetEngineLitres() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setEngineLitres(2);
        assertEquals(2, car.getEngineLitres());
    }

    @Test
    void testSetFuelType() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setFuelType(FuelType.DIESEL);
        assertEquals(FuelType.DIESEL, car.getFuelType());
    }

    @Test
    void testSetIsAutomatic() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setIsAutomatic(false);
        assertFalse(car.getIsAutomatic());
    }

    @Test
    void testSetMaxSpeed() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setMaxSpeed(200);
        assertEquals(200, car.getMaxSpeed());
    }

    @Test
    void testSetModel() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setModel(2026);
        assertEquals(2026, car.getModel());
    }

    @Test
    void testSetNumberOfDoors() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setNumberOfDoors(2);
        assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testSetNumberOfSeats() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setNumberOfSeats(4);
        assertEquals(4, car.getNumberOfSeats());
    }

    @Test
    void testSetPenalty() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setPenalty(50.0);
        assertEquals(50.0, car.getPenalty());
    }

    @Test
    void testValueTotalPenalties() {
        Car car = new Car("Tesla", 2025, 3, FuelType.ELECTRIC, CarType.EXECUTIVE, 5, 6, 250, Color.BLACK, 0.0, true);
        car.setPenalty(50.0);
        assertEquals(50.0, car.valueTotalPenalties());
    }
}
