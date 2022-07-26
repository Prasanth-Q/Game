import java.util.*;
class GuessTheNum{
    int randomnumber;
    GuessTheNum(){
        System.out.println("Welcome to Guess Game");
        Random random=new Random();
        randomnumber = random.nextInt(101);
    }
    public int userinputnum(){
        Scanner userinput=new Scanner(System.in);
        int Userinput=userinput.nextInt();
        return Userinput;
    }
    public void game(){
        int m = 102;
        int temp=0;
        while(randomnumber != m){
            System.out.println("Please enter the number");
            m = userinputnum();
            if(m > 100){
                System.out.println("Please enter the number between 1 to 100 only");           
            }else if (randomnumber > m){
                System.out.println("You guessed number is lesser than computer given number ");           
            }else if (randomnumber < m){
                System.out.println("You guessed number is greater than computer given number ");           
            }else System.out.println("You won. You are score is " );     
            temp++;
        }System.out.println(temp);
    }   
}
class StonePaperScissors{   
    static int randomnumber;   
 StonePaperScissors(){
     Random random=new Random();
     randomnumber=random.nextInt(3);
 }
 static int userinputnum(){
     System.out.println("Please enter the number \n 0)Stone \n 1)Paper \n 2)Syser");
     Scanner userinput=new Scanner(System.in);
     int Userinput=userinput.nextInt();
     return Userinput;        
 }
 static void game(){
     int n = userinputnum();
     int m = randomnumber;   
     if (n > 2 ){    
         System.out.println("Please enter the given number only");
     }else if((m ==0 && n==1)||(m==1 && n==2)||(m==2 && n==0)) {
         System.out.println("Iam choosed "+m);
         System.out.println("You won");
     }else if((m ==0 && n==2)||(m==1 && n==0)||(m==2 && n==1)){
         System.out.println("Iam choosed "+m);    
         System.out.println("Iam won");
     }else if((m ==0 && n==0)||(m==1 && n==1)||(m==2 && n==2)){
         System.out.println("Iam choosed "+m);    
         System.out.println("match is Draw");
     }
 }
}
class xogame{
    String A[]=new String[9];
    String player1="x";
    String player2="o";
    public boolean win(){
        if((player1==A[0] && A[3]==player1 && A[6]==player1) || (A[0]==player1 && A[1]==player1 && A[2]==player1) || (A[0]==player1 && A[4]==player1 && A[8]==player1) || (A[6]==player1 && A[7]==player1 && A[8]==player1) || (A[6]==player1 && A[4]==player1 && A[2]==player1) || (A[8]==player1 && A[5]==player1 && A[2]==player1) || (A[1]==player1 && A[4]==player1 && A[7]==player1) || (A[3]==player1 && A[4]==player1 && A[5]==player1)){
            System.out.println("Player 1 Wins");
            return true;
        }else if((player2==A[0] && A[3]==player2 && A[6]==player2) || (A[0]==player2 && A[1]==player2 && A[2]==player2) || (A[0]==player2 && A[4]==player2 && A[8]==player2) || (A[6]==player2 && A[7]==player2 && A[8]==player2) || (A[6]==player2 && A[4]==player2 && A[2]==player2) || (A[8]==player2 && A[5]==player2 && A[2]==player2) || (A[1]==player2 && A[4]==player2 && A[7]==player2) || (A[3]==player2 && A[4]==player2 && A[5]==player2)){
            System.out.println("Player 2 Wins");
            return true;
        }else {return false;}
        
    }
    public void table(){
        for(int i=0; i < 9 ; i++){
            if(A[i]==null){
                A[i]=" ";
                if(i == 8){
                    System.out.println("_"+A[0]+"_|_"+A[1]+"_|_"+A[2]+"_"); 
                    System.out.println("_"+A[3]+"_|_"+A[4]+"_|_"+A[5]+"_"); 
                    System.out.println(" "+A[6]+" | "+A[7]+" | "+A[8]+" ");        
                }else{continue;}
                
            }else {
                if(i == 8){
                    System.out.println("_"+A[0]+"_|_"+A[1]+"_|_"+A[2]+"_"); 
                    System.out.println("_"+A[3]+"_|_"+A[4]+"_|_"+A[5]+"_"); 
                    System.out.println(" "+A[6]+" | "+A[7]+" | "+A[8]+" ");        
                }else{continue;}
            }
        }
    }
    public void table1(){
        System.out.println("_0_|_1_|_2_"); 
        System.out.println("_3_|_4_|_5_"); 
        System.out.println(" 6 | 7 | 8");
    }
    public void xogame1(){
       Scanner input=new Scanner(System.in);
        table1();
       System.out.println(" \n * First player is X and second player is O ");
        for(int i=0;i < 8; i++){
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8){
                System.out.println("player 1 \n Please enter the numer that place you want to put X in the above table");
                int n=input.nextInt();  
                if(n < 9){
                    if(A[n]==null || A[n]==" "){
                        A[n]=player1;
                    }else{
                        System.out.println("You entered place is already fillede with X or O \n please enter again");
                        i = i-1;
                        table();
                        continue;
                    }
                    if(win()==true){
                        break;
                    }else if(win()==false){
                        if(i==8){
                            System.out.println("The match was DRAW");
                        }
                    }
                    table();                    
                }else {
                    System.out.println("Please enter the givn number in XO table");
                    i = i-1;
                    continue;
                }              
                    
            }else if(i == 1 || i == 3 || i == 5 || i == 7){
                System.out.println("player 2 \n Please enter the numer that place you want to put O in the above table");
                int n=input.nextInt();      
                if(n < 9){
                    if(A[n]==null || A[n]==" "){
                        A[n]=player2;
                    }else{
                        System.out.println("You entered place is already fillede with X or O \n please enter again");
                        i = i-1;
                        table();
                        continue;
                    }
                    if(win()==true){
                        break;
                    }                
                    table();
                }else{
                    System.out.println("Please enter the givn number in XO table");
                    i = i-1;
                    continue;                    
                }

            }
        }
    }
}
public class Game {
    public static void main(String args[]){
        //GuessTheNum game1=new GuessTheNum();
        //game1.game();   
        //StonePaperScissors game2=new StonePaperScissors();
        //game2.game();  
        xogame game3=new xogame();
        game3.xogame1();           
    }
}
