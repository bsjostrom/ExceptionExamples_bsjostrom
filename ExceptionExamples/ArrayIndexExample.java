
public class ArrayIndexExample
{
    public static void main(String[] args){

        int[] nums = new int[10];
       try {
        for(int i = 0; i <= nums.length; i++){
            nums[i] = i;
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Your code doesn't work: " + e.toString());
    }
        
        

        

    }
}
