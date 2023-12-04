import java.util.Scanner;
class LastWordLen{

    /**
     * Code Explanation:
     * Easy 1 - Given a string s consisting of words and spaces, return the length of the last word in the string.
     
     *Time Complexity = O(length)
    
     * @param s - lastWordLength() method accepts the String s
     * step-1: The leading and trailing spaces are trimed
      
     * step-2: intialize the length variable to 0
     
     * step-3: 
        loop through the String s from last character to first time space is encountered and 
        calculate the length of the last word

        if we have to display the last word, we can also store it into a StringBuilder Object
        sb.insert(0,s.charAt(i))

     * 
     * @return length of the last word
     */
    
    public static int lastWordLength(String s){
        s=s.trim();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            length++;
        }
        return length;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lastWordLength(s));
    }
}