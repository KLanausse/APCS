package Ch10ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("the"); list.add("quick"); list.add("brown"); list.add("fox");

        addStars(list);

        System.out.println(list);

        removeStarts(list);

        System.out.println(list);
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
}
