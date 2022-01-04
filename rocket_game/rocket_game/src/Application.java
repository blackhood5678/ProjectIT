import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 612, 430);
    }

    public void run() {
        boolean exit=true;
        while (exit) {
            SaxionApp.printLine();
            SaxionApp.printLine();
            SaxionApp.printLine();

            SaxionApp.turnBorderOff();
            SaxionApp.drawText("Welcome to the Bezos simulator!!",10,20,28);
            SaxionApp.printLine("please select the option you would like :)");
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
                    space();
                    //mercury
                    mercury_Welcome();
                    mercury_level();
                    mercury_exit();
                    //space
                    space();
                    //mars
                    Mars_Welcome();
                    Mars_level();
                    mars_exit();
                    //space
                    space();
                    //jupiter
                    jupiter_Welcome();
                    jupiter_level();
                    jupiter_exit();
                    //space
                    space();
                    //saturn
                    saturn_Welcome();
                    saturn_level();
                    saturn_exit();
                    //space
                    space();
                    //uranus
                    enter_uranus();
                    uranus_level();
                    exit_uranus();
                    //space
                    space();
                    //neptune
                    neptune_Welcome();
                    neptune_level();
                    neptune_exit();

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
            SaxionApp.drawImage("C:\\Users\\omarz\\Desktop\\maybe everything\\saxion\\intro to programming\\ExampleTest\\rocket_game\\levelss\\earth.jpg",0,0,612,408);
            SaxionApp.drawImage("C:\\Users\\omarz\\Desktop\\maybe everything\\saxion\\intro to programming\\ExampleTest\\rocket_game\\levelss\\1st_pic.png",150,200-up,300,300);
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    //earth
    public static void Earth_level(){
     for (int i=0;i<=100;i++){
         SaxionApp.drawImage("levelss/earth.jpg",0,0,612,408);
         SaxionApp.drawImage("levelss/1st_pic.png",150,200,300,300);
         SaxionApp.printLine(i+"/100", Color.RED);
         SaxionApp.pause();
         SaxionApp.clear();
     }
     for (int up=0;up<400;){

         SaxionApp.drawImage("C:\\Users\\omarz\\Desktop\\maybe everything\\saxion\\intro to programming\\ExampleTest\\rocket_game\\levelss\\earth.jpg",0,0,612,408);
         SaxionApp.drawImage("C:\\Users\\omarz\\Desktop\\maybe everything\\saxion\\intro to programming\\ExampleTest\\rocket_game\\levelss\\1st_pic.png",150,200-up,300,300);
             SaxionApp.sleep(0.1);
             up+=5;

     }
     SaxionApp.clear();
    }
    public static void Earth_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to venus!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //mars
    public static void Mars_Welcome(){
        SaxionApp.drawText("Welcome to Mars!!",200,0,20);
        ArrayList<String> Mars_facts=new ArrayList<>();
        Mars_facts.add("Mars is named after the Roman god of war.");
        Mars_facts.add("There's water on mars");
        Mars_facts.add("Mars Has Two Moons");
        Mars_facts.add("We Have Pieces Of Mars On Earth");
        int random=SaxionApp.getRandomValueBetween(0,Mars_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+Mars_facts.get(random),200,30,20);
    }
    public static void Mars_level(){
        for (int i=0;i<=1000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/1000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void mars_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to jupiter!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //jupiter
    public static void jupiter_Welcome(){
        SaxionApp.drawText("Welcome to jupiter!!",200,0,20);
        ArrayList<String> jupiter_facts=new ArrayList<>();
        jupiter_facts.add("");
        jupiter_facts.add("");
        jupiter_facts.add("");
        jupiter_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,jupiter_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+jupiter_facts.get(random),200,30,20);
    }
    public static void jupiter_level(){
        for (int i=0;i<=10000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/10000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void jupiter_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to neptune!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //neptune
    public static void neptune_Welcome(){
        SaxionApp.drawText("Welcome to neptune!!",200,0,20);
        ArrayList<String> neptune_facts=new ArrayList<>();
        neptune_facts.add("");
        neptune_facts.add("");
        neptune_facts.add("");
        neptune_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,neptune_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+neptune_facts.get(random),200,30,20);
    }
    public static void neptune_level(){
        for (int i=0;i<=100000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/100000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void neptune_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to saturn!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //saturn
    public static void saturn_Welcome(){
        SaxionApp.drawText("Welcome to saturn!!",200,0,20);
        ArrayList<String> saturn_facts=new ArrayList<>();
        saturn_facts.add("");
        saturn_facts.add("");
        saturn_facts.add("");
        saturn_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,saturn_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+saturn_facts.get(random),200,30,20);
    }
    public static void saturn_level(){
        for (int i=0;i<=1000000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/1000000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void saturn_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to uranus!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //uranus
    public static void enter_uranus(){
        SaxionApp.drawText("Welcome to uranus!!",200,0,20);
        ArrayList<String> uranus_facts=new ArrayList<>();
        uranus_facts.add("");
        uranus_facts.add("");
        uranus_facts.add("");
        uranus_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,uranus_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+uranus_facts.get(random),200,30,20);
    }
    public static void uranus_level(){
        for (int i=0;i<=10000000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/10000000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic

            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void exit_uranus(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("Now heading to venus!",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }
    //venus
    public static void venus_Welcome(){
        SaxionApp.drawText("Welcome to venus!!",200,0,20);
        ArrayList<String> venus_facts=new ArrayList<>();
        venus_facts.add("");
        venus_facts.add("");
        venus_facts.add("");
        venus_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,venus_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+venus_facts.get(random),200,30,20);
    }
    public static void venus_level(){
        for (int i=0;i<=100000000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/100000000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
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
    //mercury
    public static void mercury_Welcome(){
        SaxionApp.drawText("Welcome to mercury!!",200,0,20);
        ArrayList<String> mercury_facts=new ArrayList<>();
        mercury_facts.add("");
        mercury_facts.add("");
        mercury_facts.add("");
        mercury_facts.add("");
        int random=SaxionApp.getRandomValueBetween(0,mercury_facts.size()-1);
        SaxionApp.drawText("Awesome fact:"+mercury_facts.get(random),200,30,20);
    }
    public static void mercury_level(){
        for (int i=0;i<=1000000000;i++){
            //background pic
            //rocket pic
            SaxionApp.printLine(i+"/100000000", Color.RED);
            SaxionApp.pause();
            SaxionApp.clear();
        }
        for (int up=0;up<400;){
            //background pic
            //rocket pic
            SaxionApp.sleep(0.1);
            up+=5;

        }
        SaxionApp.clear();
    }
    public static void mercury_exit(){
        SaxionApp.drawText("Level complete!!",200,150,20);
        SaxionApp.drawText("",200,180,20);
        SaxionApp.pause();
        SaxionApp.clear();
    }

}