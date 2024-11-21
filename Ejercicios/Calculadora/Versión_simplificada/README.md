# Calculadora Simplificada

**Calculadora Simplificada** es una versión que prioriza la claridad y limpieza del código dentro del proyecto de 
Calculadora en Java. Está diseñada para ofrecer una estructura simple que facilita la comprensión de las operaciones
aritméticas, enfocándose en la legibilidad y accesibilidad del código. Aunque comparte las mismas funcionalidades que la
Calculadora Extensa, esta versión destaca por su enfoque en la simplicidad y la modularización.

A diferencia de la Calculadora Extensa, esta versión emplea la modularización mediante el uso de métodos para las
operaciones, validaciones de entrada y manejo de excepciones. El objetivo es proporcionar un código más limpio,
organizado y fácil de entender, ideal para quienes están aprendiendo los fundamentos de la programación en Java.

### Explicación de los cambios:
- Claridad: He tratado de hacer las oraciones más cortas y directas, lo que mejora la comprensión.
- Organización: Separé las ideas principales (estructuras de control, uso de métodos, validación de entradas)
  para que quede más claro el contraste entre la Calculadora Simplificada y la Calculadora Extensa.
- Lenguaje claro: El lenguaje es más directo y sencillo, lo que ayuda a que cualquier persona que lea la descripción 
  entienda el propósito de tu proyecto rápidamente.

## Índice

1. [Visión General](#visión-general)
2. [Uso](#uso)
3. [Calculadora I](#calculadora-i)
4. [Calculadora II](#calculadora-ii)
5. [Calculadora III](#calculadora-iii)
6. [Calculadora IV](#calculadora-iv)
7. [Manejo de Errores](#manejo-de-errores)


## Visión General

Calculadora Simplificada es un proyecto en Java diseñado para ofrecer una implementación clara y accesible de
operaciones aritméticas básicas. Dentro del proyecto general de calculadora, esta versión se enfoca en la simplicidad y
la modularización del código, haciendo hincapié en la legibilidad y la facilidad de comprensión.

Esta versión incluye varias calculadoras con diferentes niveles de complejidad, cada una diseñada para demostrar
distintas características y enfoques en el diseño del software. La Calculadora Simplificada utiliza métodos para 
modularizar las operaciones aritméticas, validar entradas y manejar excepciones, proporcionando así un código más
organizado y fácil de entender, ideal para principiantes en programación en Java.

La principal diferencia con otras versiones del proyecto, como la Calculadora Extensa, radica en su enfoque en mantener
el código sencillo y limpio, facilitando el aprendizaje de los fundamentos de Java sin complicaciones adicionales.

## Uso

Al ejecutar el programa, se muestra un menú que permite al usuario seleccionar una de las siguientes opciones:
1. **for/if-else**
2. **if/switch**
3. **do-while/switch**
4. **Switch/if-else/for**
5. **Cerrar programa**

Cada opción lleva al usuario a una calculadora específica donde puede realizar operaciones aritméticas básicas:
Suma, Resta, Multiplicación, y División.

## Calculadora I

**Estructuras de Control Utilizadas: `for`, `if-else`**

- **Selección de Operación (`if-else`)**:
  - Se utiliza una serie de declaraciones `if-else` para permitir al usuario elegir la operación deseada.

- **Ejecución de la Operación (`for`)**:
  - Un bucle `for` se utiliza para ejecutar la operación solicitada una vez, después de confirmar con el usuario si
    desea continuar o cambiar la operación.

- **Confirmación de Continuación (`if-else`)**:
  - El programa utiliza `if-else` para manejar la confirmación del usuario sobre si desea continuar con la operación
    actual o cambiar a otra.

## Calculadora II

**Estructuras de Control Utilizadas: `switch`, `if-else`**

- **Selección de Operación (`switch`)**:
  - Un `switch` se utiliza para seleccionar la operación matemática basada en la elección del usuario.

- **Confirmación de Continuación (`if-else`)**:
  - Después de seleccionar una operación, se solícita al usuario confirmar si desea continuar con la operación
    seleccionada o cambiarla.

## Calculadora III

**Estructuras de Control Utilizadas: `do-while`, `switch`**

- **Selección de Operación (`switch`)**:
  - Un `switch` se utiliza para seleccionar la operación matemática que se desea realizar.

- **Ejecución de la Operación (`do-while`)**:
  - Un bucle `do-while` permite que el usuario ejecute la operación seleccionada y luego decida si desea realizar otra
    operación o regresar al menú principal.

- **Confirmación de Continuación (`switch`)**:
  - Dentro del bucle `do-while`, se utiliza un `switch` para manejar la respuesta del usuario sobre si desea continuar
    con la operación actual o cambiarla.

## Calculadora IV

**Estructuras de Control Utilizadas: `switch`, `for`, `if-else`**

- **Selección de Operación (`switch`)**:
  - Un `switch` permite al usuario seleccionar la operación matemática que desea realizar.

- **Confirmación de Continuación (`if-else`)**:
  - Después de seleccionar la operación, el programa pregunta al usuario si desea continuar. Dependiendo de
    la respuesta, se puede cambiar la operación o regresar al menú.

- **Ejecución de la Operación (`for`)**:
  - Un bucle `for` se usa para permitir la ejecución de la operación elegida solo una vez antes de volver a solicitar la
    entrada del usuario.

## Manejo de Errores

El programa maneja varios tipos de errores, incluyendo:

- **Entrada no válida**: Se asegura de que el usuario ingrese números válidos y muestra mensajes de error si se detectan
  entradas no válidas.
- **División por cero**: Se verifica antes de realizar la división y se informa al usuario si la operación no es
  permitida debido a una división por cero.

---