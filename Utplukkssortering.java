public class Utplukkssortering implements SorteringsAlgoritme {

  public void sorter(int[] tall){
    //skrivTall(tall);
    int i,j,k,bytt;

    for(i=0; i<tall.length-1; i++){
      //skrivTall(tall);
      k=i;
      for(j=i+1; j<tall.length; j++){
        //System.out.println("sammenligner " + tall[k] + " med " + tall[j]);
        if(tall[j] < tall[k]){
          k=j;
        }
      }
      if(i != k){
        //System.out.println("Bytta " + tall[i] + " med " + tall[k]);
        bytt = tall[k];
        tall[k] = tall[i];
        tall[i] = bytt;
      }
      else {
        //System.out.println("Fant ikke noe mindre elemnet enn " + tall[i]);
      }
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
    return "Utplukkssortering";
  }
}
