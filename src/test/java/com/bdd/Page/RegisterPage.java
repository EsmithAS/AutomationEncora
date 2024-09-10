package com.bdd.Page;

import com.bdd.Base.BasePage;
import com.bdd.Util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage extends BasePage {

    @FindBy(css = "#loginPanel p:nth-child(3) a")
    private WebElement lnkRegister;

    @FindBy(css = "[id='customer.firstName']")
    private WebElement txtFirstName;

    @FindBy(css = "[id='customer.lastName']")
    private WebElement txtLastName;

    @FindBy(css = "[id='customer.address.street']")
    private WebElement txtAddress;

    @FindBy(css = "[id='customer.address.city']")
    private WebElement txtCity;

    @FindBy(css = "[id='customer.address.state']")
    private WebElement txtState;

    @FindBy(css = "[id='customer.address.zipCode']")
    private WebElement txtZipCode;

    @FindBy(css = "[id='customer.phoneNumber']")
    private WebElement txtPhone;

    @FindBy(css = "[id='customer.ssn']")
    private WebElement txtSsn;

    @FindBy(css = "[id='customer.username']")
    private WebElement txtUsername;

    @FindBy(css = "[id='customer.password']")
    private WebElement txtPassword;

    @FindBy(css = "[id='repeatedPassword']")
    private WebElement txtConfirm;

    @FindBy(css = "input[value='Register']")
    private WebElement btnRegister;

    @FindBy(css = "#rightPanel")
    private WebElement panelRight;

    @FindBy(css = "#rightPanel p")
    private WebElement lblMessage;

    @FindBy(css = "form input[name='username']")
    private WebElement txtLoginUsername;

    @FindBy(css = "form input[name='password']")
    private WebElement txtLoginPassword;

    @FindBy(css = "form input[type='submit']")
    private WebElement btnLogin;

    @FindBy(linkText = "Log Out")
    private WebElement lnkLogOut;

    public RegisterPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void queInicioSesionEnLaPaginaParabank(String url) {
        getDriver().get(url);
    }

    public void doyClicEnRegistrarme() {
        lnkRegister.click();
    }

    public void ingresarNombres(String nombres) {
        txtFirstName.sendKeys(nombres);
    }

    public void ingresarApellidos(String lastname) {
        txtLastName.sendKeys(lastname);
    }

    public void ingresarAddress(String address) {
        txtAddress.sendKeys(address);
    }

    public void ingresarCity(String city) {
        txtCity.sendKeys(city);
    }

    public void ingresarState(String state) {
        txtState.sendKeys(state);
    }

    public void ingresarZipCode(String zipCode) {
        txtZipCode.sendKeys(zipCode);
    }

    public void ingresarPhone(String phone) {
        txtPhone.sendKeys(phone);
    }

    public void ingresarSsn(String ssn) {
        txtSsn.sendKeys(ssn);
    }

    public void ingresarUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void ingresarPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void ingresarConfirmPassword(String confirmPassword) {
        txtConfirm.sendKeys(confirmPassword);
    }

    public void doyClicEnElBotonRegistrar() {
        btnRegister.click();
    }

    public String obtenerMensaje() {
        Util.waitElementIsVisible(lblMessage, getDriver(), 5);
        System.out.println(lblMessage.getText());
        return lblMessage.getText();
    }

    public void doyClicEnLogOut() {
        lnkLogOut.click();
    }

    public void ingresarLoginUsername(String username) {
        txtLoginUsername.sendKeys(username);
    }

    public void ingresarLoginPassword(String password) {
        txtLoginPassword.sendKeys(password);
    }

    public void doyClicEnElBotonLogin() {
        btnLogin.click();
    }
}
