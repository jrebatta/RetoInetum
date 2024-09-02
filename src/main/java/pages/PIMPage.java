package pages;

import base.Base;
import org.openqa.selenium.By;
import org.junit.Assert;
import paths.PIMPath;

public class PIMPage extends Base {

    private PIMPath pimPath = new PIMPath();

    public void elUsuarioNavegaALaSecciónPIMYHaceClickEnAddEmployee() {
        waitForElementToBeClickable(pimPath.aPIM, 2);
        click(pimPath.aPIM);
        waitForElement(pimPath.aAddEmployee, 2);
        click(pimPath.aAddEmployee);
    }

    public void elUsuarioCreaUnNuevoEmpleadoConLosDatos(String firstName, String middleName, String lastName, String employeeId) {
        waitForElementToBeClickable(pimPath.inputFirstName, 2);
        type(firstName, pimPath.inputFirstName);
        type(middleName, pimPath.inputMiddleName);
        type(lastName, pimPath.inputLastName);
        waitForElementToBeClickable(pimPath.btnSave, 2);
        click(pimPath.btnSave);
    }

    public void elUsuarioDeberíaVerElMensajeDeConfirmación(String mensaje) {
        waitForElement(pimPath.SuccessfullySaved, 2);
        String msj = getText(pimPath.SuccessfullySaved);
        Assert.assertTrue("El mensaje no contiene el texto esperado", msj.contains(mensaje));
    }

    public void elUsuarioDeberíaVerElNombreDelEmpleadoY(String nombre, String apellido) {
        waitForElement(pimPath.FirstLastName, 2);
        String msj = getText(pimPath.FirstLastName);
        Assert.assertTrue("El nombre del empleado no es el esperado", msj.contains(nombre + " " + apellido));
    }
}
