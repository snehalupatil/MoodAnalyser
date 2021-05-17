public class MoodAnalyser {
    private String message;

    public String MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
