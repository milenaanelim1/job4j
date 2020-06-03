package job4j.array;

public class Turn {
  public int[] back(int[]array) {
      for(int i = 0; i != (array.length)/2; i++){
          int theme = array[i];
          array[i]=array[array.length-1-i];
          array[array.length-1-i]=theme;
      }
      return array;
  }
}
