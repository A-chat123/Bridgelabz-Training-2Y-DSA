import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] age = new int[3];
            int[] heights = new int[3];
    
            System.out.println("Enter ages of Amar, Akbar, and Anthony:");
            for (int i = 0; i < 3; i++) {
                System.out.print(names[i] + " age: ");
                age[i] = input.nextInt();
            }
    
            System.out.println("\nEnter heights (in cm) of Amar, Akbar, and Anthony:");
            for (int i = 0; i < 3; i++) {
                System.out.print(names[i] + "'s height: ");
                heights[i] = input.nextInt();
            }
    
            int minAge = age[0];
            int youngestIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (age[i] < minAge) {
                    minAge = age[i];
                    youngestIndex = i;
                }
            }
    
            int maxHeight = heights[0];
            int tallestIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                    tallestIndex = i;
                }
            }
    
            System.out.println("\nYoungest friend: " + names[youngestIndex] + " (" + minAge + " years)");
            System.out.println("Tallest friend: " + names[tallestIndex] + " (" + maxHeight + " cm)");
    
            input.close();
        }
    }
    