/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapeareacala;

import javax.swing.JOptionPane;

/**
 *
 * @author owens
 */
public class ShapeAreaCala {
        

    public static double CalcRectangleArea( double lenght, double breath){
        
        return lenght* breath;
    }
    public static double CalcCircleArea(double radius, double pi){
        
        return pi*radius*radius;
    }
    
    public static double CalcSquareArea( double side ){
        return side*side;
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RECTANGLE
        double rectangleLength = 6.0;
        double rectangleBreath = 9.0;
        double Area= CalcRectangleArea(rectangleBreath, rectangleBreath);
        System.out.println(" Area of a rectangle with a langht of "+rectangleLength+" and a breath of "+rectangleBreath+" is "+ Area);
        
        
        //CIRCLE
        double circleRad= 7.5;
        double circlePi= 3.14;
        double AreaCircle = CalcCircleArea(circlePi,circleRad);
        System.out.println("Area of a circle with a radius of "+circleRad+" is "+ AreaCircle);
          
        //SQUARE
        
        double squareLength= 12;
        double AreaSquare = CalcSquareArea(squareLength);
        System.out.println("Area of a square with a side length of "+squareLength+" is "+ AreaSquare);
    }
    
}
