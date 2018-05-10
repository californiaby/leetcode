let solution = require('./index.js');

test('123', () => {
  expect(solution(123)).toEqual(321);
});

test('111', () => {
  expect(solution(111)).toEqual(111);
});

test('100', () => {
  expect(solution(100)).toEqual(1);
});

test('-25', () => {
  expect(solution(-25)).toEqual(-52);
});

test('1534236469', () => {
  expect(solution(1534236469)).toEqual(0);
});

test('1563847412', () => {
  expect(solution(1563847412)).toEqual(0);
});

