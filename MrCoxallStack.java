import java.util.ArrayList;

public class MrCoxallStack {
  private ArrayList<Integer> theStack = new ArrayList<Integer>();
  // push takes the value given and adds to stack.
  public void push(final int pushValue) {
    System.out.println("adding " + pushValue + " to stack.");
    theStack.add(pushValue);
  }
  // showStack shows the created stack to user.
  public void showStack() {
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }
}
