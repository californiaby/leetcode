'use strict';

let reverseWord = function(word) {
  let rev = '';
  for (let i = word.length - 1; i >= 0; i--) {
    rev += word[i];
  }
  return rev;
};

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

module.exports = (s) => solution(s);
