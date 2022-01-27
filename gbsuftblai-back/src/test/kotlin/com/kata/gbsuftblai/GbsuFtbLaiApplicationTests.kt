package com.kata.gbsuftblai

import kotlin.test.Test
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GbsuFtbLaiApplicationTests {

    private val gbsuFtbLaiService: GbsuFtbLaiService = GbsuFtbLaiService()

    @Test
    fun contextLoads() {
    }

    @Test
    fun convertNumber_1()
    {
        assertEquals("1", gbsuFtbLaiService.convertNumber(1).getResult());
    }

    @Test
    fun convertNumber_3()
    {
        assertEquals("GbsuGbsu", gbsuFtbLaiService.convertNumber(3).getResult());
    }

    @Test
    fun convertNumber_5()
    {
        assertEquals("FtbFtb", gbsuFtbLaiService.convertNumber(5).getResult());
    }

    @Test
    fun convertNumber_7()
    {
        assertEquals("Lai", gbsuFtbLaiService.convertNumber(7).getResult());
    }

    @Test
    fun convertNumber_9()
    {
        assertEquals("Gbsu", gbsuFtbLaiService.convertNumber(9).getResult());
    }

    @Test
    fun convertNumber_51()
    {
        assertEquals("GbsuFtb", gbsuFtbLaiService.convertNumber(51).getResult());
    }

    @Test
    fun convertNumber_53()
    {
        assertEquals("FtbGbsu", gbsuFtbLaiService.convertNumber(53).getResult());
    }

    @Test
    fun convertNumber_33()
    {
        assertEquals("GbsuGbsuGbsu", gbsuFtbLaiService.convertNumber(33).getResult());
    }

    @Test
    fun convertNumber_27()
    {
        assertEquals("GbsuLai", gbsuFtbLaiService.convertNumber(27).getResult());
    }

    @Test
    fun convertNumber_15()
    {
        assertEquals("GbsuFtbFtb", gbsuFtbLaiService.convertNumber(15).getResult());
    }


}
