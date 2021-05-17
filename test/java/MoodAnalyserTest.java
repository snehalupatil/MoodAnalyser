
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test

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
        String mood = moodAnalyser.analyseMood("I am in Any mood");

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in happy mood");

        Assertions.assertEquals("HAPPY", mood);
    }
}
