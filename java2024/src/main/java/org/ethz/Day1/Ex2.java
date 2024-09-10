package org.ethz.Day1;

public class Ex2 {

    public static void main(String[] args) {
        

        
        byte i=0; 
        while (i < 0) {
            byte a = (i++);
            byte b = (--a);
            System . out . println (a + " " + b + " " + i);
        }
        //This does not work, since i=0 is already smaller than 0

     
        i=0; //hier nicht mehr byte, da wir oben schon definiert haben 
        do {
            byte a = (i++);
            byte b = (--a);
            System . out . println (a + " " + b + " " + i);
        } while (i < 0);
        

        

    }
}
