import java.util.Arrays;

public class BinaryS{
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6};
        String s1= "hello      world";
        int num = (int)(Math.random()*10)%6;
        if(num==0){
          System.out.println("System generated an invalid number i.e 0");
        }
        else{
        int elementpos = Arrays.binarySearch(arr, num);
        System.out.println("The element "+num+" found at position "+ ++elementpos);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(s1.contains("world"));
        System.out.println(s1.replace("world" , "Deepak"));
        System.out.println(s1.substring(0,5));
        System.out.println(s1);
    }
}