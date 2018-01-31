
public class Person 
{
   private String name;
   private int age;   
   
   public Person(String name, int age){
       name = name;
       age = age;       
    }
    
   public int lengthOfName() throws NullPointerException{ 
       if (name == null) {
           throw new NullPointerException("The name wasn't set");
        } else {
       return name.length();
     
    }
}
   
   @Override
   public boolean equals(Object other){       
       Person o = (Person)other;
       return this.name.equals(o.name) && this.age == o.age;
    }
}
