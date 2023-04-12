package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.ExtendableBean;
import model.SequenceOfStops;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
public class JsonTest {

    @Test
    public void testConvert () throws JsonProcessingException {
        SequenceOfStops sequenceOfStops = new SequenceOfStops();
        sequenceOfStops.setStopFloors(List.of(3, 4, 5));
        String result = new ObjectMapper().writeValueAsString(sequenceOfStops);
        System.out.println(sequenceOfStops);
        System.out.println(sequenceOfStops.getStopFloors());
        System.out.println("result: " + result);
        System.out.println("result str: " + sequenceOfStops );
    }

    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect () throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);

        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
    }

    @Test
    public void readFromJsonFile () throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);

        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
    }
}
