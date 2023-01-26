package Ch10ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("the"); list.add("quick"); list.add("brown"); list.add("fox");
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 4, 8, 9, 11, 15, 17, 28, 41, 59}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81}));


        addStars(list);

        System.out.println(list);

        removeStarts(list);

        System.out.println(list);

        System.out.println(intersect(list1, list2));
    }

    public static void addStars(ArrayList list){
        for (int index = list.size()-1; index >= 0; index--)
            list.add(index+1, "*");
    }

    public static void removeStarts(ArrayList list){
        for (int index = list.size()-1; index >= 0; index--)
            if (list.get(index).equals("*"))
                list.remove(index);
    }

    public static ArrayList<Integer> intersect(ArrayList list1, ArrayList list2){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int indexA = 0; indexA < list1.size() ; indexA++) {
            for (int indexB = 0; indexB < list2.size() ; indexB++) {
                if (list1.get(indexA) == list2.get(indexB)  && !newList.contains(list1.get(indexA)) )
                    newList.add((int)list1.get(indexA));
            }
        }

        return newList;
    }
}
