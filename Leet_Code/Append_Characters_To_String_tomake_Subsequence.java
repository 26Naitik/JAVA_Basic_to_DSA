//problem 2486.
public class Append_Characters_To_String_tomake_Subsequence{
    public static void main(String[] args) {
        String s= "coaching";
    String t = "coading";
    int i=0;
    int j=0;
    int n=s.length();
    int m=t.length();

    while (i<n && j<m){
        if (s.charAt(i)== t.charAt(j)){
            i++;
            j++;
        }
        else {
            i++;
        }
    }
    int result = m-j;
    System.out.println(result);
    }

}
