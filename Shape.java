class Rectangle{
    int length,breadth;//instance variables
    //creating method to access instance variables
    void getData(int x,int y){//The getData method is added to provide values to the instance variables.
        length =x;
        breadth =y;
    }
    int area(){
        return length*breadth;
    }
}
class Shape{
    public static void main(String args[]){
        Rectangle rec1= new Rectangle();
        rec1.getData(10,10);
        System.out.println("The Area of the rectangle is : "+ rec1.area());
    }
}