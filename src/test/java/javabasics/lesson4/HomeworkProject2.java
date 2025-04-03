package javabasics.lesson4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HomeworkProject2 {
    @Test
    public void printMyNameIs() {

        String firstName = "Lyuba";
        String lastName = "Kuchina";
        byte age = 39;
        LocalDate dateOfBirth = LocalDate.of(1985, 12, 20);
        String email = "lubova.kucina@gmail.com";
        String gender = "female";
        boolean hasCar = true;
        String personalNumber = "201285-13556";
        String homeAddress = "Zvaigznaja gatve 16-51, Riga";
        double heightInMeters = 1.73;
        byte weightInKilograms = 62;

        System.out.println("My name is " + firstName + " and I'm " + age + ". My birthday is " + dateOfBirth + ".");
        //"I am a female with a height of 1.73 meters and a weight of 62 kilograms."
        System.out.println("I am a " + gender + " with a height of " + heightInMeters + " meters and a weight of " + weightInKilograms + " kilograms." );
    }

    @Test
    public void calculateAgeInDays() {
        LocalDate dateOfBirth = LocalDate.of(1985, 12, 20); //дата рождения
        LocalDate currentDate = LocalDate.now(); //текущая дата

        long ageInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        long ageInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);

        System.out.println("Возраст в днях: " + ageInDays);
        System.out.println("Возраст в месяцах: " + ageInMonths);
    }
}
