#include <iostream>

int factorial(int n) {
    if (n == 0 || n == 1) { // Caso base: el factorial de 0 o 1 es 1
        return 1;
    } else {
        // Caso recursivo: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
}

int main() {
    int num = 5;
    int resultado = factorial(num);
    std::cout << "El factorial de " << num << " es: " << resultado << std::endl;
    return 0;
}

// https://www.luisllamas.es/programacion-funciones-recursivas/