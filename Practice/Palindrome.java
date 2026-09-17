package Practice;
public class Palindrome{
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String [] args){
        String s = "madam";
        if(isPalindrome(s)){
            System.out.println("The given string " + s + " is palindrome");
        } else{
            System.out.println("The given string " + s + " is not a palindrome");
        }
    }
}