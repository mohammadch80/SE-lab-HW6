package org.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PrototypeTest {
    @Test
    public void rectangleCloneTest() {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle clone = rectangle.clone();

        assertNotNull(clone);
        assertEquals(rectangle.getWidth(), clone.getWidth());
        assertEquals(rectangle.getHeight(), clone.getHeight());
        clone.setWidth(11);
        assertEquals(11, clone.getWidth());
        assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void squareCloneTest() {
        Square square = new Square(2);
        Square clone = square.clone();

        assertNotNull(clone);
        assertEquals(square.getSide(), clone.getSide());
        assertEquals(square.getSide(), clone.getSide());
        clone.setSide(11);
        assertEquals(11, clone.getSide());
        assertEquals(2, square.getSide());
    }
}
