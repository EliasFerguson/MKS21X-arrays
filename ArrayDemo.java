public class ArrayDemo {
  public static void main (String[]args){
    printArray(new int[10]);
    printArray(new int [3][10]);
    System.out.println(countZeros2D(new int [5][5]));
    printArray(fill2D(new int [5][5]));
    printArray(fill2DCopy(new int [5][5]));
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
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int idx = 0; idx < nums.length; idx++) {
      for(int idx2 = 0; idx2 < nums[idx].length; idx2++) {
        if (nums[idx][idx2] == 0) {
          count += 1;
        }
      }
    }
    return count;
  }
  public static int[][] fill2D(int[][] vals){
    for (int idx = 0; idx < vals.length; idx++) {
      for(int idx2 = 0; idx2 < vals[idx].length; idx2++) {
        if (idx2 == idx) {
          vals[idx][idx2] = 3;
        }
        else {
          vals[idx][idx2] = 1;
        }
      }
    }
    return vals;
  }
  public static int[][] fill2DCopy(int[][] vals){
    int[][] output = new int[vals.length][];
    for (int idx = 0; idx < vals.length; idx++) {
      output[idx] = new int[vals[idx].length];
      for (int idx2 = 0; idx2 < vals[idx].length; idx2++) {
        if (vals[idx][idx2] < 0) {
          output[idx][idx2] = 3;
        }
        else {
          output[idx][idx2] = 1;
        }
      }
    }
    return output;
  }
}
