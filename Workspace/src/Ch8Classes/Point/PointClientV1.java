package Ch8Classes.Point;

public class PointClientV1 {
    public static void  main(String[] args){
        PointV1 adam = new PointV1(); //instantiation a PointV1 object
        adam.setLocation(-1,-1);
        System.out.println("Adam's location is: ("+adam.x+", "+adam.y+")");

        PointV1 sebastian = new PointV1();
        sebastian.setLocation(-1, 2);

        System.out.println(sebastian.distance(adam));
    }
}
