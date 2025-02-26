# **Quadratic Equation Solver**

This project is designed to find the roots of a quadratic equation of the form *ax² + bx + c = 0*. The program can receive coefficients `a`, `b`, and `c` from the user via the console or from a file.

## **Features**

- **Two input modes**:
  - **Manual input**: The user enters the coefficients via the console.
  - **File input**: The program reads the coefficients from a specified file.

- **Error handling**:
  - Validates the correctness of the input data.
  - Displays detailed error messages.

## **Requirements**

- **Java**: Version 8 or later.

## **How to Use**

### **1. Clone the Repository**
To get started, first, clone the repository to your local machine:

```bash
git clone https://github.com/DmytroHalai/lab1-mtds.git
cd <repository-folder>
```

---

### **2. Running the Program**

#### **Manual Input via Console**
To run the program with manual coefficient input:

```bash
java Main.java
```

After launching, the program will sequentially ask for the input of coefficients `a`, `b`, and `c`.

#### **Input from a File**
To run the program with coefficients read from a file:

```bash
java Main.java <file-name>
```

where `<file-name>` is the name of the file containing the coefficients.

---

## **File Format**

- The file must contain a **single line** with **three numbers** separated by spaces.
- The order of numbers should be: `a b c`.

### **Example File (`input.txt`)**:

```
1.0 -3.5 2.0
```

This corresponds to the equation:  
*1.0x² - 3.5x + 2.0 = 0*.

---

## **Usage Example**

### **Manual Input**:

```
java Main.java
a = 1
b = -3.5
c = 2
The equation is: (1.0) x^2 + (-3.5) x + (2.0) = 0
There are 2 roots
x1 = 2.0
x2 = 1.0
```

### **File Input**:

```
java Main.java coefficients.txt
The equation is: (1.0) x^2 + (-3.5) x + (2.0) = 0
There are 2 roots
x1 = 2.0
x2 = 1.0
```

*where `coefficients.txt` contains:*

```
1.0 -3.5 2.0
```

---

## **Error Handling**

The program validates the input data and displays appropriate error messages in case of incorrect input.

### **Example**:

```
java Main.java
a = one
Error. Expected a valid real number, got "one" instead. Try again.
a = 1
b = 2
c = three
Error. Expected a valid real number, got "three" instead. Try again.
c = 3
The equation is: (1.0) x^2 + (2.0) x + (3.0) = 0
There are 0 roots
```

---

## **Author**

Developed by [Dmytro Halai](https://github.com/DmytroHalai).

---
