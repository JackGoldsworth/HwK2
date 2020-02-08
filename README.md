[![Build Status](https://api.travis-ci.org/JackGoldsworth/HwK2.svg?branch=master)](https://travis-ci.org/JackGoldsworth/HwK2)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JackGoldsworth_HwK2&metric=alert_status)](https://sonarcloud.io/dashboard?id=JackGoldsworth_HwK2)

# HwK2
A JVM scripting language that I started using [Jakub Dziworski's tutorial](http://jakubdziworski.github.io/enkel/2016/03/10/enkel_first.html). However, my language is going in a different direction than the original tutorial, so the end results will be quite different. The goal of this language is not to be used, but for me to learn from.

## What can be done:
- [x] Create variables with values and references.
- [x] Do basic math. (add, subtract, divide, and multiply).
- [x] Print using variables and values.
- [ ] Functions.
- [ ] Loops.
- [ ] Control statements.

## Goal:
This is up for change, but this is currently how I would like the language to look when I decide to stop working on it.
```kotlin
var test = 4
var arrTest = String<5>

fn add(int: x, int: y) -> int {
    ret x + y
}

var total = add(test, 3)
arrTest<0> = total.toStr()

print(total)

for(i in [0, 4]) {
    print(arrTest<i>)
}
```

## Current Example
```kotlin
var test = 5
var test1 = 5 * test + 3
print(test1)
testFunc

fn testFunc -> String {
    var thing = "Hello, World"
    print(thing)
    ret thing
}
```
Which compiles down to:
```
  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=100, locals=2, args_size=1
         0: bipush        5
         2: istore_0
         3: bipush        5
         5: iload_0
         6: imul
         7: bipush        3
         9: iadd
        10: istore_1
        11: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
        14: iload_1
        15: invokevirtual #25                 // Method java/io/PrintStream.println:(I)V
        18: invokestatic  #27                 // Method testFunc:()Ljava/lang/String;
        21: return

  public static java.lang.String testFunc();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=65535, locals=65535, args_size=0
         0: ldc           #10                 // String \"Hello, World\"
         2: astore_0
         3: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
         6: aload_0
         7: invokevirtual #22                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        10: aload_0
        11: areturn
```
