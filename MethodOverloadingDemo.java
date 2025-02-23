class Room{
    float length;
    float breadth;
    //Overloading the Constructor method.

    Room(float x,float y){ //constructor1
        length =x;
        breadth =y;
    }

    Room(float x){  //constructor1
        length =breadth = x;
    }

    float area(){
        return length*breadth;
    }
}

class MethodOverloadingDemo{
    public static void main(String args[]){
    //for rectangle room
    Room room1 = new Room(5,10);

    //for square room
    Room room2 = new Room(5);

    System.out.println("Rectangle room area = "+ room1.area());
    System.out.println("Square room area = "+ room2.area());
    }
}