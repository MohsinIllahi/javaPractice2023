 package OOP;

public class UniqueCharacterCount {
    public static int[] countUniqueChar(String input){
        int[] charCountArray = new int[198];
        for(char ch : input.toCharArray()){
charCountArray[ch]++;
        }return charCountArray;
    }
    public static void main(String[] args) {
  
        String input = "hello world";
        int[] result = countUniqueChar(input);
        for (int i = 0; i < result.length; i++) {
            if (result[i]>0) {
                System.out.println(" ' "+ (char)i+ " ' " + result[i]);
            }
        }
    }
}



//---------------------
// public class UniqueCharacterCount {
//     public static int[] countUniqueCharacters(String input) {
//         int[] charCountArray = new int[128];

//         for (char ch : input.toCharArray()) {
//             charCountArray[ch]++;
//         }

//         return charCountArray;
//     }

//     public static void main(String[] args) {
//         String input = "hello world";
//         int[] result = countUniqueCharacters(input);

//         // Display the unique characters and their counts
//         for (int i = 0; i < result.length; i++) {
//             if (result[i] > 0) {
//                 System.out.println("'" + (char) i + "': " + result[i]);
//             }
//         }
//     }
// }