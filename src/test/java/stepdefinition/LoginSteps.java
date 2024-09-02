package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Given("ingreso a OrangeHRM")
    public void IngresoAOrangeHRM() {
        loginPage.IngresoAOrangeHRM();
    }

    @Given("el usuario ingresa {string} y {string} y hace clic en el botón de login")
    public void elUsuarioIngresaYYHaceClicEnElBotónDeLogin(String usuario, String contraseña) throws InterruptedException {
        loginPage.elUsuarioIngresaYYHaceClicEnElBotónDeLogin(usuario,contraseña);
    }

    @Then("el usuario debería ver el mensaje del Dashboard {string}")
    public void elUsuarioDeberíaVerElDelDashboard(String mensaje_exito) throws InterruptedException  {
        loginPage.elUsuarioDeberíaVerElMensajeDeÉxito(mensaje_exito);
    }

}
