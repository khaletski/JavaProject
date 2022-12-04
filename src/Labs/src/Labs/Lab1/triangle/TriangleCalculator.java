package triangle;

import java.util.*;

public class TriangleCalculator {

    private static Map<TriangleTypes, ArrayList<Triangle>> triangleTypesArrayListMap = new HashMap<>();

    public static void addTriangleByTypeToTable(Triangle triangle){

        List<Double> lengthOfSides = triangle.getLengths();
        Collections.sort(lengthOfSides);

        if((lengthOfSides.get(0).equals(lengthOfSides.get(1))) && (lengthOfSides.get(0).equals(lengthOfSides.get(2)))) {
            addTriangleToTable(TriangleTypes.EQUILATERAL, triangle);
        } else if(triangle.getArea() == 0.5 * lengthOfSides.get(0) * lengthOfSides.get(1)){
            addTriangleToTable(TriangleTypes.RECTANGULAR, triangle);
        } else if((lengthOfSides.get(0).equals(lengthOfSides.get(1))) || (lengthOfSides.get(0).equals(lengthOfSides.get(2))) || (lengthOfSides.get(2).equals(lengthOfSides.get(1)))) {
            addTriangleToTable(TriangleTypes.ISOSCELES, triangle);
        } else{
            addTriangleToTable(TriangleTypes.ARBITRARY, triangle);
        }
    }

    private static void addTriangleToTable(TriangleTypes triangleType, Triangle triangle) {
        triangleTypesArrayListMap.computeIfAbsent(triangleType, k -> new ArrayList<>());
        triangleTypesArrayListMap.get(triangleType).add(triangle);
    }

    public static Map<TriangleTypes, ArrayList<Triangle>> getTriangleTypesArrayListMap() {
        return triangleTypesArrayListMap;
    }

    public static Triangle findTriangleWithMaxPerimeter(TriangleTypes triangleType){
        Triangle triangleWithMaxPerimeter = null;
        double maxPerimeter = 0;
        for(Triangle triangle : triangleTypesArrayListMap.get(triangleType)){
            if (triangle.getPerimeter() > maxPerimeter) {
                maxPerimeter = triangle.getPerimeter();
                triangleWithMaxPerimeter = triangle;
            }
        }
        return triangleWithMaxPerimeter;
    }

    public static Triangle findTriangleWithMaxArea(TriangleTypes triangleType){
        Triangle triangleWithMaxArea = null;
        double maxArea = 0;
        for(Triangle triangle : triangleTypesArrayListMap.get(triangleType)){
            if (triangle.getArea() > maxArea) {
                maxArea = triangle.getPerimeter();
                triangleWithMaxArea = triangle;
            }
        }
        return triangleWithMaxArea;
    }

    public static Triangle findTriangleWithMinPerimeter(TriangleTypes triangleType){
        Triangle triangleWithMinPerimeter = null;
        double minPerimeter = 0;
        for(Triangle triangle : triangleTypesArrayListMap.get(triangleType)){
            if ((triangle.getPerimeter() < minPerimeter) || minPerimeter == 0) {
                minPerimeter = triangle.getPerimeter();
                triangleWithMinPerimeter = triangle;
            }
        }
        return triangleWithMinPerimeter;
    }

    public static Triangle findTriangleWithMinArea(TriangleTypes triangleType){
        Triangle triangleWithMinArea = null;
        double minArea = 0;
        for(Triangle triangle : triangleTypesArrayListMap.get(triangleType)){
            if ((triangle.getArea() < minArea) || minArea == 0) {
                minArea = triangle.getPerimeter();
                triangleWithMinArea = triangle;
            }
        }
        return triangleWithMinArea;
    }
}