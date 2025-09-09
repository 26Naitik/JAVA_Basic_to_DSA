//leetcode problem 3110 level easy 
//hello - assci value se harr yeek adjecent charecters ke bich diffrence ka sum return karna hai 

public class scoreOfString{
    public static void main(String[] args) {
        String s= "Hello";
        int n = s.length();
        int score =0;
        for(int i=0;i<n-1;i++){
            score += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        System.out.println(score);
    }
}