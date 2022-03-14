package com.example.test.javafx;

import com.example.javafx.HelloApplication;
import com.example.javafx.HelloController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import java.io.IOException;

@ExtendWith(ApplicationExtension.class)
public class ButtonTest {

    final static String BTN_TEXT = "I am a button!";
    final static String LABEL_TEXT_AFTER_CLICK = "Button was clicked!";
    final static String BTN_ID = "myButton";
    final static String BTN_CLASS = "button";

    private HelloController controller;
    private static FxRobot robot;

    @BeforeAll
    public static void setup() {
        robot = new FxRobot();
    }

    @Start
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = loader.load();
        //This must happen AFTER loader.load()
        this.controller = loader.getController();
        stage.setScene(new Scene(root, 0, 0));
        stage.show();
    }


    @Test
    void test_Button_has_Text() {
        FxAssert.verifyThat(controller.getButton(), LabeledMatchers.hasText(BTN_TEXT));
        // or (lookup by css id):
        FxAssert.verifyThat("#button", LabeledMatchers.hasText(BTN_TEXT));
        // or (lookup by css class):
        FxAssert.verifyThat(".button", LabeledMatchers.hasText(BTN_TEXT));
    }

    @Test
    void test_WHEN_Button_click_label_changes() {

        // when:
        robot.clickOn(".button");

        // then:
        FxAssert.verifyThat(controller.getLabel(), LabeledMatchers.hasText(LABEL_TEXT_AFTER_CLICK));
        // or (lookup by css id):
        FxAssert.verifyThat("#label", LabeledMatchers.hasText(LABEL_TEXT_AFTER_CLICK));
        // or (lookup by css class):
        FxAssert.verifyThat(".label", LabeledMatchers.hasText(LABEL_TEXT_AFTER_CLICK));
    }
}
