
class sampleException extends Exception {
    public void Exception(){
        System.out.println("Invalid! Please input Integers only");
        
    }
    
    public void charException(){
        System.out.println("Invalid! Please input Integers only");
    }
    
    public sampleException(String message){
        super(message);
    }
      
}
