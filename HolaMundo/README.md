# JAVA

## Strings

Los strings son secuencias de caracteres. En Java, los strings se representan mediante la clase `String`. Un string es
inmutable, lo que significa que una vez creado, no se puede modificar. Sin embargo, se pueden realizar diversas
operaciones con strings utilizando los métodos proporcionados por la clase `String`.

Además son variables de referencia, lo que significa que almacenan la dirección de memoria donde se encuentra el valor
del string. Cuando se asigna un string a una variable, en realidad se está asignando la referencia al objeto string en
memoria. Por tanto, si se asigna un string a otra variable, ambas variables apuntarán al mismo objeto en memoria. Por
ejemplo:

```java
String str1 = "Hola";
String str2 = str1; // str2 apunta al mismo objeto que str1 
```

Y para comparar el contenido de dos strings, se debe utilizar el método `equals()` en lugar del operador `==`, ya que
este último compara las referencias de los objetos, no su contenido. Por ejemplo:

```java
String str1 = "Hola";
String str2 = "Hola";

// Comparar usando el operador '=='
boolean sonIgualesReferencia = (str1 == str2); // sonIgualesReferencia será true, ya que ambos apuntan al mismo objeto en memoria

boolean sonIguales = str1.equals(str2); // sonIguales será true
```

### Concatenación de Strings

La concatenación de strings se puede realizar utilizando el operador `+` o el método `concat()`. Por ejemplo:

```java
String str1 = "Hola";
String str2 = "Mundo";

// Usando el operador '+'
String resultado1 = str1 + " " + str2; // resultado1 será "Hola Mundo"
// Usando el método 'concat()'
String resultado2 = str1.concat(" ").concat(str2); // resultado2 también será "Hola Mundo"
```

#### Prescedencia en la concatenación

Al concatenar strings con otros tipos de datos, es importante tener en cuenta la precedencia de los operadores. Si
concatenamos un string con un número, el número se convertirá automáticamente a string. Por ejemplo:

```java
String str = "El número es: ";
int numero = 42;
String resultado = str + numero; // resultado será "El número es: 42"
```

Pero si se utiliza el operador `+` con números antes de concatenar con un string, se realizará la suma de los números
antes de la concatenación. Por ejemplo:

```java
String str = "El resultado es: ";
int num1 = 10;
int num2 = 20;
String resultado = str + num1 + num2; // resultado será "El resultado es: 1020" porque num1 y num2 se concatenan como strings después de la concatenación
```

En este caso, `num1` y `num2` se concatenan como strings después de la concatenación con `str`, lo que resulta en "El
resultado es: 1020". Para obtener el resultado correcto de la suma, se debe usar paréntesis para asegurar la precedencia
correcta:

```java
String str = "El resultado es: ";
int num1 = 10;
int num2 = 20;
String resultado = str + (num1 + num2); // resultado será "El resultado es: 30" porque num1 y num2 se suman antes de la concatenación
```

En este caso, `num1` y `num2` se suman antes de la concatenación con `str`, lo que resulta en "El resultado es: 30".

### Inmutabilidad

La inmutabilidad de los String en Java significa que una vez que se crea un objeto String, su contenido no puede
cambiar.

```java
String texto = "Hola";
texto =texto +" mundo";
```

No estás modificando el mismo objeto. En realidad:

1. Se crea un String con valor "Hola"
2. Luego se crea otro nuevo String con valor "Hola mundo"
3. La variable texto ahora apunta al nuevo objeto

¿Por qué los String son inmutables?

Java lo diseñó así por varias razones importantes:

1. Seguridad

   Los String se usan en cosas sensibles como:

    - conexiones a base de datos
    - rutas de archivos
    - URLs

   Si fueran mutables, podrían ser alterados fácilmente.

2. Performance (String Pool)

   Java usa un String Pool (pool de cadenas):
   ```java
   String x = "Hola";
   String y = "Hola";
   ```
   Ambos apuntan al mismo objeto en memoria

   Esto ahorra memoria, y solo es posible porque los String no cambian.