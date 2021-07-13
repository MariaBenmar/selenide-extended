package quru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

//import static  selenide
public class TextBoxTest {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Maria");
        $("#userEmail").setValue("Maria@user.com");
        $("#currentAddress").setValue("some address 1");
        $("#permanentAddress").setValue("other address 2");

        $("#submit").click();

        $("#name").shouldHave(Condition.text("Maria"));
        $("#email").shouldHave(Condition.text("Maria@user.com"));
        $("#currentAddress", 1).shouldHave(Condition.text("some address 1"));
        $("#permanentAddress", 1).shouldHave(Condition.text("other address 2"));



    }
}

