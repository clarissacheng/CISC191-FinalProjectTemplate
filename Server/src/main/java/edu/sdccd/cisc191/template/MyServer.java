package edu.sdccd.cisc191.template;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.Text;

public class MyServer extends Application {

    private Canvas gameCanvas;
    private Scene gameScene;
    private Group gameGroup;

    Spring spring;
    Summer summer;
    Fall fall;
    Winter winter;

    Rhubarb rhubarb;
    Cantaloupe cantaloupe;
    Apples apples;
    Pomegranates pomegranates;

    Stage window;

    Button okButton;

    Button springButton;
    Button summerButton;
    Button fallButton;
    Button winterButton;

    Button yesButton;
    Button noButton;


    Button rowOneButton;
    Button rowTwoButton;
    Button colOneButton;
    Button colTwoButton;

    HBox buttonsLayout;

    Text text;

    public static void main(String[] args)
    {
        Application.launch();
    }

    //start stage and show window of the logs
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Season Guessing Game");

        okButton = new Button();
        okButton.setText("Ok");

        yesButton = new Button();
        yesButton.setText("Yes");

        noButton = new Button();
        noButton.setText("No");

        springButton = new Button();
        springButton.setText("Spring");

        summerButton = new Button();
        summerButton.setText("Summer");

        fallButton = new Button();
        fallButton.setText("Fall");

        winterButton = new Button();
        winterButton.setText("Winter");

        rowOneButton = new Button();
        rowOneButton.setText("1");

        rowTwoButton = new Button();
        rowTwoButton.setText("2");

        colOneButton = new Button();
        colOneButton.setText("1");

        colTwoButton = new Button();
        colTwoButton.setText("2");

        text = new Text();
        text.setFont(Font.font(15));
        text.setText("\nGuess the randomly chosen season. \nIf you choose correctly, you have a " +
                     "chance at receiving fruit grown during that season. \nIf you choose " +
                     "incorrectly, then unlucky! Try next time.");

        buttonsLayout = new HBox(8);

        buttonsLayout.getChildren().add(okButton);

        okButton.setOnAction(e -> {
            text.setText("What season do you think was randomly chosen?");
            buttonsLayout.getChildren().removeAll(okButton);
            buttonsLayout.getChildren().addAll(springButton,summerButton,fallButton,winterButton);
            beginGameSeason();
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        buttonsLayout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(text, buttonsLayout);

        Scene scene = new Scene(layout, 600, 300);
        window.setScene(scene);
        window.show();
    }

    public void beginGameSeason() {

        Season[] season = {spring, summer, fall, winter};
        Random random = new Random();
        int randomSeasonIndex = random.nextInt(season.length);

            switch (randomSeasonIndex) {
                case 0:
                    springButton.setOnAction(e -> {
                        text.setText("Your guess is correct! \n\n-------------------------------------" +
                                "\nWould you like to guess which fruit is grown during that season?");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                        buttonsLayout.getChildren().addAll(yesButton, noButton);
                    });
                    summerButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    fallButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    winterButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    break;
                case 1:
                    summerButton.setOnAction(e -> {
                        text.setText("Your guess is correct! \n\n-------------------------------------" +
                                "\nWould you like to guess which fruit is grown during that season?");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                        buttonsLayout.getChildren().addAll(yesButton, noButton);
                    });
                    springButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    fallButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    winterButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    break;
                case 2:
                    fallButton.setOnAction(e -> {
                        text.setText("Your guess is correct! \n\n-------------------------------------" +
                                "\nWould you like to guess which fruit is grown during that season?");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                        buttonsLayout.getChildren().addAll(yesButton, noButton);
                    });
                    summerButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    springButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    winterButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    break;
                case 3:
                    winterButton.setOnAction(e -> {
                        text.setText("Your guess is correct! \n\n-------------------------------------" +
                                "\nWould you like to guess which fruit is grown during that season?");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                        buttonsLayout.getChildren().addAll(yesButton, noButton);
                    });
                    summerButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    fallButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    springButton.setOnAction(e -> {
                        text.setText("Sorry, wrong season!");
                        buttonsLayout.getChildren().removeAll(springButton, summerButton, fallButton, winterButton);
                    });
                    break;
            }

        noButton.setOnAction(e -> {
            text.setText("Thanks for giving us a try!");
            buttonsLayout.getChildren().removeAll(yesButton,noButton);
        });

        yesButton.setOnAction(e -> {
            buttonsLayout.getChildren().removeAll(yesButton,noButton);
            buttonsLayout.getChildren().addAll(rowOneButton,rowTwoButton);
            beginGameFruits();
        });

    }

    public void beginGameFruits(){
        Fruits[][] fruits = {{rhubarb, cantaloupe}, {apples, pomegranates}};
        Random random = new Random();
        int randFruitsRow = random.nextInt(fruits.length);
        int randFruitsCol = random.nextInt(fruits[randFruitsRow].length);

        text.setText("Which of these fruit could possibly be growing during your season?\n" +
                "\n \t\t            Column 1                Column 2" +
                "\n \tRow 1          Rhubarb                  Cantaloupe" +
                "\n \tRow 2          Apples                     Pomegranates\n\n\t\t\t\t\t\tSelect row");

        rowOneButton.setOnAction(e -> {
            if(randFruitsRow == 0){
                buttonsLayout.getChildren().removeAll(rowOneButton,rowTwoButton);
                text.setText("Select column");
                buttonsLayout.getChildren().addAll(colOneButton,colTwoButton);
                colOneButton.setOnAction(q -> {
                    if(randFruitsCol == 0){
                    buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                    text.setText("Congrats! You get Rhubarb!");
                    }else if(randFruitsCol == 1){
                    buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                    text.setText("Congrats! You get Cantaloupe!");
                    }
                });
            }else{
                buttonsLayout.getChildren().removeAll(rowOneButton,rowTwoButton);
                buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                text.setText("Unlucky! No fruits for you!");
            }
        });

        rowTwoButton.setOnAction(e -> {
            if(randFruitsRow == 1){
                buttonsLayout.getChildren().removeAll(rowOneButton,rowTwoButton);
                text.setText("Select column");
                buttonsLayout.getChildren().addAll(colOneButton,colTwoButton);
                colTwoButton.setOnAction(q -> {
                    if(randFruitsCol == 0){
                        buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                        text.setText("Congrats! You get Apples!");
                    }else if(randFruitsCol == 1){
                        buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                        text.setText("Congrats! You get Pomegranates!");
                    }
                });
            }else{
                buttonsLayout.getChildren().removeAll(rowOneButton,rowTwoButton);
                buttonsLayout.getChildren().removeAll(colOneButton,colTwoButton);
                text.setText("Unlucky! No fruits for you!");
            }
        });
    }
}

