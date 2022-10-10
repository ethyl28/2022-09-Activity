import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

package HashSet;

public class Hashset_Act {
    public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character option, clear;

      Set<Integer> hashset = new HashSet<Integer>();

      while (true) {
         System.out.println("");
         System.out.println("The Option below!:");
         System.out.println("A. Add numbers:");
         System.out.println("B. Remove numbers:");
         System.out.println("C. Display numbers:");
         System.out.println("D. Clear numbers:");
         System.out.println("E. Exit");
         System.out.println("option: ");
         option = input.next().charAt(0);
         System.out.println("");

         switch (option) {
            case 'A':
               System.out.println("Enter the number you want to add on hashet: ");
               int add = input.nextInt();
               System.out.println("");
               
               if (hashset.contains(add)){
                System.out.println("<<<<<<<< The value are already exist! Choose another one. >>>>>>>> ");

               }

               else {
                hashset.add(add);
                System.out.println("The number "+ add + " has been added");
               }
               break;

            case 'B':
               System.out.println("Enter the number you want to remove:");
               int remove = input.nextInt();
               System.out.println("");

               if (hashset.contains(remove)) {
                  hashset.remove(Integer.valueOf(remove));
                  System.out.println("The number " + remove + " has been removed!");
                  break;
               }
               break;

            case 'C':
               System.out.println("Displaying HashSet:");
               System.out.println("....................");
             
               Iterator<Integer> it_set = hashset.iterator();
               while(it_set.hasNext()){
                    System.out.println(it_set.next());
               }

               break;

            case 'D':
               System.out.println("Do you want to clear this?(Y/N):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'Y':
                     System.out.println("Clearing...");
                     hashset.clear();
                     System.out.println("");
                     System.out.println("-------------------");
                     System.out.println("Hashset is empty");
                     System.out.println("-------------------");
                     System.out.println("");
                     break;

                  case 'N':
                     System.out.println("--------------------");
                     System.out.println("HashSet not cleared!");
                     System.out.println("--------------------");
                     break;
               }
               break;

            case 'E':
               input.close();
               System.exit(0);

            default:
               System.out.println("Invalid Input! Try again");
         }

      }

   }
    
}
