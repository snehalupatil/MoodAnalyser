public class MoodAnalyser {
    private String message;

    public String MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";

        }catch (NullPointerException e){
	        return "HAPPY";
        }
    }
}
