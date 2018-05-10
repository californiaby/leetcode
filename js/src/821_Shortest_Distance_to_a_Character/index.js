'use strict';

/* eslint-disable no-unused-vars */

/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
Example 1:
Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
*/

// Solution works only as it's guaranteed if char 'c' is in string 's'

let solution = function(s, c) {
  if (!s || !c) {
    return [];
  }
  let ans = [];

  let prev = Number.MIN_SAFE_INTEGER;

  // iterate through array from the beginning
  for (let i = 0; i < s.length; i++) {
    if (s[i] === c) {
      prev = i;
    }
    ans[i] = i - prev;
  }

  prev = Number.MAX_SAFE_INTEGER;

  // iterate through array from the end
  for (let i = s.length - 1; i >= 0; i--) {
    if (s[i] === c) {
      prev = i;
    }
    ans[i] = Math.min(ans[i], prev - i);
  }

  return ans;
};

module.exports = (s, c) => solution(s, c);
