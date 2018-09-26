public class ArrayDemo {
  public static void main (String[]args){
    printArray(new int[10]);
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
  
}
