package Utilities;

import Model.LoginGmailModel;

import java.util.ResourceBundle;

public class Leerdatos {
    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle("Datos.Datos");
        }
    }

    public static String getLeerdatos(String llave) {
        return resourceBundle().getString(llave);
    }

    public static LoginGmailModel datoslogin() {
        LoginGmailModel datos = new LoginGmailModel();
        datos.setUser(getLeerdatos("datos.user"));
        datos.setPassword(getLeerdatos("datos.password"));
        return datos;
    }
}
