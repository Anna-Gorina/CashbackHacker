package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(900);
        assertEquals(100, expected);
    }

    @Test
    public void shouldEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1000);
        assertEquals(0, expected);
    }

    @Test
    public void shouldOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1500);
        assertEquals(500, expected);
    }
}