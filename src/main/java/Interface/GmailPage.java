package Interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailPage {
    public static final Target user_field =Target.the("en este campo escribimos el nombre de usuario").located(By.id("identifierId"));
    public static final Target password_field =Target.the("en este campo escribimos la contraseña del usuario").located(By.name("Passwd"));
    public static final Target start_option =Target.the("Verificar el inicio del del inicio del correo electronico").located(By.xpath("*//div/div[2]/div/c-wiz/c-wiz/div/div[1]/div[3]/c-wiz/nav/ul/li[1]/a/div[2]"));


}
