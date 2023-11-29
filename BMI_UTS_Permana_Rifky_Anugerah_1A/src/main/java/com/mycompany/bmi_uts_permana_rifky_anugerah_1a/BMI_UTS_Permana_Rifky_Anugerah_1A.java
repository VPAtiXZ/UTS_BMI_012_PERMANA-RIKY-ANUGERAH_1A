
package com.mycompany.bmi_uts_permana_rifky_anugerah_1a;

/**
 *
 * @author ASUS
 */
public class BMI_UTS_Permana_Rifky_Anugerah_1A {

    public static void main(String[] args) {
        int beratbadan = 75 ;
        float tinggibadan =1.75f;
        float bmi=(beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI ANDA ADALAH\t:"+bmi);
        
        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }
            else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL/IDEAL");
        }   else if (bmi<29.9){
            System.out.println("BERAT BADAN ANDA LEBIH");
        }   else  {
            System.out.println("OBESIITAS");
        }
            
        }
   }


