### Proyecto Pruebas Unitarias Con Testng y Junit

Este proyecto implementa pruebas unitarias usando Junit y Testng utilizando sus respectivas notaciones

- Rama **main**: Esta rama contiene una estructura basica y un documento pdf con el ejercicio propuesto
- Rama **testng_tienda**: Esta rama contiene la solucion al problema planteado usando  testng
- Rama **junit_tienda**: Esta rama contiene la solucion al problema planteado usando  junit

####  Ejecuccion con Gradle

Abrir una terminal en la ubicacion del proyecto  y ejecutar el siguiente comando

`gradle clean test`
o
`./gradlew clean test`
si quieres ver la trazabilidad de la ejcución, anade al comando que vas a ejecutar

`--info --stacktrace`

#### Revisión de resultado

Gradle genera un reporte en HTML para revisar este reporte ve a la siguiente ruta

`RUTA_DEL_PRUYECTO/Build/report/tests/test/index.html`

### Happy Coding!


------------