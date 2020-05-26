package com.kodwer.testing.forum.statistics;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*Testy zrealizuj przy pomocy mocka interfejsu Statistics. Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

        gdy liczba postów = 0,
        gdy liczba postów = 1000,
        gdy liczba komentarzy = 0,
        gdy liczba komentarzy < liczba postów,
        gdy liczba komentarzy > liczba postów,
        gdy liczba użytkowników = 0,
        gdy liczba użytkowników = 100.*/

public class StatisticsTestSuite {
    @Test
    public void testCase1(){
        //Given
        Statistics statistics = mock(Statistics.class);

        //When

        //Then
    }


}
