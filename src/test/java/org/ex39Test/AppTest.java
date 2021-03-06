package org.ex39Test;

import ex39.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.sort()")
    @Test
    void testGet1()
    {
        List<Map> alDm = new ArrayList<>();
        HashMap<String, String> flName1 = new HashMap<>();
        HashMap<String, String> flName2 = new HashMap<>();
        HashMap<String, String> flName3 = new HashMap<>();
        HashMap<String, String> flName4 = new HashMap<>();
        HashMap<String, String> flName5 = new HashMap<>();
        HashMap<String, String> flName6 = new HashMap<>();
        flName1.put("John","Johnson");
        flName2.put("Tou","Xiong");
        flName3.put("Michaela","Michaelson");
        flName4.put("Jake","Jacobson");
        flName5.put("Jacquelyn","Jackson");
        flName6.put("Sally","Webber");
        alDm.add(flName1);
        alDm.add(flName2);
        alDm.add(flName3);
        alDm.add(flName4);
        alDm.add(flName5);
        alDm.add(flName6);
        List<Map> result = new ArrayList<>();
        HashMap<String, String> rflName1 = new HashMap<>();
        HashMap<String, String> rflName2 = new HashMap<>();
        HashMap<String, String> rflName3 = new HashMap<>();
        HashMap<String, String> rflName4 = new HashMap<>();
        HashMap<String, String> rflName5 = new HashMap<>();
        HashMap<String, String> rflName6 = new HashMap<>();
        rflName5.put("Jacquelyn","Jackson");
        rflName4.put("Jake","Jacobson");
        rflName1.put("John","Johnson");
        rflName3.put("Michaela","Michaelson");
        rflName6.put("Sally","Webber");
        rflName2.put("Tou","Xiong");
        result.add(rflName5);
        result.add(rflName4);
        result.add(rflName1);
        result.add(rflName3);
        result.add(rflName6);
        result.add(rflName2);
        assertEquals(result, App.sort(alDm));
    }

}