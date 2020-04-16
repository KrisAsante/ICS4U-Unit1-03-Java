/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : March 2020
 * Created for : ICS4US
 * Calculates the amount of energy released (in joules) from the object
 *
 ****************************************************************************/

import java.util.Scanner;

public class EMC2 {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        
        double speedOfLight;
        double energyReleased;
        double massOfObject;

        speedOfLight = 2.998 * Math.pow(10,8);

        System.out.print("Enter the mass of object in kg : ");

        massOfObject = userInput.nextDouble();
        if (massOfObject <= 0) {
            System.out.println("Invalid input");
        } else {

            energyReleased = massOfObject * Math.pow(speedOfLight,2);

            System.out.printf("The energy released is " + String.format("%6.3e",energyReleased) + " Joules. ");
        }
    }
}