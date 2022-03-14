package com.example.test.javafx;

import com.example.javafx.model.Tour;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TourTest {

    @Test
    void getName() {
        var tour = new Tour("A Tour", "A Tour description!");
        Assertions.assertEquals("A Tour", tour.getName(), "Tour name does not match!");
    }

    @Test
    void test_setDescrption() {
        var tour = new Tour("A Tour", "A Tour description!");
        Assertions.assertEquals("A Tour description!", tour.getDescrption(), "Tour description does not match!");
    }


}