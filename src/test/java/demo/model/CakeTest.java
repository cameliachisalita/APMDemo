package demo.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CakeTest {

    private Cake cake;

    @BeforeEach
    void setUp() {
        cake = new Cake(120.0f);
    }

    @AfterEach
    void tearDown() {
        cake = null;
    }

    @Test
    void getWeight() {
        assert cake.getWeight() == 120.0f;
    }

    @Test
    void testToString() {
        assert cake.toString().equals("Cake{" + "weight=" + 120.0f + '}');
    }

    @Test
    void setWeight() {
    }
}