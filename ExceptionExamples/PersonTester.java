
public class PersonTester
{
   public static void main(String[] args){      
       
       Person person = new Person("Billy Joe", 18);
      try {
       System.out.println(person.lengthOfName());
    } catch (NullPointerException e) {
        System.out.println("This couldn't be found: " + e.toString());
    
   }
}
}
