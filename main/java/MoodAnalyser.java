import Exception.ExceptionTypeClass;
import Exception.MoodAnalyserException;

public class MoodAnalyser {
    private String message;

    public String MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else if (message.contains(""))
                throw new MoodAnalyserException(ExceptionTypeClass.EMPTYEXCEPTION);
            else
                return "HAPPY";

        }catch (NullPointerException e){
	        throw new MoodAnalyserException(ExceptionTypeClass.NULLEXCEPTION);
        }
    }
}
