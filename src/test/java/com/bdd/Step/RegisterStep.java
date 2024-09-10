package com.bdd.Step;

import automation.encora.Data.Data;
import com.bdd.Page.RegisterPage;
import com.bdd.Util.Util;
import io.cucumber.datatable.DataTable;

public class RegisterStep {

    RegisterPage registerPage;

    public RegisterPage registerPage() {
        registerPage = new RegisterPage();
        return registerPage;
    }

    public void queInicioSesionEnLaPaginaParabank() {
        registerPage().queInicioSesionEnLaPaginaParabank("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void doyClicEnRegistrarme() {
        registerPage().doyClicEnRegistrarme();
    }

    public void completoLosDatosDelUsuario(DataTable dataTable) {
        String firstName = Util.getValueFromDataTable(dataTable, "firstName");
        String lastName = Util.getValueFromDataTable(dataTable, "lastName");
        String address = Util.getValueFromDataTable(dataTable, "address");
        String city = Util.getValueFromDataTable(dataTable, "city");
        String state = Util.getValueFromDataTable(dataTable, "state");
        String zipCode = Util.getValueFromDataTable(dataTable, "zipCode");
        String phone = Util.getValueFromDataTable(dataTable, "phone");
        String ssn = Util.getValueFromDataTable(dataTable, "ssn");

        registerPage().ingresarNombres(firstName);
        registerPage().ingresarApellidos(lastName);
        registerPage().ingresarAddress(address);
        registerPage().ingresarCity(city);
        registerPage().ingresarState(state);
        registerPage().ingresarZipCode(zipCode);
        registerPage().ingresarPhone(phone);
        registerPage().ingresarSsn(ssn);
    }

    public void completoLosDatosDeLaCuenta(DataTable dataTable) {
        int idRandom = Util.getRandom();
        Data.userAccount = dataTable;
        Data.userId = idRandom;

        String username = Util.getValueFromDataTable(dataTable, "username");
        String password = Util.getValueFromDataTable(dataTable, "password");
        String confirm = Util.getValueFromDataTable(dataTable, "confirm");

        registerPage().ingresarUsername(username.concat(String.valueOf(idRandom)));
        registerPage().ingresarPassword(password);
        registerPage().ingresarConfirmPassword(confirm);
    }

    public void doyClicEnElBotonRegistrar() {
        registerPage().doyClicEnElBotonRegistrar();
    }

    public String validoQueAparezcaElMensaje() {
        return registerPage().obtenerMensaje();
    }

    public void inicioSesionConLosDatosDeLaCuenta() {
        DataTable dataTable = Data.userAccount;
        String username = Util.getValueFromDataTable(dataTable, "username");
        String password = Util.getValueFromDataTable(dataTable, "password");

        registerPage().doyClicEnLogOut();
        registerPage().ingresarLoginUsername(username.concat(String.valueOf(Data.userId)));
        registerPage().ingresarLoginPassword(password);
        registerPage().doyClicEnElBotonLogin();
    }
}
