'use strict';

/* eslint-disable no-unused-vars */

let reverseWord = function(word) {
  let rev = '';
  for (let i = word.length - 1; i >= 0; i--) {
    rev += word[i];
    // String is immutable in JS, implement StringBuilder instead
  }
  return rev;
};

// First solution - split / reverse / join
let solution = function(s) {
  if (!s) {
    return '';
  }

  return s
  .split(' ')
  .map((word) => {
    return reverseWord(word);
  })
  .join(' ');
};

// alternative - slooow
let solutionTwo = function(s) {
  if (!s) {
    return '';
  }

  return s
  .split(' ')
  .map((word) => {
    return word.split('').reverse().join('');
  })
  .join(' ');
};

module.exports = (s) => solutionTwo(s);
