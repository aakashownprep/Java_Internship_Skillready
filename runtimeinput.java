import java.util.Scanner;
class runtimeinput{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        //s1 is refrence variable just like nick name
        System.out.print("enter any number:");
        int a=s1.nextInt();
        System.out.println("your value is "+a);
    }
}