# hello_world

兩個從終端機讀取數字的小程式：Java 計算階乘，Python 檢查數字是否落在 1 到 10，並印出 0 到該數。

## Java

讀入一個整數，印出它的階乘。負數會被拒絕。結果用 `BigInteger`，所以大數字不會溢位。

```bash
javac hello_world.java
java hello_world
```

```text
Enter a number: 5
5! = 120
```

## Python

先印出 `hello world`，再讀入一個整數。數字在 1 到 10 之間印 `Valid number`，否則印 `Invalid number`，最後印出 0 到該數。

```bash
python3 hello.py
```

```text
hello world
Enter a number: 3
Valid number
0
1
2
3
```

需要 Python 3。
