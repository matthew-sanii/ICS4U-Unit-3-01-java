import java.util.ArrayList;

public class MrCoxallStack {
    ArrayList<Integer> theStack = new ArrayList<Integer>();

    public void Push(final int newValue) {
        theStack.add(newValue);
    }

    public void ShowStack() {
        System.out.println(theStack);
    }

}