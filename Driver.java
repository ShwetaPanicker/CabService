/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransportSystem;

/**
 *
 * @author Shweta
 */
public class Driver implements Member
{
    int route;
    int driverID;
    int capacity;
    String driverName;
    @Override
    public void setDetails()
    {
        System.out.println("Enter the Driver ID");
        driverID= scan.nextInt();
        System.out.println("Enter the Driver Name");
        driverName= scan.next();
        System.out.println("Enter the fixed route");
        route=scan.nextInt();
        System.out.println("Enter the Capacity");
        capacity=scan.nextInt(); 
    }
    
}
