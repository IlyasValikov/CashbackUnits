package ru.netology;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class CashbackHackServiceTest {
     @Test
    void shouldCalculateCashbackIfAmountLess1000() {
         CashbackHackService service = new CashbackHackService();

         int amount = 800;

         int actual = service.remain(amount);
         int expected = 200;

         assertEquals(actual, expected);
     }

     @Test
    void shouldCalculateCashbackIfAmountUnder1000() {
         CashbackHackService service = new CashbackHackService();

         int amount = 1001;

         int actual = service.remain(amount);
         int expected =999;

         assertEquals(actual, expected);
     }

     @Test
    void shouldCalculateCashbackIfAmountIs1000() {
         CashbackHackService service = new CashbackHackService();

         int amount = 1000;

         int actual = service.remain(amount);
         int expected = 0;

         assertEquals(actual, expected);
     }
}
