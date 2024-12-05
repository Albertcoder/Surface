Overview
This project demonstrates the concept of polymorphism in Java by implementing a Shape3DInterface interface for 3D shapes. The program includes different shape classes (Sphere, Cylinder, and Cube) that implement this interface, and calculates the surface area and volume of randomly generated shapes.

Features
Implements an interface Shape3DInterface with methods for calculating surface area and volume.
Defines classes for three 3D shapes:
Sphere
Cylinder
Cube
Randomly generates shapes with random dimensions and calculates their properties.
Outputs the type of shape, its dimensions, surface area, and volume.
File Structure
The project consists of the following files:

Shape3DInterface.java: Defines the interface for 3D shapes.
Sphere.java: Implements the Shape3DInterface for a sphere.
Cylinder.java: Implements the Shape3DInterface for a cylinder.
Cube.java: Implements the Shape3DInterface for a cube.
Shape3DTest.java: The main program that creates random shapes and displays their details.
How to Use
1. Prerequisites
Java Development Kit (JDK) installed on your machine.
A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).
2. Compilation
Place all the .java files in the same directory.
Open a terminal or command prompt.
Navigate to the directory where the .java files are stored.
Compile all files using the following command:
bash
Копировать код
javac Shape3DInterface.java Sphere.java Cylinder.java Cube.java Shape3DTest.java
3. Execution
Run the program using the following command:

bash
Копировать код
java Shape3DTest
4. Expected Output
The program generates 10 random shapes, calculates their surface area and volume, and outputs the details. Example:

yaml
Копировать код
Sphere [Radius: 7.32]
Surface Area: 673.65
Volume: 1645.06

Cylinder [Radius: 3.85, Height: 14.33]
Surface Area: 439.03
Volume: 666.17

Cube [Side: 6.54]
Surface Area: 256.40
Volume: 279.73
...
![Снимок экрана 2024-12-05 140307](https://github.com/user-attachments/assets/4be3c953-286d-43c4-bbc5-fb215783bece)

Key Concepts
Polymorphism: Different shape classes implement the same interface (Shape3DInterface) but provide their specific implementations for surfaceArea() and volume() methods.
Random Object Creation: Uses the Random class to generate random dimensions for the shapes.
Interface: Ensures a consistent contract for all implementing classes.
Customization
You can modify:

The range of random values for the dimensions by changing the parameters of Math.random() or Random.
Add new shapes by creating a class that implements Shape3DInterface and defining the appropriate formulas for surfaceArea() and volume().
