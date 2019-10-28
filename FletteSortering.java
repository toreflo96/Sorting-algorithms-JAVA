public class FletteSortering implements SorteringsAlgoritme {

  public void sorter(int[] tall){
    //skrivTall(tall);
    if(tall.length<2){
      return;
    }
    fletteSort(tall, tall.length);
  }

  private void fletteSort(int[] tall, int n){
    //skrivTall(tall);
    if(n<2){
      return;
    }
    int[] venstre = new int[(n+1)/2];
    int[] hoyre = new int[n-venstre.length];

    for(int i=0; i<n; i++){
      if(i<venstre.length){
        venstre[i] = tall[i];
      }
      else {
        hoyre[i-venstre.length] = tall[i];
      }
    }
    fletteSort(venstre, venstre.length);
    fletteSort(hoyre, hoyre.length);
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




  private void skrivTall(int[] tall){
    int i;
    for(i=0; i<tall.length; i++){
      System.out.print(tall[i] + " ");
    }
    System.out.println();
  }

  public String getName(){
    return "Flettesortering";
  }
}
