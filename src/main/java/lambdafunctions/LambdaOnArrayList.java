package lambdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaOnArrayList {
    public void function(){
        String[] names = {"BoB","SatWiK","SoHAil","siddhaRTH","ViVek","ViBHOR"};
        ArrayList<String> name = new ArrayList<>();
        Arrays.stream(names).toList().forEach(s -> name.add(s));
        name.replaceAll((s)->s.toUpperCase());
        //name.forEach(s -> System.out.println(s));
        name.replaceAll((s)->{
            StringBuilder builder=new StringBuilder(s);
            builder.append("sattu");
            return builder.toString();
        });
//        name.replaceAll((s)->{
//            StringBuilder builder=new StringBuilder(s);
//            StringBuilder reverseBuilder=new StringBuilder(s);
//            reverseBuilder.reverse();
//            builder.append("sattu");
//            builder.append(reverseBuilder);
//            return builder.toString();
//        });
        //name.forEach(s -> System.out.println(s));
        name.removeIf((s)->{
            StringBuilder reverseBuilder= new StringBuilder(s);
            StringBuilder builder= new StringBuilder(s);
            reverseBuilder.reverse();
            return reverseBuilder.toString().contentEquals(builder);
        });
        name.forEach(s -> System.out.println(s));
    }
}
