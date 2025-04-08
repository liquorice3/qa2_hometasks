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
        System.out.println("I am a " + heightInMeters + "m tall " + gender + " weighing " + weightInKilograms + " kg." );
    }

    @Test
    public void calculateAgeInDays() {
        LocalDate dateOfBirth = LocalDate.of(1985, 12, 20); //дата рождения
        LocalDate currentDate = LocalDate.now(); //текущая дата

        long ageInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        long ageInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
        long ageInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);

        System.out.println("Возраст в днях: " + ageInDays);
        System.out.println("Возраст в месяцах: " + ageInMonths);
        System.out.println("Возраст в годах: " + ageInYears);
    }
}
