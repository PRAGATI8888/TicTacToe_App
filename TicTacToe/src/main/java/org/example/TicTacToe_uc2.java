package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class TicTacToe_uc2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args){
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols(){
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0){
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult(){
        if(isHumanTurn){
            System.out.println("Human won the toss");
        } else {
            System.out.println("Computer won the toss");
        }

        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }
}