package pages;

import base.Base;
import org.openqa.selenium.By;
import org.junit.Assert;
import paths.LoginPath;

public class LoginPage extends Base {

    private LoginPath loginPath = new LoginPath();

    public void IngresoAOrangeHRM() {
        visit(LoginPath.url);
        maximize();
    }

    public void elUsuarioIngresaYYHaceClicEnElBotónDeLogin(String usuario, String contraseña) {
        waitForElement(loginPath.inputUser, 2);
        type(usuario, loginPath.inputUser);
        type(contraseña, loginPath.inputPassword);
        click(loginPath.btnLogin);
    }

    public void elUsuarioDeberíaVerElMensajeDeÉxito(String mensaje_exito) {
        waitForElement(loginPath.loggedInAsElement, 2);
        String msj = getText(loginPath.loggedInAsElement).trim();
        Assert.assertTrue("El mensaje no contiene el texto esperado", msj.contains(mensaje_exito));
    }
}
