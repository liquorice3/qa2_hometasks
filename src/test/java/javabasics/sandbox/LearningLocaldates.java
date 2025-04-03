package javabasics.sandbox;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.*;

public class LearningLocaldates {
    public static void main(String[] args) {
        //dates
        LocalDate ld = LocalDate.of(2021, 1, 13);
        LocalDate ld1 = LocalDate.of(2021, Month.JANUARY, 13);
        System.out.println(ld);

        //times
        LocalTime lt = LocalTime.of(14, 38);
        System.out.println(lt);

        //date and time
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);

        //zoned date and times
        //for(String zone : ZoneId.getAvailableZoneIds()){
            //System.out.println(zone);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Ust-Nera"));
        System.out.println(zdt);

        }
    }
