package CarDealership;

public class Customer

{
    /* Creating the customer class to invoke the purchaseCar method that will be executed in the main method */

    private String name;
    private String address;
    private double cashOnHand;
    private boolean creditHistory;

    public Customer(String name, String address, double cashOnHand)
    {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand)
    {
        cashOnHand += 500;
        this.cashOnHand = cashOnHand;
    }


    public boolean isCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(boolean creditHistory) {
        this.creditHistory = creditHistory;
    }



    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance)
    {
        emp.handleCustomer(this, finance, vehicle);
    }


}
