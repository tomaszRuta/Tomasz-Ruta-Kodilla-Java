package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addingFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        int listSizeBefore = shapeCollector.shapeList.size();
        shapeCollector.addFigure(new Square(10));
        int listSizeAfter = shapeCollector.shapeList.size();
        //Then
        Assert.assertEquals("No element added", listSizeBefore + 1, listSizeAfter);
        System.out.println("Test OK");
    }

    @Test
    public void removingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        Shape triangle = new Triangle(2, 3);
        Shape circle = new Circle(18);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        int listSizeBefore = shapeCollector.shapeList.size();
        shapeCollector.removeFigure(triangle);
        int listSizeAfter = shapeCollector.shapeList.size();
        //Then
        Assert.assertEquals("List after removing element contains same quantity as before removing.", listSizeBefore -1, listSizeAfter);
        System.out.println("Test OK");
    }

    @Test
    public void gettingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        Shape triangle = new Triangle(2, 3);
        Shape circle = new Circle(18);
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        Shape figure = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals("N get element from list is not the same", figure, square);
        System.out.println("Test OK");
    }

    @Test
    public void showingFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(15);
        Shape triangle = new Triangle(2, 3);
        Shape circle = new Circle(18);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        Shape figure1 = shapeCollector.getFigure(0);
        Shape figure2 = shapeCollector.getFigure(1);
        Shape figure3 = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals("Display wrong name of the shape", figure1.getShapeName(), "Triangle");
        Assert.assertEquals("Display wrong name of the shape", figure2.getShapeName(), "Circle");
        Assert.assertEquals("Display wrong name of the shape", figure3.getShapeName(), "Square");
        System.out.println("Test OK");

    }
}
