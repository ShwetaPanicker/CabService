package TransportSystem;


public class Customer implements Member
{
    String name;
    int pickup;
    int drop;
    int dis;
    int fair;
    int sample;
    Customer(String name)
    {
    this.name=name;
    }
    @Override
    public void setDetails()
    {
    System.out.println("Enter the station you need pick up from.");
    pickup=scan.nextInt();
    System.out.println("Enter the station you need drop to");
    drop= scan.nextInt(); 
    dis= drop-pickup;
    fair= dis*15;
    }
        
}
