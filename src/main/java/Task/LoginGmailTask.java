package Task;

import Model.LoginGmailModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import Interaction.LoginGmailInteraction;


@AllArgsConstructor
public class LoginGmailTask implements Task {
    private final LoginGmailModel model;

    public static LoginGmailTask login(LoginGmailModel model) {
        return new LoginGmailTask(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginGmailInteraction.login(model));
    }
}
