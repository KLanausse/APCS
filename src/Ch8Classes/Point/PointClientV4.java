package Ch8Classes.Point;

public class PointClientV4 {
    public static void  main(String[] args){
        PointV4 rosemary = new PointV4("Rosemary");
        PointV4 adam = new PointV4("Adam",-1, -1); //instantiation a PointV1 object
        PointV4 sebastian = new PointV4("Sebastian",-1, 2);
        //PointV4 quinn = new PointV4("Quinn", 4, 4);

        System.out.println(adam);
        System.out.println(sebastian);
        System.out.println(rosemary);
        System.out.println(sebastian.distance(adam));
        //adam.getX();
        //adam.getY();
    }
}
