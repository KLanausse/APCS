package Ch8Classes.Point;

public class PointClientV5 {
    public static void  main(String[] args){
        PointV5 rosemary = new PointV5("Rosemary");
        PointV5 adam = new PointV5("Adam",-1, -1); //instantiation a PointV1 object
        PointV5 marcus = new PointV5("Marcus",-1, -1); //instantiation a PointV1 object
        PointV5 sebastian = new PointV5("Sebastian",-1, 2);
        //PointV5 quinn = new PointV5("Quinn", 4, 4);

        System.out.println(adam);
        System.out.println(sebastian);
        System.out.println(rosemary);
        System.out.println(sebastian.distance(adam));
        //adam.getX();
        //adam.getY();

        System.out.println(adam.equals("sebastian"));
        System.out.println(adam.equals(sebastian));
        System.out.println(adam.equals(marcus));
    }
}
