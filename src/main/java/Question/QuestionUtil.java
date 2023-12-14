package Question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static Interface.GmailPage.start_option;

public class QuestionUtil {

    public static Question<String> General() {
        return actor -> BrowseTheWeb.as(actor).find(start_option).getText();
    }
}
