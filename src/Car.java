/**
 * Created by USER on 9/18/2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;
    public Car(String name, String manufacturer, Driver driver, int fuelCapacity){
        this.name=name;
        this.manufacturer=manufacturer;
        this.driver=driver;
        this.fuelCapacity=fuelCapacity;
    }
    public Car(String name, String manufacturer){
        this.name=name;
        this.manufacturer=manufacturer;
    }
    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public Driver getDriver(){
        return driver;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void refuel(int fuel){
        fuelCapacity+=fuel;
    }
    public void drive(int fuel){
        if(fuelCapacity<fuel){
            System.out.println("Fuel capacity is over");
            return;
        }
        fuelCapacity-=fuel;
    }
    public void setDriver(Driver driver){
        this.driver=driver;
    }
    public void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    public void print(){
        System.out.println("Manufacture: " + getManufacturer() + "Driver: " + getDriver().getName() + "Fuel Capacity: " + getFuelCapacity());
    }
}
