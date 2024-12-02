# Ejercicio -> Dividir sin dividir ni multiplicar

Este codigo realiza una division sin usar las operaciones tradicionales de division (`/`) ni multiplicacion (`*`).
La division se implementa usando restas sucesivas y un contador.

### **1. Variables iniciales**

```java
int dividendo = 31;
int divisor = 5;
```

Se definen el **dividendo** y el **divisor**. En este caso, queremos dividir 31 entre 5.

### **2. Metodos principales**
El programa usa dos metodos: 
- `getCociente2` para calcular el cociente.
- `getResiduo2` para calcular el residuo.

#### **a. Metodo `getCociente2`**

```java
private static int getCociente2(int dividC, int divisC) {
    int coci = 0;

    while(dividC >= divisC) {
        dividC -= divisC;
        coci++;
    }

    return coci;
}
```

**Funcionamiento:**

1. Recibe como parametros el dividendo (`dividC`) y el divisor (`divisC`).
2. Inicializa el cociente (`coci`) en 0.
3. Usa un bucle `while` que se ejecuta mientras el **dividendo** sea mayor o igual al **divisor**. En cada iteracion:
    - Se resta el divisor del dividendo: `dividC -= divisC`.
    - Se incrementa el cociente (`coci++`).
4. Cuando el dividendo es menor que el divisor, el bucle termina y retorna el valor de `coci`.

#### **b. Metodo `getResiduo2`**

```java
private static int getResiduo2(int dividR, int divisR) {
    int resi = 0;

    while(dividR >= divisR) {
        dividR -= divisR;
        resi = dividR;
    }

    return resi;
}
```

**Funcionamiento:**

1. Recibe como parametros el dividendo (`dividR`) y el divisor (`divisR`).
2. Inicializa el residuo (`resi`) en 0.
3. Usa un bucle `while` similar al anterior.
   - En cada iteracion:
     - Se resta el divisor del dividendo: `dividR -= divisR`.
     - Actualiza el residuo (`resi = dividR`).
4. Cuando el dividendo es menor que el divisor, el bucle termina y retorna el residuo final.

**Ejemplo:**
Para dividir 31 entre 5:
- Ultima iteracion del bucle: \(6 - 5 = 1\), residuo = 1.
- Resultado final: **Residuo = 1**.

### **3. Salida del programa**

```java
System.out.println("Cociente = " + cociente);
System.out.println("Residuo = " + residuo);
```

La salida muestra el cociente y el residuo calculados por los metodos:
- Cociente = 6
- Residuo = 1
