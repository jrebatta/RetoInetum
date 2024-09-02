package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIMPage;

import java.util.Map;

public class PIMSteps {

    private PIMPage pimPage = new PIMPage();


    @When("el usuario navega a la sección PIM y hace click en Add Employee")
    public void elUsuarioNavegaALaSecciónPIMYHaceClickEnAddEmployee() {
        pimPage.elUsuarioNavegaALaSecciónPIMYHaceClickEnAddEmployee();
    }

    @When("el usuario crea un nuevo empleado con los datos:")
    public void elUsuarioCreaUnNuevoEmpleadoConLosDatos(DataTable dataTable) {
        Map<String, String> datosEmpleado = dataTable.asMaps(String.class, String.class).get(0);
        String firstName = datosEmpleado.get("First Name");
        String middleName = datosEmpleado.get("Middle Name");
        String lastName = datosEmpleado.get("Last Name");
        String employeeId = datosEmpleado.get("Employee ID");
        pimPage.elUsuarioCreaUnNuevoEmpleadoConLosDatos(firstName, middleName, lastName, employeeId);
    }

    @And("el usuario debería ver el mensaje de confirmación {string}")
    public void elUsuarioDeberíaVerElMensajeDeConfirmación(String mensaje) {
        pimPage.elUsuarioDeberíaVerElMensajeDeConfirmación(mensaje);
    }

    @Then("el usuario debería ver el nombre del empleado {string} y {string}")
    public void elUsuarioDeberíaVerElNombreDelEmpleadoY(String nombre, String apellido) {
        pimPage.elUsuarioDeberíaVerElNombreDelEmpleadoY(nombre,apellido);
    }

}
