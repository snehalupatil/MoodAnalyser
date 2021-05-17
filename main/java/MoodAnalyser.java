import Exception.ExceptionTypeClass;
import Exception.MoodAnalyserException;

public enum ExceptionTypeClass{
    NULLEXCEPTION("Mood cannot be null");
    EMPTYEXCEPTION("Mood cannot be empty");

    private String notice;

    ExceptionTypeClass(String notice){
        this.notice = notice;
    }
    public String getNotice(){
        return this.notice;
    }
}


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
