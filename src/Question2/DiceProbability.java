package Question2;

import Question1.Wheel;

import Question1.WheelCounter;
import Question1.WheelCounterInterface;

/**
 * Compute the probability that the sum of four 6-sided dice will be
 * greater than 12
 */

public class DiceProbability
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the dice roller program");
        Wheel die1 = new Wheel(1, 6);
        Wheel die2 = new Wheel(1, 6);
        Wheel die3 = new Wheel(1, 6);
        Wheel die4 = new Wheel(1, 6);

        WheelCounterInterface<Integer> theDice = new WheelCounter<Integer>(die4, die3, die2, die1);

        int numberGreaterThan12 = 0;
        int sum;

        for (int i = 0; i <  6*6*6*6; i++)
        {
            String rolls = " " + theDice.getWheelValue(4) + theDice.getWheelValue(3) + theDice.getWheelValue(2) + theDice.getWheelValue(1);

            sum = theDice.getWheelValue(1) + theDice.getWheelValue(2) + theDice.getWheelValue(3) + theDice.getWheelValue(4);

            System.out.println("For " + rolls + " the sum was " + sum);
            theDice.increase();

            if (sum > 12)
                numberGreaterThan12++;
        }

        System.out.println("The number of rolls out of " + 6 * 6 * 6 * 6 +
                " that were greater than 12 was " + numberGreaterThan12);
        System.out.println("The probability is " + ((float)numberGreaterThan12 / (6 * 6 * 6 * 6)));
    }
}
