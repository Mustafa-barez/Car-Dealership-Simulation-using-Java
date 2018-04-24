package CarDealership;

public class Vehicle
{
    /* Creating the vehicle class and its sub-sections */

    private String make;
    private String type;
    private double cost;


    public Vehicle(String make, String type, double cost) {
        this.make = make;
        this.type = type;
        this.cost = cost;
    }

    public void testDrive()
    { }


    public String getMake() {
        return make;
    }

    public void setMake(String make) { this.make = make; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}
