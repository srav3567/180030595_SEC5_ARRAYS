package Classesandobjects;

public class First {
	double h,w,d;

    First(double width,double height,double depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   double volume()
   { 
	   double v;
       v=h*w*d;
       return v;
   }
  
   public static void main(String[] args) {
      
   First bc = new First(8.5,80.3,9.6);
   System.out.println(bc.volume());

   }

}
