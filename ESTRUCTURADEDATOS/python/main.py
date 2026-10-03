# Pila con list
stack = []
stack.append(1)
stack.append(2)
stack.append(3)
print("Pila:", stack)
print("Pop:", stack.pop())  # Saca el último elemento

# Cola con list
queue = []
queue.append(1)
queue.append(2)
queue.append(3)
print("Cola:", queue)
print("Dequeue:", queue.pop(0))  # Saca el primer elemento

#2️⃣ Usando collections.deque (recomendado para colas y pilas)
#deque es eficiente para inserciones y extracciones en ambos extremos.

from collections import deque

# Pila (LIFO)
stack = deque()
stack.append(1)
stack.append(2)
stack.append(3)
print("Pila:", stack)
print("Pop:", stack.pop())

# Cola (FIFO)
queue = deque()
queue.append(1)
queue.append(2)
queue.append(3)
print("Cola:", queue)
print("Dequeue:", queue.popleft())

#3️⃣ Usando queue.Queue (colas seguras para hilos) Ideal para programación concurrente.

from queue import Queue

# Cola FIFO
q = Queue()
q.put(1)
q.put(2)
q.put(3)

print("Tamaño de la cola:", q.qsize())
print("Elemento retirado:", q.get())  # Bloquea si está vacía

from queue import LifoQueue

stack = LifoQueue()
stack.put(1)
stack.put(2)
stack.put(3)

print("Tamaño de la pila:", stack.qsize())
print("Elemento retirado:", stack.get())