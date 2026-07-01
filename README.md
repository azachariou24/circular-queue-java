<div align="center">

# Circular Queue in Java

### Generic Circular Queue implementation and queue-based algorithms

**Java • Data Structures • Algorithms • Generics**

</div>

---

## Overview

This repository provides a generic implementation of a **Circular Queue (Ring Buffer)** in Java together with several classical queue-based algorithms.

The project was developed as part of my study of **Data Structures and Algorithms**, with emphasis on algorithmic correctness, clean object-oriented design, and code readability.

The implementation uses an array-based circular indexing technique, allowing efficient queue operations without shifting elements after deletions.

---

## Features

- Generic implementation using **Java Generics**
- Array-based circular queue
- Constant-time enqueue and dequeue operations
- Clean object-oriented design
- Queue visualization
- Demonstration program
- Queue-based algorithmic applications

---

## Complexity Analysis

- **enQueue()** → **O(1)**
- **deQueue()** → **O(1)**
- **top()** → **O(1)**
- **size()** → **O(1)**
- **isEmpty()** → **O(1)**
- **display()** → **O(n)**

---

## Implemented Algorithms

### Josephus Problem

Simulation of the classical Josephus elimination process using a circular queue.

### Remove Item

Removes all occurrences of a specified element while preserving the order of the remaining queue.

### Smallest Multiple Using Digits {0,9}

Computes the smallest positive multiple of a given integer that consists exclusively of the digits **0** and **9** using a queue-based breadth-first search strategy.

---

## Project Structure

```text
src/
└── datastructures/
    └── queue/
        ├── CircularQueue.java
        ├── QueueAlgorithms.java
        └── Main.java
```

---

## Running the Project

Compile

```bash
javac src/datastructures/queue/*.java
```

Run

```bash
java -cp src datastructures.queue.Main
```

---

## Educational Objectives

This project demonstrates:

- Generic programming in Java
- Implementation of Abstract Data Types (ADTs)
- Circular array indexing
- Queue-based algorithmic techniques
- Algorithm complexity analysis
- Object-oriented software design

---

## Future Improvements

Potential future extensions include:

- Dynamic queue resizing
- Iterator support
- JUnit test suite
- Javadoc documentation
- Additional queue-based algorithms
- Performance benchmarking
- Maven/Gradle support

---

## License

This project is licensed under the **MIT License**.

---

<div align="center">

**Developed by Anastasis Zachariou**

</div>