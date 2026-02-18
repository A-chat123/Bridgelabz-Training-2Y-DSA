import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < 0){
                System.out.println("Negative");
            }
            else if (arr[i] == 0){
                System.out.println("Zero");
            }
            else{
                if(arr[i] % 2 == 0){
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
            }
        }
        if(arr[1] == arr[n-1]){
            System.out.println("They are equal");
        }
        else if (arr[1] > arr[n-1]){
            System.out.println(arr[1]+" is greater than "+ arr[n-1]);
        }
        else{
            System.out.println(arr[1]+" is less than "+ arr[n-1]);
        }
    }
}
