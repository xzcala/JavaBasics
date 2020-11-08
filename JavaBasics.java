/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Jon
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Calendar date = Calendar.getInstance(); //to get current time
        String format = new SimpleDateFormat("MM/dd/yyyy HH:mm").format(Calendar.getInstance().getTime()); //format for printing later
        
        /*required variables*/
        char c1 = 'A';
        char c2 = 65;
        short qualityScore = 70;
        float gravitation = (float)9.8;
        float weight = (float)50;
        boolean sunny = true;
        boolean warm = false;
        int hour=date.get(Calendar.HOUR_OF_DAY); //HOUR_OF_DAY is used to get 24h format
        int minute=date.get(Calendar.MINUTE);
        String greeting="Bonjour";
        String myPawPrint="jcbrzf";
        
        if(c1==c2)
            System.out.println(c1+" and "+c2+" are the same.");
        else
            System.out.println(c1+" and "+c2+" are NOT the same.");
        
        if(qualityScore>=00 && qualityScore<= 60)
            System.out.println("The quality is bad.");
        else
            System.out.println("Good quality.");
        
        float force = weight * gravitation;
        System.out.printf("Force =%.3f\n", force);
        
        if(sunny==true && warm==true)
            System.out.println("Go hiking.");
        else if(sunny==false && warm==true)
            System.out.println("Go barbeque.");
        else
            System.out.println("Stay home.");
        
        switch(hour){
            case 1:
            case 2:
            case 3:     System.out.printf("The current time is %d:%d\n",hour,minute);
                        break;
            case 4:     System.out.printf("The current time is %d:%d and it is the morning.\n",hour,minute);
                        break;
            case 5:     
            case 6:
            case 7:
            case 8:
            case 9:     
            case 10:    System.out.printf("The current time is %d:%d in the MORNING.\n",hour,minute);
                        break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:    System.out.printf("The current time is %d:%d in the AFTERNOON.\n",hour,minute);
                        break;
            case 17:
            case 21:
            case 18:
            case 19:
            case 20:
            case 22:    System.out.printf("The current time is %d:%d in the EVENING.\n",hour,minute);
                        break;
            case 23:
            case 24:    System.out.printf("The current time is %d:%d in the EVENING.\n",hour,minute);
                        break;
            
            /*for everything else*/
            default:    System.out.printf("You have the wrong time.");
                        break;
        }

        int count;
        for(count=2;count<7;count++){
            if(count%3==0)
                System.out.println("i="+count);
        }
        
        int countDown= 5;
        while(countDown>0){
            System.out.println("Count Down: "+countDown);
            countDown--;
            if(countDown==0)
                System.out.println("Houston, we have a lift off!");
        }
        
        invokeMe(greeting,myPawPrint,format);
    }
    
    public static void invokeMe(String greeting, String pawPrint, String date){
        System.out.println(greeting + ", my pawprint is \"" + pawPrint + "\" and today's date is "+date);
    }     
}
