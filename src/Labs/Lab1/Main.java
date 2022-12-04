package Labs.Lab1;
import Labs.Lab1.point.Point;
import Labs.Lab1.triangle.*;



public class Main {

    public static void main(String[] args) throws Exception {
        TriangleCalculator.addTriangleByTypeToTable(new Triangle(new Point(2, 0), new Point(0, 0), new Point(0, 2)));
        TriangleCalculator.addTriangleByTypeToTable(new Triangle(new Point(0, 0), new Point(0, 4), new Point(2, 2)));
        TriangleCalculator.addTriangleByTypeToTable(new Triangle(new Point(0, 0), new Point(5, 5 * Math.sqrt(3)), new Point(10, 0)));
        TriangleCalculator.addTriangleByTypeToTable(new Triangle(new Point(2, 8), new Point(4, 4), new Point(-4, 11)));

        System.out.println(TriangleCalculator.getTriangleTypesArrayListMap());

    }
}
