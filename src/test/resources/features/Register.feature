#language: es
Característica: Registrar usuario en la web Parabank

  Esquema del escenario: Registrar un nuevo usuario en la web Parabank
    Dado que inicio sesion en la pagina Parabank
    Y doy clic en registrarme
    Y completo los datos del usuario
      | firstName   | lastName   | address   | city   | state   | zipCode   | phone   | ssn   |
      | <firstName> | <lastName> | <address> | <city> | <state> | <zipCode> | <phone> | <ssn> |
    Y completo los datos de la cuenta
      | username   | password   | confirm   |
      | <username> | <password> | <confirm> |
    Cuando doy clic en el botón registrar
    Entonces valido que aparezca el mensaje "Your account was created successfully. You are now logged in."
    E inicio sesion con los datos de la cuenta
    Ejemplos:
      | firstName | lastName      | address    | city    | state | zipCode | phone     | ssn | username | password | confirm  |
      | Esmith    | Alama Sanchez | Los Olivos | Sullana | Piura | 2102    | 988563221 | 001 | esmith   | testpass | testpass |