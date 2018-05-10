'use strict';

/* eslint-disable no-unused-vars */

let solution = function(arr) {
  let map = new Map();

  arr.forEach((domain) => {
    // Get number and domain
    let count = parseInt( domain.split(' ')[0]);
    let path = domain.split(' ')[1];

    // Process domain, curring subdomain on every iteration
    while (path != '') {
      let current = map.get(path);

      // Check if there's already a value in the map
      if (current) {
        map.set(path, count + current);
      } else {
        map.set(path, count);
      }

      // Find a part to cut
      let p = path.indexOf('.');
      if (p > 0) {
        path = path.substring(p + 1, path.length);
      } else {
        path = '';
      }
    }
  });

  let ans = [];

  map.forEach((value, key) => {
    ans.push(`${value} ${key}`);
  });

  return ans;
};

module.exports = (arr) => solution(arr);
