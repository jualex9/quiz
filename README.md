Un número amigo es aquel que tiene exactamente dos divisores distintos diferentes de 1 y él mismo. Por ejemplo, 6 es un número amigo porque sus únicos divisores son 2 y 3. Escribe un programa que:
Solicite al usuario un rango de números (inicio y fin)
Encuentre todos los números amigos dentro de ese rango
Para cada número amigo encontrado, muestre también sus divisores

analisis
Entrada del usuario el programa comienza pidiendo al usuario que ingrese dos números: uno para el inicio del rango y otro para el fin del rango. Estos dos valores definen el rango de números en el que se buscarán los "números amigos".

Búsqueda de Números Amigos programa luego recorre todos los números dentro de ese rango para cada número, verifica si tiene exactamente dos divisores distintos excluyendo el 1 y el número mismo. Este proceso es importante porque la definición utilizada en el código asume que los números amigos son aquellos con exactamente dos divisores distintos

Verificación de divisores Para determinar si un número tiene exactamente dos divisores el programa verifica los posibles divisores entre 2 y la mitad del número. Si el número tiene más de dos divisores distintos no es considerado un número amigo y el proceso continúa con el siguiente número en el rango

Impresión de números amigos Si el número tiene exactamente dos divisores se imprime el número y luego se muestran los divisores encontrados. Estos divisores son los que se utilizan para verificar si un número es amigo

Resultado Final: Al finalizar el bucle el programa muestra todos los números dentro del rango que cumplen con la condición de ser números amigos, junto con sus divisores