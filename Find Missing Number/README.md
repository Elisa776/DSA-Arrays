# Find Missing Number

## Problem Statement
Given numbers from 1 to N with one number missing, find the missing number.

## Approach
- Compute the expected sum using the formula:
  N(N+1)/2
- Compute the actual sum of array elements.
- Subtract actual sum from expected sum.

## Time Complexity
O(n)

## Space Complexity
O(n)
