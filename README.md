## Ejecutar Pruebas con Maven

Para ejecutar todas las pruebas etiquetadas con el tag `@Tests`, utiliza el siguiente comando Maven:

```sh
mvn test -Dcucumber.options="--tags @Tests"
