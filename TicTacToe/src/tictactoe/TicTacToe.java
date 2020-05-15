/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mo3az
 */
public class TicTacToe {
    
    //Global var
    static ArrayList<Integer> playerPos = new ArrayList<>();
    static ArrayList<Integer> cpuPos = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //defining the game board
        char[][] board = {{' ', '|', ' ', '|',' '},
                          {'-', '+', '-', '+','-'},
                          {' ', '|', ' ', '|',' '},
                          {'-', '+', '-', '+','-'},
                          {' ', '|', ' ', '|',' '}};
        
        
        
        //player
        Scanner sc = new Scanner (System.in);
        System.out.print("choose X / O : ");
        char pci = sc.nextLine().charAt(0);
        char npci = (pci == 'X') ? 'O' : 'X';
        
        //cpu
        char symb;
        Random rand = new Random();
        //turn
        int T = rand.nextInt(2) + 1;
        
        //declaring the position var and turnCounter
        int p;

        //the turns
        while(true){
            
            if (T == 1){
                System.out.print("Enter a # from 1 - 9 : ");
                p = sc.nextInt();
                symb = pci;
                playerPos.add(p);
                T = 2;
            }else{
                symb = npci;
                p = rand.nextInt(9) + 1;
                cpuPos.add(p);
                T = 1;
            }

            //taking the user input
            drawPiece(board, p, symb);
            //printing the board
            printGameBoard(board);

            
            checkState();
        }
        
    }
    
    public static void printGameBoard(char[][] board){
        for(char[] row : board){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
    public static void drawPiece(char[][] board, int p, char symbol){

        switch(p){
            case 1:
                if(board[0][0] == 'X' || board[0][0] == 'Y'){
                    System.out.println("INVALID!");
                }else{
                    board[0][0] = symbol;
                }
                break;
            case 2:
                if(board[0][2] == 'X' || board[0][2] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[0][2] = symbol;
                }
                break;
            case 3:
                if(board[0][4] == 'X' || board[0][4] == 'Y'){
                    System.out.println("INVALID!");
                }else{
                    board[0][4] = symbol;
                }
                break;
            case 4:
                if(board[2][0] == 'X' || board[2][0] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[2][0] = symbol;
                }
                break;
            case 5:
                if(board[2][2] == 'X' || board[2][2] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[2][2] = symbol;
                }
                break;
            case 6:
                if(board[2][4] == 'X' || board[2][4] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[2][4] = symbol;
                }
                break;
            case 7:
                if(board[4][0] == 'X' || board[4][0] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[4][0] = symbol;
                }
                break;
            case 8:
                if(board[4][2] == 'X' || board[4][2] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[4][2] = symbol;
                }
                break;
            case 9:
                if(board[4][4] == 'X' || board[4][4] == 'O'){
                    System.out.println("INVALID!");
                }else{
                    board[4][4] = symbol;
                }
                break;
            default:
                break; 
        }
    }
    
    public static String checkState(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List LCol = Arrays.asList(1,4,7);
        List MCol = Arrays.asList(2,5,8);
        List RCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);
        
        List<List> win = new ArrayList<List>();
        win.add(topRow);
        win.add(midRow);
        win.add(botRow);
        win.add(LCol);
        win.add(MCol);
        win.add(RCol);
        win.add(cross1);
        win.add(cross2);
        
        for(List l : win){
            if (playerPos.containsAll(l)){
                System.out.println("YOU WON !");
            }else if (cpuPos.containsAll(l)){
                System.out.println("Sorry try again I WON :P");
            }else if (playerPos.size() + cpuPos.size() == 9){
                System.out.println("waste of time .. -_-");
            }
        }
        
        return "";
    }
    
}
