
public class StringIndexExample
{
   public static void main(String[] args){
       
       String str = "Testing";
       try {
       System.out.println(str.charAt(-1));
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println ("Your code doesn't work: " + e);
    }
       
     
               
   }
}
