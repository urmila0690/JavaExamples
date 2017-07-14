public class Palindrome{
    public static void main(String[] args){
        System.out.println(isPalindrome("121"));
        System.out.println(isPalindrome2("121"));
        System.out.println(isPalindrome2("foo"));
        System.out.println(isPalindrome2("foof"));
        System.out.println(isPalindrome2("fooooof"));
    }

    public static boolean isPalindrome(String input){
        String s1 = input;
        String s2 = new StringBuffer(s1).reverse().toString();

        if(s1.equals(s2)){
            return true;
        }

        return false;
    }

    public static boolean isPalindrome2(String input){

        int strlen = input.length();
        for(int i=0, j=strlen-1; i<=strlen/2 && j>=strlen/2; i++, j--){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }

        return true;
    }

}