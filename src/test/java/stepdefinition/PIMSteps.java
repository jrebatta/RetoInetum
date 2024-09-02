package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIMPage;

public class PIMSteps {

    private PIMPage pimPage = new PIMPage();


    @When("el usuario navega a la sección PIM y hace click en Add Employee")
    public void elUsuarioNavegaALaSecciónPIMYHaceClickEnAddEmployee() {

    }

    @When("el usuario crea un nuevo empleado con los datos:")
    public void elUsuarioCreaUnNuevoEmpleadoConLosDatos() {
    }

    @Then("el usuario debería ver el mensaje de confirmación {string}")
    public void elUsuarioDeberíaVerElMensajeDeConfirmación(String mensaje) {
    }

    @And("el usuario debería ver el nombre del empleado {string} y {string}")
    public void elUsuarioDeberíaVerElNombreDelEmpleadoY(String nombre, String apellido) {
    }

}
