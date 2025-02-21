public class ConsoleDemo{
    public static void main(String args[]){
        System.out.println("What is your Name? ");
        String name = System.console().readLine("Enter : ");
        System.out.println("Your name is : "+name);
    }
}