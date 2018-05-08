let solution = require('./index.js');

test('5 > 2', () => {
  expect(solution(5)).toBe(2);
});

test('1 > 0', () => {
  expect(solution(1)).toBe(0);
});

test('9 > 6', () => {
  expect(solution(9)).toBe(6);
});
