package com.basics.loopingStatement;

public class BreakStatement {
    static void main() {
        // break statement ends the loop & goes out of the loop
        for(int i=1; i<5; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
