#  Calculadora de Media y Desviación Estandar

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/ARSW-2-Calculator.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/compilado.png)




Una vez compilado el programa esta listo para su uso, el último paso es ejecutar el programa por medio del siguiente comando en consola:

```
java -cp target/calculator-1.0-SNAPSHOT.jar edu.escuelaing.arsw.app.main "Ruta del archivo"

```

A continuación un ejemplo:

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/ejemplo.png)


### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Diagrama de clases

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/diagrama.png)

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/LinkedList.png)

En el paquete llamado *LinkedList* se implemento una versión diferente a la que viene en el API de Java, se crearon dos clases en ese paquete para poder hacer uso de los metodos 
que normalmente son utilizados con las LinkedList:

```
  * LinkedList
  * Node
```
* En *LinkedList* se encuentran las operaciones básicas que hacen las listas enlazadas en java, agregar,remover,getSize,Iterator e IsEmpty.
* En *Node* se encuentra el construtor de los nodos que son los encargados de almacenar los datos en las LinkedList.

En el paquete *Calculator* y *App* se encuentra el servicio principal que ofrece el programa el cual es calcular la media y la desviación estandar por medio de archivos de texto que son 
administrados por el usuario. Se encuentran las siguientes clases.

```
  * Calculator
  * Reader
  * Main
```

* En *Main* se hace el llamado por el cual se ejecutan el resto de clases.
* En *Reader* se lee el archivo en columnas las cuales se leen como tuplas, para poder diferenciar a cual de las dos LinkedList se agregarán los datos correspondientes y hace uso
de la clase Calculator para calcular e imprimir los resultados.
* En *Calculator* se hacen las operaciones necesarias para poder calcular la media y la desviación estandar de los datos administrados.

## Reporte de pruebas
A continuación se muestra un reporte de las pruebas realizadas en el programa, las cuales se realizaron con los siguientes casos:

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/caso1.png)

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/caso2.png)

Se realizaron un total de 17 pruebas donde se busco comprobar que se calcularan los datos pedidos con exactitud, con casos como "deberiaHallar" y "deberiaFallar"

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/pruebas.png)

se ejecutan a través del siguiente comando en consola:

```
mvn test
```

![image](https://github.com/csarssj/Primer-Repositorio-ARSW/blob/master/resources/pruebas.png)





## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management


## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 5 de junio del 2020_ 

LOCS/Hora 496 / 14  = 35 LOCS/Hora

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) 
