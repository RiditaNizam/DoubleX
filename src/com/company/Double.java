package com.company;

/**
 * Created by ridita on 3/27/19.
 */
public class Double {
    boolean doubleX(String str) {

        if (str.indexOf('x') + 1 >= str.length()) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt((str.indexOf('x')) + 1) == 'x') {
                return true;
            }
        }

        return false;
        
    }
}
