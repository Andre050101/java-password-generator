package org.lessons.java.security.utils;

public class DateUtils {
    public static boolean isBisestile(int anno){
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
    public static int giorniNelMese(int mese, int anno){
        switch(mese){
            case 2://Mese di febbraio
                return (isBisestile(anno)) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default :
                return 31;
        }
    }
}
