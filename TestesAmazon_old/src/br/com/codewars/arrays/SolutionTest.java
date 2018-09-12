package br.com.codewars.arrays;

import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
  }
}