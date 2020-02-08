package com.kodwer.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeList.remove(shape);
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public void showFigures() {
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

}
