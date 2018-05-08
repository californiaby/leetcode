'use strict';

/**
 * Bubble sorting. Modifies array.
 * @param {*} arr to be sorted
 */
function doSort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = 0; j < arr.length - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}

let solution = function(arr) {
  doSort(arr);
  let answer = 0;

  for (let i = 0; i < arr.length; i += 2) {
    answer += arr[i];
  }
  return answer;
};

// =========

let sortReduce = function(arr) {
  return arr
  .sort((a, b) => {
    return a - b;
  })
  .reduce((sum, cur, i) => {
    return (i % 2 === 0) ? sum += cur : sum;
  });
};

module.exports = (arr) => sortReduce(arr);
