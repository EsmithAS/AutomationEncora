package com.bdd.StepDefinition;

import com.bdd.Step.RegisterStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import org.junit.Assert;

public class RegisterStepDefinition {

    RegisterStep registerStep = new RegisterStep();

    @Dado("que inicio sesion en la pagina Parabank")
    public void queInicioSesionEnLaPaginaParabank() {
        registerStep.queInicioSesionEnLaPaginaParabank();
    }

    @Y("doy clic en registrarme")
    public void doyClicEnRegistrarme() {
        registerStep.doyClicEnRegistrarme();
    }

    @Y("completo los datos del usuario")
    public void completoLosDatosDelUsuario(DataTable dataTable) {
        registerStep.completoLosDatosDelUsuario(dataTable);
    }

    @Y("completo los datos de la cuenta")
    public void completoLosDatosDeLaCuenta(DataTable dataTable) {
        registerStep.completoLosDatosDeLaCuenta(dataTable);
    }

    @Cuando("doy clic en el boton registrar")
    public void doyClicEnElBotonRegistrar() {
        registerStep.doyClicEnElBotonRegistrar();
    }

    @Entonces("valido que aparezca el mensaje {string}")
    public void validoQueAparezcaElMensaje(String message) {
        Assert.assertEquals(message, registerStep.validoQueAparezcaElMensaje());
    }

    @E("inicio sesion con los datos de la cuenta")
    public void inicioSesionConLosDatosDeLaCuenta() {
        registerStep.inicioSesionConLosDatosDeLaCuenta();
    }
}
