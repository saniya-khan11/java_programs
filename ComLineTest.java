/* This program uses command line argument as input.*/
class ComLineTest{
    public static void main(String args[]){
        int count , i=0;
        String string;
        count=args.length;
        System.out.println("Number of arguments = "+count);

        while(i<count){
            string = args[i];
            i++;
            System.out.println(i + " : " + "Java is "+ string +"!");
        }
             
    }
}