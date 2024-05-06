package lectures;

import org.junit.Test;

import java.util.Arrays;

public class Lecture9 {

    @Test
    public void reduce() throws Exception
    {
        Integer[] integers = {1,2,3,4,99,10,12,199};
        Integer sumReduced = Arrays.stream(integers)
                .reduce(0, (a, b) -> a + b);//start with 0 then 0+1, 1+2, 2+3,...
        System.out.println(sumReduced);

    //2nd way
        Integer otherSum = Arrays.stream(integers).reduce(0, Integer::sum);
        System.out.println(otherSum);

    }

}
