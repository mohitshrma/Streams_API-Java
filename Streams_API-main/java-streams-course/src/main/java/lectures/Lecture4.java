package lectures;

import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.MatcherAssert.assertThat;

public class Lecture4 {

    @Test
    public void distinctNum() throws Exception
    {
        List<Integer> testList = List.of(1,10,20,20,30,40,45,45);

        List<Integer> collectDistinct = testList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collectDistinct);
    }

    @Test
    public void distinctWithSet() throws Exception
    {
        List<Integer> list1 = List.of(1,10,20,20,30,40,45,45);

        Set<Integer> distinctSet = list1.stream()
                .collect(Collectors.toSet());
        System.out.println(distinctSet);

    }

}
