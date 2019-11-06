package io.github.mat3e;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloServiceTest {
    private final static String WELCOME = "Hello";

    @Test
    public void test_prepareGreeting_nullName_returnsGreetingWithFallbackName() throws Exception {
        //given
        var mockRepository = alwaysReturningHelloRepository();
        String name = null;
        var SUT = new HelloService(mockRepository);

        //when
        var result = SUT.prepareGreeting(null, "-1");

        //then
        assertEquals(WELCOME+" " + HelloService.FALLBACK_NAME + "!", result);
    }


    @Test
    public void test_name_prepareGreeting_returnsGreetingWithName() throws Exception {
        //given
        String name = "test";
        var SUT = new HelloService();

        //when
        var result = SUT.prepareGreeting(name, "-1");

        //then
        assertEquals(WELCOME+" " + name + "!", result);
    }


    private LangRepository alwaysReturningHelloRepository() {
        return new LangRepository(){
            @Override
            Optional<Lang> findById(Long id) {
                return Optional.of(new Lang(null, WELCOME, null));
            }
        };
    }
}
