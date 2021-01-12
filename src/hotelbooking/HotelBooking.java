package hotelbooking;

import java.util.Scanner;


public class HotelBooking {

    private static Scanner input = new Scanner(System.in);
    
    private static double price = 0;
    
    public static void main(String[] args) {
        
        
        while (true) {
            System.out.println("");
            System.out.println("Welcome To the Trivago Hotel");
            System.out.println("Would you like to:"
                    + "\n1 - Book a Room"
                    + "\n2 - Remove Booking"
                    + "\n0 - Quit");
            int userChoice = input.nextInt();
            
            switch(userChoice) {
                case 1:
                    makeBooking();
                    break;
                case 2:
                    System.out.println("WHo");
                    break;
                case 0:
                    System.out.println("Goodbye");
                    System.exit(userChoice);
            }

        }

    }
    
    private static void makeBooking() {
        System.out.println("\nWhat size room would you like to book?"
                + "\n1 - Single (1) - £50"
                + "\n2 - Double (2) - £75"
                + "\n3 - Family (4) - £105");
        int roomSize = input.nextInt();
        
        if (roomSize == 1) {
            price = price + 50;
        } else if (roomSize == 2) {
            price = price + 75;
        } else if (roomSize == 3) {
            price = price + 105;
        }
        
        System.out.println("\nWhat board would you like?"
                + "\n1 - Self-Catering - £0"
                + "\n2 - Half-Board - £10"
                + "\n3 - Full Board - £20");
        int userBoard = input.nextInt();
        
        if (userBoard == 1) {
            System.out.print("");
        } else if (userBoard == 2) {
            price = price + 10;
        } else if (userBoard == 3) {
            price = price + 15;
        }
        
        System.out.println("The total Price is: " + price);
        
        System.out.println("How many days would you like to book a room for?");
        int userDays = input.nextInt();
        if (userDays > 7) {
            
        }
    }
   
    
    
    
    
    
    
}
