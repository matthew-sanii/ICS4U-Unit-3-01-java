import java.util.ArrayList;

public final class MrCoxallStack {
  /**
  * The arrayList creator called theStack.
  */
  private ArrayList<Integer> theStack = new ArrayList<Integer>();

  /**
  * the push method.
  *
  * @param pushValue the value that is being added to the stack.
  */
  public void push(final int pushValue) {
    System.out.println("adding " + pushValue + " to stack.");
    theStack.add(pushValue);
  }

  /**
  * The showStack method.
  */
  public void showStack() {
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }
}
