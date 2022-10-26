package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TimeTrackerService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimeTrackerSteps extends PageSteps {

    @And("hace click en start time")
    public void haceClickEnStartTime() {
        TimeTrackerService.clikStarTime();
    }

    @When("carga horas de inicio y de fin")
    public void cargaHoraDeInicioYDeFin() {
        TimeTrackerService.cargaHoras();
    }

    @And("hace click en guardar")
    public void haceClickEnGuardar() {
        TimeTrackerService.btnSave();
    }

    @And("selecciona un proyecto")
    public void seleccionaUnProyecto() {
        TimeTrackerService.selectProject();
    }

    @Then("se verifica que las horas se cargaron exitosamente")
    public void seVerificaQueLasHorasSeCargaronExitosamente() {
        TimeTrackerService.verifySave();
    }
}
