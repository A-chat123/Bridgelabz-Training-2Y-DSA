import java.util.Scanner;

public class CheckWhetherTheStudentCanVote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        for(int i = 0 ; i < n ;i++){
            if(arr[i] >= 18){
                System.out.println("The student with the age "+ arr[i] + " can vote");
            }
            else{
                System.out.println("The student with the age " +arr[i] +" cannot vote");
            }
        }
    }
}