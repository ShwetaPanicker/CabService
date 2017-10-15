package TransportSystem;
import java.util.*;

public class Route
{
    
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String ans;
        System.out.println("Welcome to the Fixed Route Transport System");
        System.out.println("Do you want to start a trip: y/n");
        ans= scan.next();
        if(ans.equalsIgnoreCase("y"))
        {
        
        Traveller t= new Traveller();
        t.getTravellers();
        t.trip();
        }
        else
        {
            System.out.println(" Thank you for visting Fixed Route Transport System! ");
        }
    }
    
}
 

