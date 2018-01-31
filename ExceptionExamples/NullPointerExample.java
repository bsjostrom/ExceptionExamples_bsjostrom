
public class NullPointerExample
{
    private static String strVar;
      
    public static void main(String[] args){
      try {
        System.out.println(strVar.toUpperCase());
    }
   catch (NullPointerException e) {
    System.out.println("Your code doesn't work: " + e.toString());
        
    }
}
}

