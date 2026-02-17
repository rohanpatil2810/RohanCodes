package com.company;
import java.util.*;
import java.util.Random ;


public class Main {

    public static void main(String[] args) {
        // 1 for a rock
        // 2 for a paper
           //     3 for a sissor

Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for Rock 2 for scissor and 3 for paper");
int userinput=sc.nextInt();
Random random=new Random();
int computerinput=random.nextInt( 3);
if(userinput==computerinput)
  System.out.println("match draw");

  else{ if(userinput==1 && computerinput==2 || userinput==3 && computerinput==2 || userinput==2 && computerinput==3){
    System.out.println("computer wins looser ");

}
else
      System.out.println("you are winner");

    }

        System.out.println("here is computer input"+computerinput);

    }
}
