package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter a noun: " );
        String noun = scnN.next();
        System.out.print( "Enter a verb: " );
        String verb = scnN.next();
        System.out.print( "Enter an adjective: " );
        String adjective = scnN.next();
        System.out.print( "Enter an adverb: " );
        String adverb = scnN.next();
        System.out.print( "Do you "+ verb +" your "+ adjective +" "+ noun +" "+ adverb +"? That's hilarious!");
    }
}
