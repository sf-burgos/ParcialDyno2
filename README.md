# Lab3_AREP_Reto1
<img src="https://github.com/sf-burgos/ArquitecturaEmpresarial/blob/master/laboratorio1AREP-app/resources/Imagenes/BB.jpg" width="100" height="100">

##### **Presentado por:** **[Brayan Steven Burgos Delgado](https://www.linkedin.com/in/brayan-steven-burgos-delgado-21a9a0178/)**
##### Repositorio: [click aqui](https://github.com/sf-burgos/Lab3_AREP_Reto1)
## Objetivo:

Escribir un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con javascript para probar su servidor. Despliegue su solución en Heroku. NO use frameworks web como Spark o Spring use solo Java y las librerías para manejo de la red.

# Creacion del proyecto 

> mvn archetype:generate -DgroupId=edu.escuelaing.edu.AREP -DartifactId=Reto1 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

## Prerrequisitos

Java
Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:

> java -version

java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)
Maven
La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:

> mvn -v

# Git version

>git --version
>git version 2.21.0.windows.1

# Heroku
La página web se encuentra invocada en la nube usando Heroku, para comprobar que se tengan los requisitos localmente:

> heroku -v



