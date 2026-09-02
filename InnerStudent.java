import java.util.ArrayList;
import java.util.Scanner;

class Amit implements Runnable {
    @Override
    public void run() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);

        for (int ans : arr) {
            try {
                Thread.sleep(1000);
                System.out.println("[Amit] " + ans);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Dinesh implements Runnable {
    @Override
    public void run() {
        ArrayList<String> dr = new ArrayList<>();
        dr.add("a");
        dr.add("b");
        dr.add("c");
        dr.add("d");

        for (String s : dr) {
            try {
                Thread.sleep(1000);
                System.out.println("[Dinesh] " + s);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Abhishek implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("[Abhishek] Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class InnerStudent implements Runnable {

    @Override
    public void run() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Abhishek");
        arr.add("Bhai");
        arr.add("Bhabhi ka");
        arr.add("Dila doge");
        arr.add("instagram Id");

        for (String ans : arr) {
            try {
                Thread.sleep(3000);
                System.out.println("[InnerStudent Part 1] " + ans);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // Fixed: Adding elements to arr2 instead of arr
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Abhishek");
        arr2.add("Bhai");

        for (String name : arr2) {
            try {
                Thread.sleep(2000);
                System.out.println("[InnerStudent Part 2] " + name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Multi-Threading Demo ===");

        do {
            System.out.println("\nSelect a Thread Task to Run:");
            System.out.println("1. Run InnerStudent Task");
            System.out.println("2. Run Abhishek Task");
            System.out.println("3. Run Dinesh Task");
            System.out.println("4. Run Amit Task");
            // System.out.println("5. Run Future Task"); // Add menu item here for future cases
            System.out.println("0. Exit Application");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--> Starting InnerStudent Thread...");
                    new Thread(new InnerStudent()).start();
                    break;

                case 2:
                    System.out.println("--> Starting Abhishek Thread...");
                    // Fixed: Added target Runnable object to Thread
                    new Thread(new Abhishek()).start();
                    break;

                case 3:
                    System.out.println("--> Starting Dinesh Thread...");
                    new Thread(new Dinesh()).start();
                    break;

                case 4:
                    System.out.println("--> Starting Amit Thread...");
                    new Thread(new Amit()).start();
                    break;

                /* TEMPLATE FOR FUTURE CASES:
                case 5:
                    System.out.println("--> Starting Future Thread...");
                    new Thread(new YourFutureRunnableClass()).start();
                    break;
                */

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}