# Demoblaze Test Automation with Selenium

Este proyecto contiene pruebas automatizadas para la página web [Demoblaze](https://www.demoblaze.com/) utilizando Selenium WebDriver.

## Descripción

El propósito de este repositorio es automatizar pruebas de interacción y flujo de usuario en el sitio web de Demoblaze, utilizando Selenium WebDriver como herramienta principal de automatización de pruebas. Las pruebas incluyen la navegación por el sitio, la interacción con los productos, la verificación del carrito de compras y otros aspectos de la funcionalidad clave de la página.

## Tecnologías utilizadas

- **Lenguaje:** Java
- **Framework de pruebas:** TestNG
- **Herramienta de automatización:** Selenium WebDriver
- **IDE:** IntelliJ IDEA
- **Control de versiones:** Git
- **Repositorio:** GitHub

## Pruebas Implementadas

- **Inicio de sesión:** Verifica que un usuario pueda iniciar sesión correctamente.
- **Navegación por productos:** Asegura que los productos puedan ser navegados y seleccionados.
- **Agregar al carrito:** Valida que los productos seleccionados se agreguen correctamente al carrito de compras.
- **Compra de productos:** Automación del flujo de compra completo.
  
## Estructura del proyecto

```sh
DemoblazeTestSelenium/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/demoblaze/tests/
│   └── test/
│       └── resources/
│           └── testdata/
├── .idea/  # Configuraciones del proyecto en IntelliJ IDEA
└── pom.xml # Dependencias y configuración del proyecto Maven
```

## Instalación

1. Clona este repositorio:

    ```sh
    git clone https://github.com/argenisjpinto/DemoblazeTestSelenium.git
    ```

2. Importa el proyecto en tu IDE (IntelliJ IDEA recomendado).

3. Descarga las dependencias usando Maven:

    ```sh
    mvn clean install
    ```

## Ejecución de pruebas

Para ejecutar las pruebas desde la línea de comandos, utiliza Maven:

    mvn test
    
También puedes ejecutar las pruebas directamente desde tu IDE si estás usando IntelliJ IDEA.

## Contribuciones

Si deseas contribuir a este proyecto, por favor abre un *issue* o envía una *pull request*. Asegúrate de seguir las buenas prácticas y realizar pruebas antes de enviar tus cambios.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---
