package Interaction;

import Model.LoginGmailModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static Interface.GmailPage.password_field;
import static Interface.GmailPage.user_field;

@AllArgsConstructor
public class LoginGmailInteraction implements Interaction {
    private final LoginGmailModel model;

    public static LoginGmailInteraction login(LoginGmailModel model) {
        return new LoginGmailInteraction(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(model.getUser()).into(user_field).thenHit(Keys.ENTER),
                Enter.theValue(model.getPassword()).into(password_field).thenHit(Keys.ENTER)
        );

    }
}
