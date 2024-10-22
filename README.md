# Harmonic Sum Calculator

## Overview

This Java program calculates the **harmonic sum** of a given number `n`. A harmonic sum is the sum of the reciprocals of the first `n` positive integers. The user is prompted to enter a number `n`, and the program calculates the harmonic sum using a loop.

## How It Works

- The user is prompted to enter the value of `n`.
- The program initializes a variable (`harmonikToplam`) to store the harmonic sum, starting at `0`.
- A `for` loop runs from `1` to `n`, adding `1/i` to `harmonikToplam` in each iteration.
- Finally, the harmonic sum is printed to the console.

The harmonic sum formula is as follows:

**H(n) = 1 + 1/2 + 1/3 + ... + 1/n**

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter a value for `n` when prompted, and the program will calculate and display the harmonic sum.

## Example Output

```
n sayisini giriniz:
5
Harmonik toplam: 2.283333333333333
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.



