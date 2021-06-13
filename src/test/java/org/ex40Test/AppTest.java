package org.ex40Test;

import ex40.App;
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
        rflName1.put("Jake","Jacobson");
        rflName2.put("Jacquelyn","Jackson");
        result.add(rflName1);
        result.add(rflName2);
        assertEquals(result, App.search("Jac"));
    }

}