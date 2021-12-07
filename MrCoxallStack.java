import java.util.ArrayList;

public class MrCoxallStack {
  private ArrayList<Integer> theStack = new ArrayList<Integer>();

  public void push(final int pushValue) {
    System.out.println("adding " + pushValue + " to stack.");
    theStack.add(pushValue);
  }

  public void showStack() {
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }
}