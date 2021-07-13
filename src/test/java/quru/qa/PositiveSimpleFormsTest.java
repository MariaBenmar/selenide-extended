package quru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class PositiveSimpleFormsTest {

    @Test
    void fillForms() throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");

        $(byId("firstName")).setValue("firstName").pressEnter();
        $(byId("lastName")).setValue("lastName").pressEnter();
        $(byId("userEmail")).setValue("mana@mail.ru").pressEnter();

        $(byId("userNumber")).setValue("79991234567").pressEnter();
        $(byId("dateOfBirthInput")).setValue("79991234567").pressEnter();


        Thread.sleep(5000);

        //       $("#search").shouldHave(text("selenide.org"));
    }

}