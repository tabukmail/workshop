class Main {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    System.out.println(" -- ");

    ///////////////// ==================////////////////////
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Execution time in miliseconds: " + timeElapsed / 1000000);
    ///////////////// ==================////////////////////

  }

}