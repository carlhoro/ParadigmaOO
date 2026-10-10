"""
Resumen: Funciones recursivas en Python

Una funcion recursiva es aquella que se llama a si misma para resolver un
problema dividiendolo en subproblemas mas pequenos. Toda funcion recursiva
necesita:
  1. Caso base: condicion que detiene la recursion.
  2. Caso recursivo: llamada a si misma con un problema mas pequeno.

Ventajas: codigo claro para problemas naturalmente recursivos (arboles,
divide y venceras, factorial, Fibonacci).
Desventajas: consume pila de llamadas; Python limita la profundidad
(por defecto ~1000, ver sys.getrecursionlimit()) y lanza RecursionError.

Fuentes:
  - https://docs.python.org/3/library/sys.html#sys.setrecursionlimit
  - https://es.wikipedia.org/wiki/Recursi%C3%B3n_(ciencias_de_la_computaci%C3%B3n)
"""


def factorial(n: int) -> int:
    if n <= 1:  # caso base
        return 1
    return n * factorial(n - 1)  # caso recursivo


def fibonacci(n: int) -> int:
    if n < 2:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


def suma_lista(lista: list) -> int:
    if not lista:
        return 0
    return lista[0] + suma_lista(lista[1:])


def invertir(texto: str) -> str:
    if len(texto) <= 1:
        return texto
    return invertir(texto[1:]) + texto[0]


if __name__ == "__main__":
    print(factorial(5))              # 120
    print(fibonacci(10))             # 55
    print(suma_lista([1, 2, 3, 4]))  # 10
    print(invertir("hola"))          # aloh
