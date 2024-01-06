package PrimitiveDatatype;

public class GivenStringPalindromeorNot {
    public static void main(String[] args) {
        String word1 = "AmmA";
        String word2="";
        for(int i = word1.length()-1;i>=0;i--){
            //System.out.print(word1.charAt(i));
            word2 = word2 + word1.charAt(i);
        }
        System.out.println(word2);
        if(word2.equals(word1)){
            System.out.println("The Given String was palindrome");
        }
        else{
            System.out.println("The given String was not palindrome");
        }
    }
}
