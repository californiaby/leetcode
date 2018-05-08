'use strict';

/*
Simple `~num` doesn't work since JS uses 32 bits signed integers.
5 > 00000000000000000000000000000101 > 11111111111111111111111111111010 > -6
*/

let solution = function(num) {
  let bits = num.toString(2);
  let complement = '';

  for (let i = 0; i < bits.length; i++) {
    complement += (bits[i] === '0') ? '1' : '0';
  }

  return parseInt(complement, 2);
};

module.exports = (num) => solution(num);
