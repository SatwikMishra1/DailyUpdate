package practise;

public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        if(num < 0) return isPalindrome(-1 * num);
        String curr = Integer.toString(num);
        for(int i=0; i < curr.length()/2; i++) {
            if(curr.charAt(i) != curr.charAt(curr.length()-1-i))
                return false;
        }
        return true;
    }
}