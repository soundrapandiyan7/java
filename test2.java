import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner vv= new Scanner(System.in);
        System.out.print("Enter the vechile name:");
        String name=vv.next();
        if(name.equals("car")){
            System.out.println("fee is  100");
        }
        else if(name.equals("truck")){
            System.out.println("fee is 200");
        }
        else if(name.equals("carRRID")){
            System.out.println("fee is 10% = 90");
        }
        else if(name.equals("truckRFID")){ 
            System.out.println("fee is 10% = 180");
        }
else { 
            System.out.println("it is not vechile");
    }
}
}