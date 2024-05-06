package lectures;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.Immutable;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Lecture3 {


    @Test
    public void min() throws Exception
    {
        final List<Integer> numbers = ImmutableList.of(1,2,3,100,23,93,110);
        Integer minNum = numbers.stream()
                .min(Comparator.naturalOrder())
                        .get();
        assertThat(minNum,equalTo(1));
        System.out.println(minNum);

    }

    @Test
    public void max() throws Exception
    {
        final List<Integer> numbers = ImmutableList.of(1,2,3,100,23,93,110);
        Integer maxNum = numbers.stream()
                .max(Integer::compareTo)
                        .get();

        assertThat(maxNum,equalTo(110));  //value in equal to which is maxValue
        System.out.println(maxNum);
    }

}
