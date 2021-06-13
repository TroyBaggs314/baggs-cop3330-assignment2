package org.ex36Test;

import ex36.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.std()")
    @Test
    void testGet1()
    {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("9");
        nums.add("2");
        nums.add("5");
        nums.add("4");
        nums.add("12");
        nums.add("7");
        nums.add("8");
        nums.add("11");
        nums.add("9");
        nums.add("3");
        nums.add("7");
        nums.add("4");
        nums.add("12");
        nums.add("5");
        nums.add("4");
        nums.add("10");
        nums.add("9");
        nums.add("6");
        nums.add("9");
        nums.add("4");
        ArrayList<String> nums2 = new ArrayList<>();
        nums2.add("4");
        nums2.add("25");
        nums2.add("4");
        nums2.add("9");
        nums2.add("25");
        nums2.add("0");
        nums2.add("1");
        nums2.add("16");
        nums2.add("4");
        nums2.add("16");
        nums2.add("0");
        nums2.add("9");
        nums2.add("25");
        nums2.add("4");
        nums2.add("9");
        nums2.add("9");
        nums2.add("4");
        nums2.add("1");
        nums2.add("4");
        nums2.add("9");

        assertEquals(nums2, App.stdp1(nums));
        assertEquals(2.9832867780352594, App.stdp2(App.stdp1(nums)));
    }

}