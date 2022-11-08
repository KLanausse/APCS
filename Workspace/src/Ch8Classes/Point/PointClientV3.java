package Ch8Classes.Point;

public class PointClientV3 {
    public static void  main(String[] args){
        PointV3 rosemary = new PointV3();
        PointV3 adam = new PointV3(-1, -1); //instantiation a PointV1 object
        PointV3 sebastian = new PointV3(-1, 2);

        System.out.println("Adam's location is: ("+adam.x+", "+adam.y+")");
        System.out.println("Sebastian's location is: ("+sebastian.x+", "+sebastian.y+")");
        System.out.println("Rosemary's location is: ("+rosemary.x+", "+rosemary.y+")");
        System.out.println(sebastian.distance(adam));
    }
}
