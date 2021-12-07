class Stack {
  public static void main(final String[] args) {
    final int min = 1;
    final int max = 10;
    int times = max;
    // use MrCoxallStack class
    MrCoxallStack newStack = new MrCoxallStack();
    while (times >= 0) {
      final int randomizer = (int) Math.floor(Math.random() * (max - min + 1)
      + min);
      newStack.push(randomizer);
      newStack.showStack();
      times -= 1;
    }
    newStack.showStack();
  }
}