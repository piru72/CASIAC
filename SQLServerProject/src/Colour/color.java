/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colour;

/**
 *
 * @author taral
 */
public class color {
public int r1,r2,r3,r4,g1,g2,g3,g4,b1,b2,b3,b4;
    public static void main(String args[]) {

        color object = new color();
       object.hexToRGB();

    }

    public void hexToRGB() {
        String hexColor1 = "#4FA4F4";
        String hexColor2 = "#C8E3F6";
        String hexColor3 = "#F0F5FB";
        String hexColor4 = "#FAFAFA";
        
        // PRIMARY DARK BLUE ==  [79,164,250]
        // SECONDARY LIGHT BLUE = [200,227,246]
        // PURPLE = [15,245,251]
        // COMPLIMENTARY  = [250,250,250]

         r1 = Integer.valueOf(hexColor1.substring(1, 3), 16);
         g1 = Integer.valueOf(hexColor1.substring(3, 5), 16);
        b1 = Integer.valueOf(hexColor1.substring(5, 7), 16);
//System.out.println(r1+" "+g1+" "+b1);
         r2 = Integer.valueOf(hexColor2.substring(1, 3), 16);
         g2 = Integer.valueOf(hexColor2.substring(3, 5), 16);
         b2 = Integer.valueOf(hexColor2.substring(5, 7), 16);

         r3 = Integer.valueOf(hexColor3.substring(1, 3), 16);
         g3 = Integer.valueOf(hexColor3.substring(3, 5), 16);
         b3 = Integer.valueOf(hexColor3.substring(5, 7), 16);

         r4 = Integer.valueOf(hexColor4.substring(1, 3), 16);
         g4 = Integer.valueOf(hexColor4.substring(3, 5), 16);
         b4 = Integer.valueOf(hexColor4.substring(5, 7), 16);

    }
}
