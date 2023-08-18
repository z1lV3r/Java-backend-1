# Armstrong numbers

An Armstrong number is a number that the sum of its own digits each raised to the power of the number of digits is equals to the initial value.

For example:
- 9 is an Armstrong number, because 9 = 9^1 = 9
- 10 is not an Armstrong number, because 10  1^2 + 0^2 = 1
- 153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
- 154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190

Write some code to determine whether a number is an Armstrong number.

Restrictions:
- 0 < input < 1000
<div class="hint">
  The pow can be calculated multiplying the base any exponent times (n^3 = n * n * n) except with exponent 0 which result is always 1 (n^0 = 1)
</div>
