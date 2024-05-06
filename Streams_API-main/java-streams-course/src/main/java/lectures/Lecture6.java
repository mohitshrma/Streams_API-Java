package lectures;

import org.junit.Test;

import java.util.Arrays;

public class Lecture6 {

    @Test
    public void findAny() throws Exception
    {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int findAny = Arrays.stream(numbers)
                .filter(n -> n < 10)
                .findAny()
                .get();
        System.out.println(findAny);
    }

    @Test
    public void findFirst() throws Exception
    {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int findFirst = Arrays.stream(numbers)
                .filter(n -> n > 5 && n < 10)
                .findFirst()
                .get();
        System.out.println(findFirst);
    }


}
