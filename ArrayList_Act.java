import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayList_Act {
    public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character option, clear;

      List<Integer> arraylist = new ArrayList<Integer>();

      while (true) {
         System.out.println("");
         System.out.println("Choose the Option below!:");
         System.out.println("-----------------------------");
         System.out.println("A. Add numbers:");
         System.out.println("B. Remove numbers:");
         System.out.println("C. Display numbers:");
         System.out.println("D. Clear numbers:");
         System.out.println("E. Exit");
         System.out.println("-----------------------------");
         System.out.println("option: ");
         option = input.next().charAt(0);
         System.out.println("");

         switch (option) {
            case 'A':
               System.out.println("Add the number you want: \n");
               int add = input.nextInt();
               System.out.println("");

               if (add > 0) {
                  arraylist.add(add);

                  System.out.println("The Number " +  add + " added to arraylist!");
                  break;

               }

               else {
                  
                  System.out.println("Error! Please input a positive numbers only!");
                  break;
               }

            case 'B':
               System.out.println("Enter the number that you want to remove: ");
               int remove = input.nextInt();
               System.out.println("");

               if (arraylist.contains(remove)) {
                  arraylist.remove(Integer.valueOf(remove));
                  System.out.println(" The number " + remove + " has been removed!");
                  break;
               }
            case 'C':
               System.out.println("---------------------------");
               System.out.println("Displaying Arraylist:");
               System.out.println("----------------------------");
               for (Integer num : arraylist) {
                  System.out.println(num);
               }
               break;
               
               
               
            case 'D':
               System.out.println("Do you want to clear the list?(Y/N):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'Y':
                     System.out.println("Clearing...");
                     arraylist.clear();
                     System.out.println("");
                     System.out.println("-------------------");
                     System.out.println("ArrayList is empty");
                     System.out.println("-------------------");
                     System.out.println("");
                     break;

                  case 'N':
                     System.out.println("---------------------");
                     System.out.println("ArrayList not cleared!");
                     System.out.println("---------------------");
                     break;
               }
               break;

            case 'E':
               input.close();
               System.exit(0);

            default:
               System.out.println("Invalid Input! Try again.");
         }

      }

   }
}
