import java.util.Scanner;
class demo022{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=scanner.nextInt();
        if(year % 4==0){
            System.out.println("It is a Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
