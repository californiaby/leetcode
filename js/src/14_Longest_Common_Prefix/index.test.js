let solution = require('./index.js');

test('yes', () => {
  expect(solution(['flower', 'flow', 'flight'])).toEqual('fl');
});

test('nope', () => {
  expect(solution(['dog', 'racecar', 'car'])).toEqual('');
});

test('first', () => {
  expect(solution(['apple', 'adam'])).toEqual('a');
});

test('one letter', () => {
  expect(solution(['apple', 'a'])).toEqual('a');
});

test('one letter first', () => {
  expect(solution(['a', 'apple'])).toEqual('a');
});

test('abb, abc', () => {
  expect(solution(['abb', 'abc'])).toEqual('ab');
});

test('empty array', () => {
  expect(solution([])).toEqual('');
});

test('undefined', () => {
  expect(solution([])).toEqual('');
});
