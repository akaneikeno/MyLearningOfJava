# Java BigDecimal - level: Medium, language: Java
> Java BigDecimal in Hackerrank (https://www.hackerrank.com/challenges/java-bigdecimal/problem).


## Description of the problem
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.
Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1.
If two numbers represent numerically equivalent values (e.g., .1≡0.1), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below.
You must rearrange array s's elements according to the instructions above.

### Imput Format
he first line consists of a single integer, n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of s.

### Constraints
* 0 ≦ n ≦ 200
* Each s has at most 300 digits.

### Output Format
Locked stub code in the editor will print the contents of array s to stdout.
You are only responsible for reordering the array's elements.

### Sample Input
> 9
> -100
> 50
> 0
> 56.6
> 90
> 0.12
> .12
> 02.34
> 000.000

### Sample Output
> 90
> 56.6
> 50
> 02.34
> 0.12
> .12
> 0
> 000.000
> -100