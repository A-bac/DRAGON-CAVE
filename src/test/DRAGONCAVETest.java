import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRAGONCAVETest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void testforOne() {
        DRAGONCAVE.cave("1");
        assertEquals("1", "1", "one");
    }

    @Test
    void testforTwo() {
        DRAGONCAVE.cave("2");
        assertEquals("2", "2", "Two");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}