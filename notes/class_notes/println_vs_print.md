# println vs print

## Example 1

### **Program**
```java
public static void main(String[] args) {
    System.out.print("One fish ");
    System.out.print("two fish. \n");
    System.out.println("Red Fish blue fish.");
    System.out.println("-Dr. Seuss");

}
```

### **Output**

```
One fish two fish.
Red fish blue fish.
-Dr. Seuss
```
### **Explanation**

The quotes are called string delimeters, which tells you where the string starts and ends. The `\n` is a special character that tells the computer to go to the next line. The backslash `\` is called an escape sequence. It tells the computer to treat the next character differently. In this case, the `n` is treated as a special character, not a letter. Another example of an escape sequence is if you wanted to print a quote, you would have to use `\"` instead of `"`. This is because the computer would think that the string ends at the second quote. Not every symbol requires an escape sequence. For example, the dash `-` does not require an escape sequence. 

There are two types of print statements: `print` and `println`. `print` prints the string without going to the next line. `println` prints the string and goes to the next line. A common mistake that people beleive that `println` goes to the next line, then prints the string. This is not true. `println` prints the string, then goes to the next line.

## Example 2 

### **Program**

```java
public static void main(String[] args) {
    System.out.println("\"So, these strings exist in paralell universes?\"");
    System.out.println("\t\"No, there aren't extra dimensions.\"");
    System.out.print("How to teach Relativity to your dog.");


}
```

### **Output**

```
"So, these strings exist in paralell universes?"
    "No, there aren't extra dimensions."
How to teach Relativity to your dog. 
```

## Example 3

### **Program**

```java
public static void main(String[] args) {
    System.out.print("\"Mama, Jaja doesn't need knvies,\"");
    System.out.println(" I say.");
    System.out.print("She knows Jaja always eats ");
    System.out.println("right from the flask...");
    System.out.print("Chimamanda Ngozi Adichie");
}
```

### **Output**
```
"Mama, Jaja doesn't need knvies," I say.
She knows Jaja always eats right from the flask...
Chimamanda Ngozi Adichie
```