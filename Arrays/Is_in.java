//write a java program to check weatther the element is present in the array or not.
public class Is_in {
    public static void main(String[] args) {
        float [] marks = {23.4f,45,6f,567.5f,678.9f};
        float num = 23.4f;
        boolean isInArray = false;
        for(float element:marks){
            if(element == num){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
}
