import java.util.ArrayList;
import java.util.Scanner;


class Amit implements Runnable {

    @Override
    public void run(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);

        for(int ans : arr){
           try{
            Thread.sleep(1000);
               System.out.println(ans);
           } catch(Exception ex){
            ex.printStackTrace();
           } 
        }

    }
    
}


class Dinesh implements Runnable {

    @Override
    public void run(){
        ArrayList<String> dr = new ArrayList<>();
        dr.add("a");
        dr.add("b");
        dr.add("c");
        dr.add("d");
        for(String s : dr){
            try{
                Thread.sleep(1000);
                System.out.println(s);
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

}

class Abhishek implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Abhishek Thread Count: " + i);
            try {
               Thread.sleep(1000);
               // Removed the duplicate println from here so it counts cleanly
            } catch (Exception ex) {
               ex.printStackTrace();
            }
        }
    }
}

// File must be named InnerStudent.java because this class is public
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
                System.out.println(ans);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        ArrayList<String> arr2 = new ArrayList<>();
        arr.add("Abhishek");
        arr.add("Bhai");
        
        for(String name : arr2){
            try{
                Thread.sleep(2000);
               System.out.println(name);
            } catch(Exception e){
              e.printStackTrace();
            }
        }

    }
    
    
    // Main method added so you can run the file directly
    public static void main(String[] args) {
        System.out.println("--- Starting Main Thread ---");

        // Thread t1 = new Thread(new Abhishek());
        // Thread t2 = new Thread(new InnerStudent());

        // t1.start();
        // t2.start();

        // Thread t3 = new Thread(new InnerStudent());
        // t3.start();

        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("1. sgsh");
            System.out.println("2. xsaas");
            System.out.println("3. shxva");
            System.out.println("4. shv");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Thread t2 = new Thread(new InnerStudent());
                    t2.start();
                    break;
                case 2:
                    Thread t3 = new Thread();
                    t3.start();  
                    break;  
                default:
                    System.out.println("Please Enter a valid number");  
                    break;  

            }

        } while(choice != 1);

    }
}
