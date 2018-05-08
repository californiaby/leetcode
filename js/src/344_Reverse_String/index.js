'use strict';

let solution = function(s) {
  if (!s) {
    return '';
  }
  let rev = '';

  for (let i = s.length - 1; i >= 0; i--) {
    rev += s[i];
  }
  return rev;
};

// alternative - slower but better readability:
// return s.split('').reverse().join('');

module.exports = (s) => solution(s);
