package javabasics.lesson4;

import org.junit.jupiter.api.Test;

public class HomeworkProject3 {
    @Test
    public void task1() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("My brother is " + brotherAge + " years old, and I am only " + sisterAge + " years old.");
        System.out.println("Together we are " + (sisterAge + brotherAge) + " years old!");
        System.out.println("Our age difference is " + (brotherAge - sisterAge) + ".");
    }
}
