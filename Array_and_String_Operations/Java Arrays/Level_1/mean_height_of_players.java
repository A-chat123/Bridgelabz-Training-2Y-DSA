import java.util.Scanner;

public class mean_height_of_players {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] arr = new double[11];
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = input.nextDouble();
            sum += arr[i];
        }
        int mean = sum/11;
        System.out.println(mean);
        input.close();
    }
}
