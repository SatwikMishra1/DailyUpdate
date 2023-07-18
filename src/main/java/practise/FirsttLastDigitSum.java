package practise;
// solid principles
// exceptional at exception handling
//colllection framework is very important
public class FirsttLastDigitSum {
    // write your code here
    public int sumFirstAndLastDigit(int num){
        int val1=num%10;
        int val2=num%10;
        while(num>0){
            num/=10;
            val2=num%10;
        }
        return val1+val2;
    }
}