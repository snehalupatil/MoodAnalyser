
import Exception.ExceptionTypeClass;
import Exception.MoodAnalyzerException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {
    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");

        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I an in Happy Mood");

        Assertions.assertEquals("HAPPY", mood);
    }
}
