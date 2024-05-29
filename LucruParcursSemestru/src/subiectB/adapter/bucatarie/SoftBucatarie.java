package subiectB.adapter.bucatarie;

public abstract class SoftBucatarie {
     private double sumaDePlata;

     public SoftBucatarie(double sumaDePlata) {
          this.sumaDePlata = sumaDePlata;
     }

     public double getSumaDePlata() {
          return sumaDePlata;
     }

     public abstract void printeazaFactura();

}
