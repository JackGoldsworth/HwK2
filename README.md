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
var test = "Hello, World"
print(test)
```
Which compiles down to:
```
public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=100, locals=1, args_size=1
         0: ldc           #8                  // String \"Hello, World\"
         2: astore_0
         3: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
         6: aload_0
         7: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        10: return
}
```
