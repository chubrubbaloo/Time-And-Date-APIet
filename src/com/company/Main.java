package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Skapa ett LocalDate-objekt som representerar den 24:e mars 2005.
        LocalDate localDate = LocalDate.of(2005, 3, 24);
        System.out.println(localDate);

        System.out.println("----");

        // Skapa ett LocalTime-objekt som representerar att klockan är 20 i 5 på eftermiddagen.
        LocalTime localTime = LocalTime.of(16,40);
        System.out.println(localTime);

        System.out.println("----");

        // Kombinera dessa två med zonedID:et för "Europe/Paris" till ett ZonedDateTime-objekt.
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate,localTime,ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);

        System.out.println("----");

        // Byt ut året till 2019 för ditt ZonedDateTime-objekt
        zonedDateTime = zonedDateTime.withYear(2019);
        System.out.println(zonedDateTime);

        System.out.println("----");

        // Lägg till 2 timmar till ditt ZonedDateTime-objekt
        System.out.println(zonedDateTime.plusHours(2));
        System.out.println("----");

        // Räkna ut hur många sekunder det är mellan tidpunkten ditt zonedDateTime-oblekt representerar med tiden just nu.
          long seconds =      Duration.between(zonedDateTime, ZonedDateTime.now()).toSeconds();

        System.out.println("Skillnaden: " + seconds + " sekunder");
        System.out.println("-----");

        DateTimeFormatter fullDate = DateTimeFormatter.ofPattern("yyyy-MMMM-dd hh:mm:ss zzz");

        // Skriv ut ditt ZonedDateTime-objekt med 3 olika typer av formatering
        System.out.println(zonedDateTime.format(fullDate));
        System.out.println("----");

        // Hämta ut antalet Unix-sekunder för ditt zonedDatetime-objekt
        System.out.println(" Epoch-sekunder: " + zonedDateTime.toEpochSecond());
        System.out.println("----");

        // Skriv en metod som tar in ett ZonedDateTime-objekt och returnerar vilken veckodag det är.
        System.out.println(
                getDayOfWeek(zonedDateTime)

        );


    }
    private static DayOfWeek getDayOfWeek(ZonedDateTime zonedDateTime){
        return zonedDateTime.getDayOfWeek();
    }
}
