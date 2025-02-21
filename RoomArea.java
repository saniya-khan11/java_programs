class Room{
    float l;//l is length
    float b;//b is breadth
    void getData(float x, float y){
        l=x;
        b=y;
    }
}
class RoomArea{
    public static void main(String args[]){
        Room room1 = new Room();// creates object room1 of class Room
        room1.getData(14,10);
        float area;
        area=room1.l * room1.b;
        System.out.println("Area of room1 is "+area);
    }
}