package Ch8Classes.Point;

public class PointClientV2 {
    public static void  main(String[] args){
        PointV2 adam = new PointV2(-1, -1); //instantiation a PointV1 object
        System.out.println("Adam's location is: ("+adam.x+", "+adam.y+")");

        PointV2 sebastian = new PointV2(-1, 2);
        System.out.println("Sebastian's location is: ("+sebastian.x+", "+sebastian.y+")");

        PointV2 rosemary = new PointV2();
        System.out.println("Rosemary's location is: ("+rosemary.x+", "+rosemary.y+")");

        System.out.println(sebastian.distance(adam));
    }
}
