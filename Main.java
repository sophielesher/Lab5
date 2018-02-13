import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double lengthRect;
        double widthRect;
        double radius;
        double sideA;
        double sideB;
        double sideC;
        double pi = 3.14;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter length of rectangle (positive integer): ");
        lengthRect = scnr.nextDouble();

        System.out.print("Enter width of rectangle (positive integer): ");
        widthRect = scnr.nextDouble();

        System.out.print("Now enter the radius of the circle (positive integer): ");
        radius = scnr.nextDouble();

        System.out.print("Enter side A of triangle (positive integer): ");
        sideA = scnr.nextDouble();

        System.out.print("Enter side B of triangle (positive integer): ");
        sideB = scnr.nextDouble();

        System.out.print("Enter side C of triangle (positive integer): ");
        sideC = scnr.nextDouble();

        System.out.println(" ");


        double areaRect = (lengthRect * widthRect);
        System.out.println("Area of rectangle: " + areaRect);

        double areaCircle = (pi * radius * radius);
        System.out.println("Area of circle: " + areaCircle);

        double perimRect = (2 * (lengthRect + widthRect));
        System.out.println("Perimeter of rectangle: " + perimRect);

        double circumCircle = (2 * pi * radius);
        System.out.println("Circumference of circle: " + circumCircle);

        double side = ((sideA + sideB + sideC) / 2.0);
        double areaTri = (Math.sqrt(side * (side - sideA) * (side - sideB) * (side - sideC)));
        System.out.println("Area of triangle: " + areaTri);

        double perimTri = (sideA + sideB + sideC);
        System.out.println("Perimeter of triangle: " + perimTri);

        System.out.println(" ");



        double radiusSphere;
        double diamRectP;
        double heightRectP;
        double widthRectP;
        double heightCyl;
        double radCyl;

        System.out.print("Enter the radius of the sphere: ");
        radiusSphere = scnr.nextDouble();

        System.out.print("Enter the diameter of the rectangular prism: ");
        diamRectP = scnr.nextDouble();

        System.out.print("Enter the height of the rectangular prism: ");
        heightRectP = scnr.nextDouble();

        System.out.print("Enter the width of the rectangular prism: ");
        widthRectP = scnr.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        heightCyl = scnr.nextDouble();

        System.out.print("Enter the radius of the cylinder: ");
        radCyl = scnr.nextDouble();

        System.out.println(" ");


        double sphereSA = (4.0 * pi * radiusSphere * radiusSphere);
        System.out.println("The surface area of the sphere is: " + sphereSA);

        double volSphere = (4.0 * pi * (radiusSphere * radiusSphere * radiusSphere) / 3);
        System.out.println("The volume of the sphere is: " + volSphere);

        double rectPrisSA = (2 * ((heightRectP * diamRectP) + (heightRectP * widthRectP) + (diamRectP * widthRectP)));
        System.out.println("The surface area of the rectangular prism is: " + rectPrisSA);

        double volRectPris = (heightRectP * diamRectP * widthRectP);
        System.out.println("The volume of the rectangular prism is: " + volRectPris);

        double cylSA = ((2 * pi * radCyl * heightCyl) + (2 * pi * radCyl * radCyl));
        System.out.println("The surface area of the cylinder is: " + cylSA);

        double volCyl = (pi * radCyl * radCyl * heightCyl);
        System.out.println("The volume of the cylinder is: " + volCyl);









    }
}
