package fr.univlille.sae.controller.menuButton;

import fr.univlille.sae.Main;
import fr.univlille.sae.view.HunterView;
import fr.univlille.sae.view.MainView;
import fr.univlille.sae.view.MonsterView;
import javafx.scene.control.Button;

import java.io.File;

public class LaunchButton extends Button {
    public LaunchButton(){
        super("Jouer");
        setAction();
        setMinSize(200, 30);
        setFont(Main.loadFont("arcade_classic_2" + File.separator + "ARCADECLASSIC.TTF", 20));
    }

    public void setAction(){
        setOnAction(event -> {
            new MonsterView();
            new HunterView();
        });
    }
}