
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test

public class MoodAnalyserTest {
    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad Mood");

        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_Whensad_shouldReturnSad()  {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in any Mood");

         Assertions.assertEquals("SAD", mood);
    }

}
