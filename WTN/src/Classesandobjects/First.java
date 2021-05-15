package Classesandobjects;

public class First {
	double h,w,d;

    First(double wid,double heg,double dep)
   {
       h=heg;
       w=wid;
       d=dep;
   }
   double volume()
   { 
	   double vol;
       vol=h*w*d;
       return vol;
   }
  
   public static void main(String[] args) {
      
   First bc = new First(8.5,80.3,9.6);
   System.out.println(bc.volume());

   }

}
