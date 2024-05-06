package lectures;

import beans.Person;
import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1 {

    //Scenario
    //1. Find people aged less or equal 18
    //2. Then change implementation to find first 10 people


    //Imperative way before java 8
    @Test
    public void imperativeApproach() throws IOException
    {
        List<Person> people = MockData.getPeople();


        List<Person> youngPeople = Lists.newArrayList();
        final int limit = 10;
        int counter = 0;

        for(Person p:people)
        {
            if(p.getAge()<= 18)
            {
                youngPeople.add(p);
                counter++;
                if(counter==limit)
                {
                    break;
                }
            }
        }
        for(Person young:youngPeople)
        {
            System.out.println(young);
        }
    }

    //Declarative approach since Java 8.

    @Test
    public void declarativeApproachUsingStreams() throws IOException
    {
        List<Person> people = MockData.getPeople();
        List<Person> collectedList = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());
        collectedList.forEach(System.out::println);

    }

}
