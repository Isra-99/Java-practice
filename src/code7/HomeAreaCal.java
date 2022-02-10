package code7;

public class HomeAreaCal {
    public static void main(String arg[]){
        // creating instance of the rectangle1
        Rectangle room1= new Rectangle();
        room1.setLength(100);
        room1.setWidth(88);
        double perimeter  = room1.Perimeter();
        double area = room1.Area();
        // creating instance of another rectanlge
        Rectangle room2 = new Rectangle(100,88);
        double area1 = room2.Area();
        double perimeter1 = room2.Perimeter();

    }
}
