package carddriver;

import java.util.Random;
public class Card {
    
    public String[][] randomizeArray(){
        Random rnd = new Random();
        String[][] matrix = new String[4][4];
        for(int i=0; i<4; i++){           
            for(int j=0; j<4; j++){
                int r = rnd.nextInt(13);
                r++;
                String num;
                
                switch(r){
                    case(1):
                        num = "Ace";
                        break;
                    case(11):
                        num = "J";
                        break;
                    case(12):
                        num = "Queen";
                        break;
                    case(13):
                        num = "King";
                        break;
                    default:
                        num = ""+r;
                        break;
                }
                
                int f = rnd.nextInt(3);               
                switch(f){
                    case(0):
                        matrix[i][j]=num+" of Diamonds";
                        break;
                    case(1):
                        matrix[i][j]=num+" of Hearts";
                        break;
                    case(2):
                        matrix[i][j]=num+" of Clubs";
                        break;
                    case(3):
                        matrix[i][j]=num+" of Spades";
                        break;
                }              
            }                       
        }
        return matrix;
    }
    
    public String[][] TransposeArray(String[][] newest){
        String[][] newmatrix = new String[4][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                newmatrix[j][i] = newest[i][j];
            }            
        }
        return newmatrix;
    } 
    
    
    
    
}
