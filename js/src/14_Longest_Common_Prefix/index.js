'use strict';

// Vertical scanning
// leet
// lee
// lead
// ^^x- - scans up to 'x'
let solution = function(arr) {
  if (arr.length === 1) { return arr[0]; }
  if (arr.length === 0) { return ''; }

  for (let i = 0; i < arr[0].length; i++) {
    let c = arr[0][i];

    for (let j = 1; j < arr.length; j++) {
      if (arr[j].length === i || arr[j][i] !== c) {
        return arr[0].substring(0, i);
      }
    }
  }

  return arr[0];
};

// Divide and conquer
// Split array into two parts
// For each part repeat until part consists of 1 || 2 strings
// Find common prefix for each paur
// >> If pair === 1 string >> return string
// >> If pair === 2 strings >> iterate char by char
// >> >> if not matching > return substring, otherwise return substring(0, min)
// O(S) where S is m * n. In best case - shortest string * num of strings
let divideAndConquer = function(arr) {
  if (arr.length === 0) { return ''; }
  return longestCommonPrefix(arr, 0, arr.length - 1);
};

let longestCommonPrefix = function(arr, l, r) {
  if (l === r) {
    return arr[l];
  } else {
    let mid = parseInt((l + r) / 2);
    let lcpLeft = longestCommonPrefix(arr, l, mid);
    let lcpRight = longestCommonPrefix(arr, mid + 1, r);

    return commonPrefix(lcpLeft, lcpRight);
  }
};

let commonPrefix = function(left, right) {
 let min = Math.min(left.length, right.length);

  for (let i = 0; i < min; i++) {
    if (left[i] !== right[i]) {
      return left.substring(0, i);
    }
  }

  return left.substring(0, min);
};

// TODO: Binary search

module.exports = (arr) => divideAndConquer(arr);
