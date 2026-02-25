package com.basics.loopingStatement;

public class ContinueStatement {
    static void main() {
        // continue statement skips the current value
        for(int i=1; i<5; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
