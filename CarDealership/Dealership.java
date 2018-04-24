package CarDealership;

public class Dealership
{

    /* Program that simulates a transaction between a customer looking to purchase a vehicle and employee */

    public static void main(String[] args)
    {
        Customer cust1 = new Customer("Tim", "123 Yonge St.", 25000);

        Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

    }
}
