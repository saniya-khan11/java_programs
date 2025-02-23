class Rectangle{
    //Creating Instance Variables
    int length,breadth;
    //Creating Default Constructor
    Rectangle(){
        length=0;
        breadth=0;
    }
    //Creating Parameterized Constructor
    Rectangle(int x,int y){
        length=x;
        breadth=y;
    }
    //Creating method
    void area(){
        int area =length*breadth;
        System.out.println("Area of the Rectangle is "+area);
    }
}

class ConstructorDemo{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();//Calling Default constructor
        Rectangle r2 = new Rectangle(10,10);//Calling Parameterized constructor
        r1.area();
        r2.area();
    }
}