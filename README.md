# Automation Web - Encora

Este documento proporciona instrucciones sobre cómo ejecutar el proyecto de automatización web.

## Prerequisitos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes elementos:

- **Java JDK** (versión 8 o superior)
- **Maven**
- **IDE** (IntelliJ IDEA, Eclipse, etc.)
- **ChromeDriver**

### Configuración del Entorno

1. **Configurar Java y Maven**:
   Asegúrate de que las variables de entorno `JAVA_HOME` y `M2_HOME` estén configuradas correctamente.

2. **Descargar ChromeDriver**:
   Descarga la versión adecuada de ChromeDriver para tu navegador desde [aquí](https://developer.chrome.com/docs/chromedriver/downloads?hl=es-419) y colócalo en la siguiente ubicación.

   - ***El driver debe estar en la siguiente ruta***:
   `driver/`

## Ejecución del Proyecto

### 1. Clonar el Repositorio

Si aún no lo has hecho, clona el repositorio del proyecto:

```bash
git clone https://github.com/EsmithAS/AutomationEncora.git
cd tu-repositorio
```

### Instalación de Dependencias

Si es la primera vez que ejecutas el proyecto, asegúrate de que todas las dependencias están instaladas. Ejecuta el siguiente comando en la raíz del proyecto:

```
mvn install
```

### Ejecución

La clase `RunnerTest` está configurada correctamente para que ejecute el test con el tag `@RegistrarUsuario`. A continuación se muestra un ejemplo de cómo luce:

```java
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/build/cucumber.json",
        features = "src/test/resources/features",
        stepNotifications = true,
        glue = "com.bdd.StepDefinition",
        tags = "@RegistrarUsuario"
)
public class RunnerTest {
}
```
- ***La clase RunnerTest se ubica en la siguiente ruta***:
  `src/test/java/com/bdd/Runner/RunnerTest.java`

- ***El feature se ubica en la siguiente ruta***:
  `src/test/resources/features/Register.feature`

## Autores ✒️

* **Esmith Alama Sanchez** - *QA Automation* - [EsmithAS](https://github.com/EsmithAS)