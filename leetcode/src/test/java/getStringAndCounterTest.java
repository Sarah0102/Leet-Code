import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getStringAndCounterTest {
    GetStringAndCounter counter;
    @BeforeEach
    public void getObject(){
        counter = new GetStringAndCounter();
    }
    @Test
    public void shouldGetCorrectString1(){
        assertEquals("a1b2c3", counter.getStringAndCounter("abbccc"));
    }
    @Test
    public void shouldGetCorrectString2(){
        assertEquals("", counter.getStringAndCounter(""));
    }
    @Test
    public void shouldGetCorrectString3(){
        assertEquals("a1b2a2", counter.getStringAndCounter("abbaa"));
    }
    @Test
    public void shouldGetCorrectString4(){
        assertEquals("a14b26", counter.getStringAndCounter("aaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbb"));
    }

}