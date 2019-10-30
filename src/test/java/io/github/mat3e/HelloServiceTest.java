package io.github.mat3e;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloServiceTest {
    private HelloService SUT = new HelloService();

    @Test
    public void test_null_prepareGreeting_returnsGreetingWithFallbackValue() throws Exception {
        //given
        String name = null;

        //when
        var result = SUT.prepareGreeting(name);

        //then
        assertEquals("Hello " + HelloService.FALLBACK_NAME + "!", result);
    }

    @Test
    public void test_name_prepareGreeting_returnsGreetingWithName() throws Exception {
        //given
        String name = "test";

        //when
        var result = SUT.prepareGreeting(name);

        //then
        assertEquals("Hello " + name + "!", result);
    }
}
