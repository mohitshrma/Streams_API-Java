package lectures;

import mockdata.MockData;
import org.junit.Test;

import java.util.stream.Collectors;

public class Lecture13 {

    @Test
    public void intermediateAndTerminalOperations() throws Exception
    {
        System.out.println(
                MockData.getCars()
                        .stream()
                        .filter(car -> {
                            System.out.println("filter car "+car);
                            return car.getPrice() < 10000;
                        })
                        .map(car->{
                            System.out.println("mapping car "+car);
                            return car.getPrice();
                        })
                        .map(price->{
                            System.out.println("mapping price "+price);
                            return price +(price * .14);
                        })
                        .collect(Collectors.toList())

        );
    }

}
