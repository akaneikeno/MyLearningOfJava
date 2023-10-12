# Java Arraylist - level: Easy, language: Java
> Java Arraylist in Hackerrank (https://www.hackerrank.com/challenges/java-arraylist/problem).


## Description of the problem
Sometimes it's better to use dynamic size arrays.
Java's Arraylist can provide you this feature.
Try to solve this problem using Arraylist.

You are given n lines.
In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.

### Imput Format
The first line has an integer n.
In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries.
Each query will consist of two integers x and y.

### Constraints
* 1 ≦ n ≦ 20000
* 0 ≦ d ≦ 50000
* 1 ≦ q ≦ 1000
* 1 ≦ x ≦ n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.

### Output Format
In each line, output the number located in yth position of xth line.
If there is no such position, just print "ERROR!"

### Sample Input
> 5
> 5 41 77 74 22 44
> 1 12
> 4 37 34 36 52
> 0
> 3 20 22 33
> 5
> 1 3
> 3 4
> 3 1
> 4 3
> 5 5

### Sample Output
> 74
> 52
> 37
> ERROR!
> ERROR!

### Explanation
The diagram below explains the queries:

5
line1: 5items=[41, 77, 74, 22, 44]
line2: 1item =[12]
line3: 4items=[37, 34, 36, 52]
line4: 0items=[]
line5: 3items=[20, 22, 33]

        1  2  3  4  5
       ―― ―― ―― ―― ――
line1 │41│77│74│22│44|
       ―― ―― ―― ―― ――
line2 │12│
       ―― ―― ―― ――
line3 │37│34│36│52|
       ―― ―― ―― ――
line4 
       ―― ―― ――
line5 │20│22│33|
       ―― ―― ――

5
> (line1, 3) = 74
> (line3, 4) = 52
> (line3, 1) = 37
> (line4, 3) = nothing ⇒ ERROR!
> (line5, 5) = nothing ⇒ ERROR!