
import java.util.*;

public class JavaExcep{
    List<Shoes> Shoes = new ArrayList<>(); 
    Shoes s = new Shoes<>();
    sampleException sE = new sampleException("Invalid input!. Enter positive numbers only...");
    public static void main(String[] args) {
        sampleException sE = new sampleException("Invalid input!. Enter positive numbers only...");
        JavaExcep JV = new JavaExcep();
        Scanner sc = new Scanner(System.in);
        int choice = 0;    
        try{
            System.out.println("How many objects you want to create: ");
            int userchoice = sc.nextInt();
            if (userchoice < 0){
                throw new sampleException("Invalid input!. Enter positive numbers only...");

            }
            else{
                while ( choice < userchoice){
                    JV.askInput();
                    choice++;  
                }
            }
        }
        catch(InputMismatchException e){
            sE.charException();
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
    public void askInput(){
        String inputObj;
        int priceObj;
        Scanner sc = new Scanner(System.in);
        try{
            
        System.out.println("Enter the name of the Shoes you want to create: ");

        inputObj = sc.nextLine();
        System.out.println("Enter the price of the shoes");
        priceObj = sc.nextInt();
        sc.close();
       
        Shoes.add(new Shoes<>(inputObj, priceObj));
        System.out.println("---------------------");
        System.out.println("SUCCESSFULLY ADDED!");
        System.out.println("---------------------");
        Iterator<Shoes> it = Shoes.iterator();
        while(it.hasNext()){
            Shoes s = it.next();
            System.out.println(" The Object name is: " + s.getname() + " and the price is " + s.getprice());
        }
    }
    catch (InputMismatchException m){
        sE.charException();

    }
    }
}