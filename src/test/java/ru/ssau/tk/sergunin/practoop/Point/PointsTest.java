package ru.ssau.tk.sergunin.practoop.Point;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PointsTest {
    @Test(groups = {"unit1"})
    public void testPoints() {
        Point firstPoints = new Point(1, 1, 1);
        Point secondPoints = new Point(0, 0, 0);
    }

    Point firstPoint = new Point(1, 1, 1);
    Point secondPoint = new Point(0, 0, 0);

    @Test(groups = {"unit1"})
    public void testPointslength() {
        assertEquals(firstPoint.length(firstPoint), Math.sqrt(3), 0.0001);
        assertEquals(secondPoint.length(secondPoint), 0, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsXYZ() {
        assertEquals(firstPoint.pointX, 1, 0.0001);
        assertEquals(firstPoint.pointY, 1, 0.0001);
        assertEquals(firstPoint.pointZ, 1, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsSum() {
        assertEquals(Points.sum(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Points.sum(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Points.sum(firstPoint, secondPoint).pointZ, 1, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsSubtract() {
        assertEquals(Points.subtract(firstPoint, secondPoint).pointX, 1, 0.0001);
        assertEquals(Points.subtract(firstPoint, secondPoint).pointY, 1, 0.0001);
        assertEquals(Points.subtract(firstPoint, secondPoint).pointZ, 1, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsMultiply() {
        assertEquals(Points.multiply(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Points.multiply(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Points.multiply(firstPoint, secondPoint).pointZ, 0, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsDivide() {
        assertEquals(Points.divide(secondPoint, firstPoint).pointX, 0, 0.0001);
        assertEquals(Points.divide(secondPoint, firstPoint).pointY, 0, 0.0001);
        assertEquals(Points.divide(secondPoint, firstPoint).pointZ, 0, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsEnlarge() {
        assertEquals(Points.enlarge(firstPoint, 5).pointX, 5, 0.0001);
        assertEquals(Points.enlarge(firstPoint, 5).pointY, 5, 0.0001);
        assertEquals(Points.enlarge(firstPoint, 5).pointZ, 5, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsOpposite() {
        assertEquals(Points.opposite(firstPoint).pointX, -1, 0.0001);
        assertEquals(Points.opposite(firstPoint).pointY, -1, 0.0001);
        assertEquals(Points.opposite(firstPoint).pointZ, -1, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsInverse() {
        assertEquals(Points.inverse(firstPoint).pointX, 1, 0.0001);
        assertEquals(Points.inverse(firstPoint).pointY, 1, 0.0001);
        assertEquals(Points.inverse(firstPoint).pointZ, 1, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsScalarProduct() {
        assertEquals(Points.scalarProduct(firstPoint, secondPoint), 0, 0.0001);
    }

    @Test(groups = {"unit1"})
    public void testPointsVectorProduct() {
        assertEquals(Points.vectorProduct(firstPoint, secondPoint).pointX, 0, 0.0001);
        assertEquals(Points.vectorProduct(firstPoint, secondPoint).pointY, 0, 0.0001);
        assertEquals(Points.vectorProduct(firstPoint, secondPoint).pointZ, 0, 0.0001);
    }
}
