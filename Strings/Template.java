//write a java program to print a template in which <|name|> is replaced by a string name.

public class Template {
    public static void main(String[] args) {
        String name = "Naitik";
        String template = "Hello my name is <|name|>";
        
        template = template.replace("<|name|>", name);
        
        System.out.println(template);
    }
}
