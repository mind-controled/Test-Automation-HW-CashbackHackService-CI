package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100For900() {
        Assertions.assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldReturn999For1() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999For1001() {
        Assertions.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn0For1000() {
        Assertions.assertEquals(0, service.remain(1000));
    }
}