/*
Jemma Tiongson
Class # 16031
Purpose: Program a formula that can find the circumference of a circle
 */

class CircumferenceCircle{
    public static void main (String [] args){
        int r = 3;
        final double PI = 3.14159;
        double circCircle = 2*PI*r;
        int newNum = (int) circCircle;
        System.out.println("The circumference of a circle with the radius of " +r+ " is " +newNum+".");
    }
}