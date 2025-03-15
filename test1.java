import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int i;
         for(i=0;i<=5;i++){
        System.out.print("Enter the mark:");
      int gg=mark.nextInt();
           if(gg>=90){
            System.out.println("grade A");
        }
        else if(gg>=75){
            System.out.println("grade B");
        }
        else if(gg>=50){
            System.out.println("grade C");
        }
        else{
            System.out.println("grade F");
        }

      }
    }
}