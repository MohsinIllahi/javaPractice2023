package OOP;

public class findSecondHighest {
    public static int find2nd(int[]arr){
        int highest = Integer.MIN_VALUE;
        int SecondHighest =  Integer.MIN_VALUE;
        for(int num:arr){
            if (num>highest) {
                SecondHighest = highest;
                highest= num;
            }else if (num>SecondHighest && num!= highest) {
                SecondHighest = num;
            }
        }return SecondHighest;
    }
    public static void main(String[] args) {
         int[] arr= {10,20,14,3};
         int SecondHighest = find2nd(arr);
         System.out.println("Second Highest is : "+ SecondHighest);
    }
}
