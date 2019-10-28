public class Innstikksortering implements SorteringsAlgoritme {

  public void sorter(int[] tall){
    //skrivTall(tall);
    int i,j,k;
    for(i=1; i<tall.length; i++){
      //skrivTall(tall);
      j = tall[i];
      k=i-1;
      //System.out.println();
      while(k>=0 && j<=tall[k]){
        //System.out.println("Bytter " + tall[k] + " med " + tall[k+1]);
        //skrivTall(tall);
        tall[k+1] = tall[k];
        k--;
      }
      tall[k+1] = j;
    }
    //skrivTall(tall);
  }

  private void skrivTall(int[] tall){
    int i;
    for(i=0; i<tall.length; i++){
      System.out.print(tall[i] + " ");
    }
    System.out.println();
  }

  public String getName(){
    return "Innstikksortering";
  }
}
