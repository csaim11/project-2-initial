package com.csc205.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*

generate CuboidTest class

*/

public class CuboidTest {

    @Test
    public void testSurfaceArea() {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        double expectedSurfaceArea = 2 * (2.0 * 3.0 + 2.0 * 4.0 + 3.0 * 4.0);
        assertEquals(expectedSurfaceArea, cuboid.surfaceArea(), "Surface area should be " + expectedSurfaceArea);
    }

    @Test
    public void testVolume() {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        double expectedVolume = 2.0 * 3.0 * 4.0;
        assertEquals(expectedVolume, cuboid.volume(), "Volume should be " + expectedVolume);
    }

    @Test
    public void testGettersAndSetters() {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        assertEquals(2.0, cuboid.getLength(), "Length should be 2.0");
        assertEquals(3.0, cuboid.getWidth(), "Width should be 3.0");
        assertEquals(4.0, cuboid.getHeight(), "Height should be 4.0");

        cuboid.setLength(5.0);
        cuboid.setWidth(6.0);
        cuboid.setHeight(7.0);

        assertEquals(5.0, cuboid.getLength(), "Length should be 5.0");
        assertEquals(6.0, cuboid.getWidth(), "Width should be 6.0");
        assertEquals(7.0, cuboid.getHeight(), "Height should be 7.0");
    }

    @Test
    public void testToString() {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        String expectedString = "Cuboid [length=2.0, width=3.0, height=4.0, surfaceArea=" + cuboid.surfaceArea() + ", volume=" + cuboid.volume() + "]";
        assertEquals(expectedString, cuboid.toString(), "toString() should return " + expectedString);
    }

}
