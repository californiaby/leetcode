'use strict';

let solution = function(x) {
  let head = x;
  let tail;
  let ans = 0;

  while (head != 0) {
    tail = head % 10;
    head = parseInt(head / 10);
    ans = (ans * 10) + tail;
  }

  return (Math.abs(ans) > 2147483647 ? 0 : ans);
};

module.exports = (x) => solution(x);
