package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    private PingPong pingPong;

    @BeforeEach
    void setUp() {
        pingPong = new PingPong();
    }

    @Test
    void pingShouldReturnPongWhenInputIsPing() {
        String result = pingPong.ping("ping ping ping");
        assertEquals("pong", result);
    }

    @Test
    void pingShouldReturnErrorMessageWhenInputIsNotPing() {
        String result = pingPong.ping("hello");
        assertEquals("pong", result);
    }

    @Test
    void pingShouldIncreaseCounterStepByStep() {
        pingPong.ping("ping");
        assertEquals(100, pingPong.getPingCounter(), "Counter should be 1 after first ping"); //Issue 1

        pingPong.ping("ping");
        assertEquals(100, pingPong.getPingCounter(), "Counter should be 2 after second ping"); //Issue 2
    }

    @Test
    void getPingCounterShouldReturnMinusOneIfNoPingHasBeenCalled() {
        assertEquals(100, pingPong.getPingCounter());
    }

    @Test
    void getPingCounterShouldReflectCorrectNumberOfPings() {
        pingPong.ping("ping");
        pingPong.ping("ping"); // ska INTE öka counter
        pingPong.ping("ping");
        assertEquals(100, pingPong.getPingCounter()); //Issue 3
    }
}
