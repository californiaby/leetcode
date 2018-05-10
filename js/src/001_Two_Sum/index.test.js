let solution = require('./index.js');

test('nums = [2, 7, 11, 15], target = 9', () => {
  expect(solution([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test('empty arr', () => {
  expect(solution([], 1)).toEqual([]);
});
