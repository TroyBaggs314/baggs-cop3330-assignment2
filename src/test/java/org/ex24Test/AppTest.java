package org.ex24Test;

import ex24.App;
import ex24.Words;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @DisplayName("Test App.isAnagram() = true")
    @Test
    void testGetTrue() {
        Words w = new Words();
        w.word1 = "tone";
        w.word2 = "note";
        assertEquals(true, App.isAnagram(w));
    }

    @DisplayName("Test App.isAnagram() = false")
    @Test
    void testGetFalse() {
        Words w = new Words();
        w.word1 = "self";
        w.word2 = "note";
        assertEquals(false, App.isAnagram(w));
    }

}