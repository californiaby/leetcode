let solution = require('./index.js');

test('basic', () => {
  expect(solution([1, 2, 3, 4])).toBe(4);
});

test('advanced', () => {
  expect(solution([2, 5, 8, 1, 9, 12])).toBe(15);
});
