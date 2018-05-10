'use strict';

let solution = function(nums, target) {
  let map = new Map();
  let ans = [];

  for (let i = 0; i < nums.length; i++) {
    if (map.get(nums[i]) !== undefined) {
      ans[0] = map.get(nums[i]);
      ans[1] = i;
      break;
    } else {
      map.set(target - nums[i], i);
    }
  }
  return ans;
};

module.exports = (nums, target) => solution(nums, target);
