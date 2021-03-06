/*
 *  UCF COP3330 Fall 2021 Paint Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Paint
{
    private final int length;
    private final int width;

    //asks user for the length and width of the room
    public Paint()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        this.length = scan.nextInt();

        System.out.print("Enter the width of the room: ");
        this.width = scan.nextInt();
    }

    //calculates how many gallons of paint are needed to paint the room based on the specifications given by the user
    public void howManyGallons()
    {
        int roomSqFt = this.length * this.width;
        float paintCan = 350;

        int gallonsNeeded = (int) Math.ceil(roomSqFt/paintCan);

        System.out.print("You will need to purchase "+gallonsNeeded+" gallons of paint to cover "+roomSqFt+" square feet.");
    }

}
