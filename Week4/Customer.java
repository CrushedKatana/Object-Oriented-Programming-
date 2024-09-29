package Week4;

public class Customer {
    private String name;
    private Car car;
    private Driver driver;
    private int day;

    public Customer() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int  totalCostCalculation() {
        return car.carCostCalculation(day) 
        + driver.driverCostCalculation(day);
    }
}
