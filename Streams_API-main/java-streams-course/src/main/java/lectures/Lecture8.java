package lectures;

import beans.Car;
import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Lecture8 {

    @Test
    public void simpleGrouping() throws Exception
    {
        Map<String, List<Car>> grouping = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake));
        grouping.forEach((make, cars) -> {
            System.out.println(make);
            cars.forEach(System.out::println);
        });
    }

    @Test
    public void groupingAndCounting() throws Exception
    {
        ArrayList<String> names = Lists.newArrayList(
                "John",
                "Mariam",
                "Alex",
                "Muhammad",
                "Muhammad",
                "Vincent",
                "Alex",
                "Alex"
        );

        Map<String, Long> counting = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        counting.forEach((name, count)-> System.out.println(name + " > " +count));
    }
}
