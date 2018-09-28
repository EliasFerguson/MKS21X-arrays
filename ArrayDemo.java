public class ArrayDemo {
  public static void main (String[]args){
    printArray(new int[10]);
    printArray(new int [3][10]);
  }
  public static void printArray(int[]ary) {
    System.out.print("[");
    for (int idx = 0; idx < ary.length; idx++) {
      if (idx == ary.length - 1) {
        System.out.print(ary[idx]);
      }
      else {
        System.out.print(ary[idx] + ", ");
      }
    }
    System.out.print("]");
  }

  public static void printArray(int[][]ary) {
    System.out.print("[");
    for (int idx = 0; idx < ary.length; idx++) {
      for (int idx2 = 0; idx2 < ary[idx].length; idx2++) {
        if (idx2 == 0) {
          System.out.print("[" + ary[idx][idx2] + ", ");
        }
        else if (idx2 == ary[idx].length - 1) {
          System.out.print(ary[idx][idx2] + "]");
        }
        else {
          System.out.print(ary[idx][idx2] + ", ");
        }
      }
      if (idx == ary.length - 1) {
        System.out.print("]");
      }
      else {
        System.out.print(", ");
      }
    }
  }
}
