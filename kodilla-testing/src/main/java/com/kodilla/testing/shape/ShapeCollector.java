package com.kodilla.testing.shape;

import java.util.LinkedList;

public class ShapeCollector {

   LinkedList<Shape> shapeList = new LinkedList<Shape>();

   public void addFigure(Shape shape) {
      shapeList.add(shape);
   }

   public void removeFigure(Shape shape) {
      shapeList.remove(shape);
   }

   public Shape getFigure(int n) {
       Shape shape = shapeList.get(n);
      return shape;
   }

   public void showFigures() {
      for (Shape shape : shapeList) {
         System.out.println("It's: " + shape.getShapeName() + " it's area is: " + shape.getField());
      }
   }
   public static void main(String[] args){
      ShapeCollector myShapeCollector = new ShapeCollector();
      myShapeCollector.addFigure(new Square(10));
      myShapeCollector.addFigure(new Triangle(2, 3));
      myShapeCollector.addFigure(new Circle(18));
      myShapeCollector.showFigures();
   }
}