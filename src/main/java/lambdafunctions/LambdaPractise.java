package lambdafunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaPractise {
    public void practise(){
        Consumer<String> printTheParts = (s -> {
           String[] parts=s.split(" ");
           List<String> a = Arrays.stream(parts).toList();
           a.forEach(System.out::println);
        });
        printTheParts.accept("this is my time");

        UnaryOperator<String> u=(s)->{
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i%2==1) builder.append(s.charAt(i));
            }
            return builder.toString();
        };
        BiFunction<UnaryOperator<String>,String,String> fun = (uu,s1) -> uu.apply(s1);
        String here=fun.apply(u,"1234567890");
        System.out.println(here);
        Supplier<String> ss = () -> "I love java";
        String ilovejava = ss.get();
        System.out.println(ilovejava);
        BinaryOperator<String> binaryOperator = String::concat;
    }
}
