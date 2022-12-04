package Labs.Lab1.triangle;

import Labs.Lab1.figure.Figure;
import Labs.Lab1.point.Point;


import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;


    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) throws Exception{
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;

        if (this.getArea() == 0)
            throw new Exception("Points lie on the same line");
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double getPerimeter() {

        double perimeter = 0;
        for(int i = 0; i < 3; i++){
            perimeter += getLengths().get(i);
        }
        return perimeter;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs(((getFirstPoint().getCoordinateX() - getThirdPoint().getCoordinateX()) * (getSecondPoint().getCoordinateY() - getThirdPoint().getCoordinateY())) -
                    ((getFirstPoint().getCoordinateY() - getThirdPoint().getCoordinateY()) * (getSecondPoint().getCoordinateX() - getThirdPoint().getCoordinateX())));

        //square = 1/2 * |(((x1 -x3) * (y2 - y3)) - ((y1 - y3) * (x2 - x3)))|
    }

    @Override
    public String toString() {
        return "triangle.Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }

    public List<Double> getLengths(){
        List<Double> lengthList = new ArrayList<>();
        lengthList.add(calculateLenght(firstPoint.getCoordinateX(), secondPoint.getCoordinateX(), firstPoint.getCoordinateY(), secondPoint.getCoordinateY()));
        lengthList.add(calculateLenght(firstPoint.getCoordinateX(), thirdPoint.getCoordinateX(), firstPoint.getCoordinateY(), thirdPoint.getCoordinateY()));
        lengthList.add(calculateLenght(secondPoint.getCoordinateX(), thirdPoint.getCoordinateX(), secondPoint.getCoordinateY(), thirdPoint.getCoordinateY()));

        return lengthList;
    }

    private double calculateLenght(double firstX, double secondX, double firstY, double secondY){
        return Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firstY- secondY, 2));
    }
}
