package farmer;
import java.util.ArrayList;
import java.util.List;

public class Value{
    private List<String> startSide;
    private List<String> finalSide;

    public Value(List<String> startSide, List<String> finalSide) {
        this.startSide = startSide;
        this.finalSide = finalSide;
    }

    public List<String> getStartSide() {
        return startSide;
    }

    public void setStartSide(List<String> startSide) {
        this.startSide = startSide;
    }

    public List<String> getFinalSide() {
        return finalSide;
    }

    public void setFinalSide(List<String> finalSide) {
        this.finalSide = finalSide;
    }
    
}