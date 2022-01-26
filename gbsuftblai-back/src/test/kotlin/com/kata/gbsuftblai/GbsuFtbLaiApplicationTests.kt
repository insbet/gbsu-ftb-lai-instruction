package com.kata.gbsuftblai

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GbsuFtbLaiApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    public void convertNumber_null()
    {
        assertEquals(null, gbsuFtbLaiService.convertNumber(null).getResult());
    }

    @Test
    public void convertNumber_1()
    {
        assertEquals("1", gbsuFtbLaiService.convertNumber(1).getResult());
    }

    @Test
    public void convertNumber_3()
    {
        assertEquals("GbsuGbsu", gbsuFtbLaiService.convertNumber(3).getResult());
    }

    @Test
    public void convertNumber_5()
    {
        assertEquals("FtbFtb", gbsuFtbLaiService.convertNumber(5).getResult());
    }

    @Test
    public void convertNumber_7()
    {
        assertEquals("Lai", gbsuFtbLaiService.convertNumber(7).getResult());
    }

    @Test
    public void convertNumber_9()
    {
        assertEquals("Gbsu", gbsuFtbLaiService.convertNumber(9).getResult());
    }

    @Test
    public void convertNumber_51()
    {
        assertEquals("GbsuFtb", gbsuFtbLaiService.convertNumber(51).getResult());
    }

    @Test
    public void convertNumber_53()
    {
        assertEquals("FtbGbsu", gbsuFtbLaiService.convertNumber(53).getResult());
    }

    @Test
    public void convertNumber_33()
    {
        assertEquals("GbsuGbsuGbsu", gbsuFtbLaiService.convertNumber(33).getResult());
    }

    @Test
    public void convertNumber_27()
    {
        assertEquals("GbsuLai", gbsuFtbLaiService.convertNumber(27).getResult());
    }

    @Test
    public void convertNumber_15()
    {
        assertEquals("GbsuFtbFtb", gbsuFtbLaiService.convertNumber(15).getResult());
    }


}
