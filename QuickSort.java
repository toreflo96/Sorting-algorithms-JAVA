import java.util.Arrays;

public class QuickSort {
  int[] array;
  int arraySize;

  public QuickSort(int n){
    arraySize = n;
    array = new int[n];
    randomArray();
  }

  void sort(){
    quickSort(array, 0, arraySize-1);
  }

  public void quickSort(int[] array, int left, int right){
    int index = partition(array, left, right);
    if (left < index - 1){
      quickSort(array, left, index - 1);
    }
    if (index < right) {
      quickSort(array, index+1, right);
    }
  }

  public int partition(int[] array, int left, int right){
    int pivot = array[(left + right) / 2];

    while (left <= right) {
      while (array[left] < pivot) left++;
      while (array[right] > pivot) right--;
      if (left <= right) {
        swap(array, left, right);
        left++;
        right--;
      }
    }
    return left;
  }

  void swap(int[] array, int a, int b){
    int t = array[a];
    array[a] = array[b];
    array[b] = t;
  }

  void randomArray(){
    for(int i=0; i<arraySize; i++){
      array[i] = (int) (Math.random()*500)+10;
    }
  }

  void asort(){
    Arrays.sort(array);
  }

  void print(){
    for(int i=0; i<arraySize; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  void fsort(){
    fletteSort(array);
  }


  private void fletteSort(int[] tall){
    //skrivTall(tall);
    if(tall.length<2){
      return;
    }
    int n = tall.length;
    int[] venstre = Arrays.copyOfRange(tall, 0, (n+1)/2);
    int[] hoyre = Arrays.copyOfRange(tall, (n+1)/2, tall.length);

    fletteSort(venstre);
    fletteSort(hoyre);
    merge(venstre, hoyre, tall);
    //skrivTall(tall);
  }

  private void merge(int[] s1, int[] s2, int[] tall){
    /*
    System.out.print("\nS1: ");
    skrivTall(s1);
    System.out.print("S2: ");
    skrivTall(s2);
    System.out.print("Tall: ");
    skrivTall(tall);
    */
    int i=0;
    int j=0;
    int k=0;
    while(i<s1.length && j<s2.length){
      if(s1[i] <= s2[j]) {
        tall[k] = s1[i];
        i++;
      }
      else {
        tall[k] = s2[j];
        j++;
      }
      k++;
    }

    while(i<s1.length){
      tall[k] = s1[i];
      i++;
      k++;
    }
    while(j<s2.length){
      tall[k] = s2[j];
      j++;
      k++;
    }
    //skrivTall(tall);
    //System.out.println("MERGE END\n");
  }

  public static void main(String[] args) {
    QuickSort qs = new QuickSort(5000000);
    long t = 0;
    double tid = 0;
    t = System.nanoTime();
    qs.fsort();
    tid = (System.nanoTime() - t) / 1000000;
    System.out.println(tid);
  }
}
