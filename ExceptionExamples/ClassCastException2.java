import java.util.Date;
public class ClassCastException2
{
  
    public static void main(String[] args){
        
        
        Object x = new Date();
        try{
        System.out.println((String)x);
    }   catch (ClassCastException e) {
        System.out.println("Don't cast like that: " + e.toString());
}
        
        
    }
}
