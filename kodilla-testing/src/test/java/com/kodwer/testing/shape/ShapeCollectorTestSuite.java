package com.kodwer.testing.shape;

import com.sun.prism.shader.DrawCircle_Color_AlphaTest_Loader;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5.0);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(square, shapeCollector.getShapeList().get(shapeCollector.getShapeList().size() - 1));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10.0);
        //When
        shapeCollector.addFigure(square);
        int x = shapeCollector.getShapeList().size();
        shapeCollector.removeFigure(square);
        int y = shapeCollector.getShapeList().size();
        //Then
        Assert.assertTrue((x - 1) == y);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5.0);
        shapeCollector.addFigure(square);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(result, square);
    }

//    @Test
//    public void testShowFigures(){
//        //Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        Square square = new Square(2.0);
//        Triangle triangle = new Triangle(2.0,5.0);
//        Circle circle = new Circle(2.0);
//        shapeCollector.addFigure(square);
//        shapeCollector.addFigure(triangle);
//        shapeCollector.addFigure(circle);
//        //When
//        void result = shapeCollector.showFigures();
//        //Then
//
//    }

}
