# Estudio Java

¡Bienvenido a mi repositorio de ejercicios de programación en Java! Soy un estudiante principiante aprendiendo Java por mi cuenta, y este repositorio es donde subo los ejercicios y proyectos que realizo para mejorar mis habilidades.

## Estructura del Repositorio

El repositorio está organizado en carpetas, cada una correspondiente a un tema o concepto de Java que estoy estudiando. Aquí te dejo una descripción general de la estructura:

```
/Ejercicios/
    - Calculadora.java
```

## Contenido

Hasta ahora, he cubierto los siguientes temas en Java:

- Variables y Tipos de Datos
- Condicionales (if-else, switch)
- Bucles (for, while, do-while)

Voy a seguir añadiendo más ejercicios y temas a medida que avance en mi aprendizaje.

## Descripción

El programa presenta un menú principal donde el usuario puede seleccionar una de las cuatro calculadoras, cada una implementada con diferentes estructuras de control. Tras seleccionar una calculadora, se le pide al usuario que elija la operación matemática a realizar y que introduzca los números correspondientes. La calculadora realiza la operación seleccionada y muestra el resultado en pantalla.

### Modos de Implementación

1. **Calculadora I**: Utiliza estructuras `for` e `if-else`.
2. **Calculadora II**: Implementa `switch` combinado con `if`.
3. **Calculadora III**: Usa `do-while` junto con `switch`.
4. **Calculadora IV**: Combina `switch`, `if-else`, y `for`.

### Estructura del Proyecto

- **Main Class**: Contiene el menú principal y llama a las diferentes clases según la elección del usuario.
- **Sub Clases**: Cada calculadora tiene su propia clase (`CalculadoraI`, `CalculadoraII`, etc.) donde se implementan las operaciones específicas.

## Funcionalidades

- **Operaciones Básicas**: Suma, resta, multiplicación y división.
- **Navegación**: Posibilidad de volver al menú principal o cambiar de operación.
- **Validación de Entradas**: Se valida que las entradas sean números y se manejan las excepciones adecuadamente.

## Manejo de Excepciones

El proyecto implementa manejo de excepciones para asegurar la estabilidad del programa frente a entradas no válidas y otros errores comunes.

### Excepciones Manejadas:
- **NumberFormatException**: Capturada cuando el usuario ingresa un valor no numérico en lugar de un número, como cuando se espera un entero pero se proporciona texto.
- **Exception**: Captura cualquier otro tipo de error no específico que pueda ocurrir durante la ejecución, asegurando que el programa maneje adecuadamente situaciones inesperadas.


## Cómo Usar Este Repositorio

Si quieres revisar o ejecutar los ejercicios, sigue estos pasos:

1. Clona el repositorio:

   ```bash
   git clone https://github.com/SAFCCFAS/estudio-java.git
   ```

   o

   ```bash
   gh repo clone SAFCCFAS/estudio-java
   ```

2. Abre los archivos `.java` en tu editor de código preferido.
3. Ejecuta los ejercicios utilizando el entorno de desarrollo que prefieras (Eclipse, IntelliJ, etc.) o directamente desde la línea de comandos usando `javac` y `java`.

## Progreso y Objetivos

Hasta ahora, he logrado familiarizarme con los conceptos básicos de Java, como variables, condicionales y bucles. Mi próximo objetivo es profundizar en la programación orientada a objetos, y luego empezar a trabajar en proyectos más complejos.

## Plan de Mejora

Actualmente, el código que encontrarás en este repositorio está en una **versión extendida**, lo que significa que es más detallado y explícito para facilitar mi comprensión y aprendizaje de los conceptos. Sin embargo, a medida que avance en mis estudios y me sienta más cómodo con Java, tengo planeado **refactorizar** y **simplificar** el código para hacerlo más limpio y eficiente.

Algunas de las mejoras futuras incluirán:

- **Modularización del código**: Separar responsabilidades en métodos y clases para mejorar la mantenibilidad.
- **Uso de buenas prácticas**: Implementar principios de diseño como DRY (Don't Repeat Yourself) y KISS (Keep It Simple, Stupid).
- **Optimización de lógica**: Simplificar estructuras condicionales y bucles.

Si tienes sugerencias o ideas para mejorar el código, ¡serán bienvenidas!

## Notas Personales

Aprender Java de forma independiente ha sido un desafío interesante, especialmente al principio. Estoy usando este repositorio como un diario de aprendizaje, donde documento lo que aprendo y cómo lo aplico. Si tienes alguna sugerencia o comentario, ¡estaré encantado de recibir tu feedback!

## Recursos Adicionales

Que me ha ayudado en este camino:

*  https://www.youtube.com/playlist?list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&feature=shared
*  https://docs.oracle.com/en/java/
*  https://docs.oracle.com/javase/8/docs/api/
*  https://www.sololearn.com/es/learn/courses/le-java
*  

## Licencia

Este proyecto está bajo la Licencia MIT, lo que significa que puedes utilizar y modificar el código libremente. Sin embargo, ten en cuenta que este código es principalmente para fines educativos.

---