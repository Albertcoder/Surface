package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];

        // Generate random shapes
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3); // 0 for Sphere, 1 for Cylinder, 2 for Cube
            switch (shapeType) {
                case 0: // Sphere
                    shapes[i] = new Sphere(1 + random.nextDouble() * 9); // Radius between 1 and 10
                    break;
                case 1: // Cylinder
                    shapes[i] = new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15); // Radius 1-10, Height 5-20
                    break;
                case 2: // Cube
                    shapes[i] = new Cube(1 + random.nextDouble() * 9); // Side between 1 and 10
                    break;
            }
        }

        // Output information about each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n\n", shape.volume());
        }
    }
}
