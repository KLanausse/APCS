package Ch8Classes;

public class PointClient {
    public static void  main(String[] args){
        PointV1 adam = new PointV1();
        adam.setLocation(-1,-1);

        PointV1 sebastian = new PointV1();
        sebastian.setLocation(-1, 2);

        System.out.println(sebastian.distance(adam));
    }
}
