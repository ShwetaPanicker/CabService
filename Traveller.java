package TransportSystem;


import java.util.*;

/**
 *
 * @author Shweta
 */
public final class Traveller
{
        Scanner scan= new Scanner(System.in);
        List<Customer> ll2=new ArrayList<>();
        List<Customer> arr= new ArrayList<>();
        List<Driver> dr = new ArrayList<>();
        String name;
        
        
       Traveller()
        {
        getDriverDetails();
        getCustomerDetails();
        }
       
       void getDriverDetails()
       {
       Driver d= new Driver();
       d.setDetails();
       dr.add(d);
       
       }
       void getCustomerDetails()
       {
        System.out.println("Enter the name of the first Customer");
        name= scan.next();
        Customer c1= new Customer(name);
        c1.setDetails();
        
        System.out.println("Enter the name of the second Customer");
        name= scan.next();
        Customer c2= new Customer(name);
        c2.setDetails();
        
        System.out.println("Enter the name of the third Customer");
        name= scan.next();
        Customer c3= new Customer(name);
        c3.setDetails();
        
        System.out.println("Enter the name of the fourth Customer");
        name= scan.next();
        Customer c4= new Customer(name);
        c4.setDetails();
        
        System.out.println("Enter the name of the fifth Customer");
        name= scan.next();
        Customer c5= new Customer(name);
        c5.setDetails();
        
        System.out.println("Enter the name of the sixth Customer");
        name= scan.next();
        Customer c6= new Customer(name);
        c6.setDetails();
        
        // Adding the customers in the list
        ll2.add(c1);
        ll2.add(c2);
        ll2.add(c3);
        ll2.add(c4);
        ll2.add(c5);
        ll2.add(c6);       
        }
        void getTravellers()
        {
            int one,counter=0;
            while(counter<dr.get(0).capacity)
            {
            one=ll2.get(0).dis;
            int index=0;
            for(int i=1;i<ll2.size(); i++)
            {   
                if(ll2.get(i).dis>one)
                {
                one=ll2.get(i).dis;
                index=i;
                } 
            }
            arr.add(ll2.get(index));
            ll2.remove(index);
            counter++;
            }
        }
            
        void trip()
        {
            int total_fair=0;
            System.out.println("\n");
            System.out.println("------- Welcome to the Trip------\n");
            System.out.println("Name of the Driver:"+dr.get(0).driverName);
            System.out.println("Driver ID:"+dr.get(0).driverID);
            System.out.println("Driver Route: Station no-"+dr.get(0).route);
            for(int i=0;i<arr.size();i++)
            {
            System.out.println(arr.get(i).name);
            }
            for(int i=0;i<arr.size();i++)
            {
                total_fair += arr.get(i).fair;
            }
            System.out.println("\n The total fair earned: "+total_fair);            
        }
        
}

