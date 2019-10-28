public class HeapSortering implements SorteringsAlgoritme {

  public void sorter(int[] tall){
    //skrivTall(tall);
    if(tall.length<2){
      return;
    }
    int i,bytt;

    for(i=tall.length/2; i>=0; i--){
      heapify(tall, i, tall.length);
    }
    //System.out.println("\nFerdig med forste for-lokke");
    for(i=tall.length-1; i>=0; i--){
      //System.out.println();
      //skrivTall(tall);
      //System.out.println("Bytter " + tall[0] + " med " + tall[i]);
      bytt = tall[0];
      tall[0] = tall[i];
      tall[i] = bytt;
      //skrivTall(tall);
      heapify(tall, 0, i);
    }
    //skrivTall(tall);
  }

  private void heapify(int[] tall, int i, int n){
    //System.out.println("\nGjenoppretter heap-egenskaper - HEAP START");
    //skrivTall(tall);
    int rot = i;
    int venstre = i*2;
    int hoyre = i*2+1;
    int bytt;
    //System.out.println("Rot: " + rot + "\nV: " + venstre + "\nH: " + hoyre);

    if(venstre < n && tall[venstre] > tall[rot]){
      //System.out.println("tall[V] er storre en tall[ROT] " + tall[venstre] + " " + tall[rot]);
      rot = venstre;
    }
    if(hoyre < n && tall[hoyre] > tall[rot]){
      //System.out.println("tall[H] er storre enn tall[ROT] " + tall[hoyre] + " " + tall[rot]);
      rot = hoyre;
    }
    if(rot != i){
      bytt = tall[i];
      tall[i] = tall[rot];
      tall[rot] = bytt;
      heapify(tall, rot, n);
    }
    //skrivTall(tall);
    //System.out.println("HEAP END");
  }

  private void skrivTall(int[] tall){
    int i;
    for(i=0; i<tall.length; i ++){
      System.out.print(tall[i] + " ");
    }
    System.out.println();
  }

  public String getName(){
    return "Heap-sortering";
  }
}
