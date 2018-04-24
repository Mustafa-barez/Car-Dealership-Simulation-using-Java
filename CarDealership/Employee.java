package CarDealership;

public class Employee
{
    /* Creating the Employee and invoking the handleCustomer method that will be executed in the main class */

    private String name;
    private String address;
    private double finance;



    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
    {
        if (finance == true)
        {
            double loanAmount = vehicle.getCost() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }

        else if(vehicle.getCost()<= cust.getCashOnHand())
        {
            processTransaction(cust, vehicle);
        }

        else
        {
            System.out.println("Customer needs more money to purchase vehicle: " + vehicle);
        }
    }

    public void runCreditHistory(Customer cust, double loanAmount)
    {
        System.out.println("Ran credit history for customer");
        System.out.println("Customer has been approved to purchase vehicle");
    }

    public void processTransaction(Customer cust, Vehicle vehicle)
    {
        System.out.println("Customer purchased vehicle " + vehicle + " for the price " + vehicle.getCost());
    }
}
