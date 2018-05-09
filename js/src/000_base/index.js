'use strict';

/**
 * Reverses array using swap loop. O(n) time and space complexity.
 * @param {*[]} arr array to be reversed
 * @return {*[]} reversed array
 */
function reverseArray(arr) {
  let arrLen = arr.length;
  for (let i = 0; i < arrLen / 2; i++) {
    let right = arrLen - i - 1;
    let temp = arr[i];
    arr[i] = arr[right];
    arr[right] = temp;
  }
  return arr;
}

module.exports = {
  reverseArray,
};
