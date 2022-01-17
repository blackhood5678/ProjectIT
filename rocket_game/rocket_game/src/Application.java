import nl.saxion.app.SaxionApp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        boolean exit=true;
        while (exit) {
            SaxionApp.printLine();
            SaxionApp.printLine();
            SaxionApp.printLine();

            SaxionApp.turnBorderOff();
            SaxionApp.drawText("Welcome to the Bezos simulator!!",10,20,28);
            SaxionApp.printLine("Please select the option you would like :)");
            SaxionApp.printLine("1. Start game");
            SaxionApp.printLine("2. Exit");
            int user_input=SaxionApp.readInt();
            switch (user_input) {
                case 1:
                    SaxionApp.clear();
                    //earth level 1
                    Earth_level();
                    Earth_exit();
                    //space
                    space();
                    //venus
                    venus_Welcome();
                    venus_level();
                    venus_exit();
                    //space
                    space_1();
                    //mercury
                    mercury_Welcome();
                    mercury_level();
                    mercury_exit();
                    //space
                    space_2();
                    //mars
                    Mars_Welcome();
                    Mars_level();
                    mars_exit();
                    //space
                    space_3();
                    //jupiter
                    jupiter_Welcome();
                    jupiter_level();
                    jupiter_exit();
                    //space
                    space_4();
                    //saturn
                    saturn_Welcome();
                    saturn_level();
                    saturn_exit();
                    //space
                    space_5();
                    //uranus
                    enter_uranus();
                    uranus_level();
                    exit_uranus();
                    //space
                    space_5();
                    //neptune
                    neptune_Welcome();
                    neptune_level();
                    neptune_exit();
                    space_5();

                case 2:
                    exit=false;
                    break;
                default:
                    SaxionApp.printLine("Please choose one of the options above !!");
                    SaxionApp.pause();
                    SaxionApp.clear();
            }
        }
    }
    //space
    public static void space(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-1.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void space_2(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-3.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void space_3(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-4.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void space_4(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-5.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void space_5(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    //earth
    public static void Earth_level(){
     for (int i=0;i<=100;i++){
         SaxionApp.drawImage("rocket_game\\levelss\\Earth.png",0,0,500,500);
         SaxionApp.drawImage("rocket_game\\levelss\\rocket-1.png",150,200,300,300);
         SaxionApp.printLine(i+"/100", Color.RED);
         SaxionApp.pause();
         SaxionApp.clear();
     }
     for (int up=0;up<400;){

         SaxionApp.drawImage("rocket_game\\levelss\\Earth.png",0,0,500,500);
         SaxionApp.drawImage("rocket_game\\levelss\\rocket-1.png",150,200-up,300,300);
             SaxionApp.sleep(0.1);
             up+=5;

     }
     SaxionApp.clear();
    }
    public static void Earth_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to Venus!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //mars
    public static void Mars_Welcome(){
        SaxionApp.drawText("Welcome to Mars!!",200,0,20);



    }
    public static void Mars_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\mars.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-4.png",150,200,300,300);
            SaxionApp.printLine(i+"/10000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\mars.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-4.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void mars_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to Jupiter!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }


    //jupiter
    public static void jupiter_Welcome(){
        SaxionApp.drawText("Welcome to Jupiter!!",200,0,20);


    }
    public static void jupiter_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\jupiter.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-5.png",150,200,300,300);
            SaxionApp.printLine(i+"/20000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\jupiter.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-5.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void jupiter_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to Saturn!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //neptune
    public static void neptune_Welcome(){
        SaxionApp.drawText("Welcome to neptune!!",200,0,20);




    }
    public static void neptune_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\neptune.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200,300,300);
            SaxionApp.printLine(i+"/500000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\neptune.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void neptune_exit(){
        SaxionApp.drawText("GAME COMPLETED!!",200,150,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //saturn
    public static void saturn_Welcome(){
        SaxionApp.drawText("Welcome to saturn!!",200,0,20);




    }
    public static void saturn_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\venus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200,300,300);
            SaxionApp.printLine(i+"/50000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\venus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void saturn_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to Uranus!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //uranus
    public static void enter_uranus(){
        SaxionApp.drawText("Welcome to Uranus!!",200,0,20);

    }
    public static void uranus_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\ur-anus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200,300,300);
            SaxionApp.printLine(i+"/200000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ur-anus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-6.png",150,200-up,300,300);

            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void exit_uranus(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to Neptune!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //venus
    public static void venus_Welcome(){
        SaxionApp.drawText("Welcome to venus!!",200,0,20);




    }
    public static void venus_level(){
        for (int i=0;i<=200;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\venus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-2.png",150,200,300,300);
            SaxionApp.printLine(i+"/20000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\venus.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-2.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void venus_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to mercury!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    public static void space_1(){
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\ruimte.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-2.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    //mercury
    public static void mercury_Welcome(){
        SaxionApp.drawText("Welcome to mercury!!",200,0,20);





    }
    public static void mercury_level(){
        for (int i=0;i<=5000;i++){
            SaxionApp.drawImage("rocket_game\\levelss\\mercury.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-3.png",150,200,300,300);
            SaxionApp.printLine(i+"/5000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            SaxionApp.drawImage("rocket_game\\levelss\\mercury.png",0,0,500,500);
            SaxionApp.drawImage("rocket_game\\levelss\\rocket-3.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void mercury_exit(){
        SaxionApp.drawText("Now heading to Mars!!",200,150,20);
        SaxionApp.drawText("",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }

}