# Static Methods

## Example 1

**What is the output?**

`example.java`
```java
public class Strange {
    public static void main(String[] args) {
        first();
        third();
        second();
        third();
    }

    public static void first() {
        System.out.println("Inside first method.");
    }

    public static void second() {
        System.out.println("Inside second method.");
        first();
    }

    public static void third() {
        first();
        second();
        System.out.println("Inside third method.");
    }
}
```
-
**OUTPUT**
```
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method. 
Inside second method.
Inside first method.
Inside first method.
Inside second method.
Inside first method.
Inside third method.
```


