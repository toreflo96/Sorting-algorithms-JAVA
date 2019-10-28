import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

      Innstikksortering is = new Innstikksortering();
      //is.sorter(lagTilfeldig(10));
      //is.sorter(lagStigende(10));
      //is.sorter(lagSynkende(10));
      Utplukkssortering us = new Utplukkssortering();
      //us.sorter(lagTilfeldigUnik(10));
      //us.sorter(lagStigende(10));
      //us.sorter(lagSynkende(10));
      HeapSortering hs = new HeapSortering();
      //hs.sorter(lagTilfeldig(10));
      //hs.sorter(lagStigende(10));
      //hs.sorter(lagSynkende(10));
      FletteSortering fs = new FletteSortering();
      //fs.sorter(lagTilfeldig(10));
      //fs.sorter(lagStigende(10));
      //fs.sorter(lagSynkende(10));

      //skrivHastigheter(is,us,hs,fs);

  }

  private static void skrivHastigheter(Innstikksortering is, Utplukkssortering us, HeapSortering hs, FletteSortering fs){
    File file;
    FileWriter writer;

    try {
      file = new File("Hastigheter");
      file.createNewFile();
      writer = new FileWriter(file);

      int[] org, kopi1, kopi2, kopi3, kopi4, kopi5;
      int i;
      int start = 10000;
      int slutt = 1010000;
      int okning = 1000000;



      System.out.println("tilfeldige unike");
      writer.write("TILFELDIGE_UNIK\n");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagTilfeldigUnik(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      System.out.println("tilfeldig ikke unike");
      writer.write("\n\nTILFELDIGE IKKE UNIKE");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagTilfeldig(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      System.out.println("stigende unike");
      writer.write("\n\nSTIGENDE UNIKE");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagStigende(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      System.out.println("stigende ikke unike");
      writer.write("\n\nSTIGENDE IKKE UNIKE");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagStigendeIkkeUnik(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      System.out.println("synkende unike");
      writer.write("\n\nSYNKENDE UNIKE");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagSynkende(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      System.out.println("synkende ikke unike");
      writer.write("\n\nSYNKENDE IKKE UNIKE");
      for(i=start; i<=slutt; i=i+okning){
        writer.write("\nI: " + i + "\n");
        System.out.println(i);
        org = lagSynkendeIkkeUnik(i);
        kopi1 = new int[org.length];
        kopier(kopi1, org);
        System.out.println("IS");
        hastighet(kopi1, is, writer);

        kopi2 = new int[org.length];
        kopier(kopi2, org);
        System.out.println("US");
        hastighet(kopi2, us, writer);

        kopi3 = new int[org.length];
        kopier(kopi3, org);
        System.out.println("HS");
        hastighet(kopi3, hs, writer);

        kopi4 = new int[org.length];
        kopier(kopi4, org);
        System.out.println("FS");
        hastighet(kopi4, fs, writer);

        kopi5 = new int[org.length];
        kopier(kopi5, org);
        System.out.println("Array");
        hastighetArrays(kopi5, writer);
      }

      writer.flush();
      writer.close();
    }

    catch(IOException ioe){
      System.out.println("IOException");
      return;
    }
  }

  private static void hastighet(int[] tall, SorteringsAlgoritme sa, FileWriter fw){
    long t = 0;
    double tid = 0;
    t = System.nanoTime();
    sa.sorter(tall);
    tid = (System.nanoTime() - t) / 1000000;
    try {
      //fw.write("Tid " + sa.getName() + " " + tid + "\n");
      fw.write(tid + "     " + sa.getName() + "\n");
    }
    catch(IOException ioe){
      System.out.println("IOE");
      return;
    }
  }

  private static void hastighetArrays(int[] tall, FileWriter fw){
    long t = 0;
    double tid = 0;
    t = System.nanoTime();
    Arrays.sort(tall);
    tid = (System.nanoTime() - t) / 1000000;
    try {
      //fw.write("Tid ArraySort: " + tid + "\n");
      fw.write(tid + "    " + " Arrays.sort\n");
    }
    catch(IOException ioe){
      return;
    }
  }

  private static void kopier(int[] til, int[] fra){
    int i;
    for(i=0; i<fra.length; i++){
      til[i] = fra[i];
    }
  }

  private static int[] lagTilfeldig(int s){
    int[] tilfeldig = new int[s];
    int i;
    for(i=0; i<s; i++){
      tilfeldig[i] = (int)(Math.random()*s) + 0;
    }
    return tilfeldig;
  }

  private static int[] lagTilfeldigUnik(int s){
    int[] tilfeldig = new int[s];
    int i,j;
    for(i=0; i<s; i++){
      tilfeldig[i] = (int)(Math.random()*s)+0;
      for(j=0; j<i; j++){
        if(tilfeldig[i] == tilfeldig[j]){
          i--;
          break;
        }
      }
    }
    return tilfeldig;
  }

  private static int[] lagStigende(int s){
    int[] stigende = new int[s];
    int i;
    for(i=0; i<s; i++){
      stigende[i] = i;
    }
    return stigende;
  }

  private static int[] lagStigendeIkkeUnik(int s){
    int[] tall = lagTilfeldig(s);
    Arrays.sort(tall);
    return tall;
  }

  private static int[] lagSynkende(int s){
    int[] synkende = new int[s];
    int j=0;
    int i;
    for(i=s-1; i>0; i--){
      synkende[j++] = i;
    }
    return synkende;
  }

  private static int[] lagSynkendeIkkeUnik(int s){
    int[] tall = lagTilfeldig(s);
    Arrays.sort(tall);
    return tall;
  }
}
