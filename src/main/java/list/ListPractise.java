package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static java.util.Collections.sort;

public class ListPractise {
    public void practise(){
        String[] originalArray=new String[] {"First","Second","Third"};
        List<String> originalList = Arrays.asList(originalArray);
        List<String> og=new ArrayList<>(List.of(originalArray));
        ListIterator<String> listIterator = originalList.listIterator();
        while(listIterator.hasNext()){
            var here=listIterator.next();
            System.out.println(here);
        }
        //og.add("panda");
        //originalList.add("pandu");
        originalArray[0]="onee";
        sort(originalList);
//        System.out.println(og);
//        System.out.println(originalList);
//        System.out.println(Arrays.toString(originalArray));
    }
}
