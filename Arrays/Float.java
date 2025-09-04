//write a java rpogram to calculate the sum of five float using arrays.
public class Float{
    public static void main(String[] args) {
        float [] marks = {23.4f,45,6f,567.5f,678.9f};
        float sum =0;
        for(float element:marks){
            sum += element;
        }
        System.out.println("the sum is: "+sum);
    }
}