let solution = require('./index.js');

test('hello > olleh', () => {
  expect(solution('hello')).toBe('olleh');
});

test('empty string', () => {
  expect(solution('')).toBe('');
});

test('multiple words', () => {
  expect(solution('How are you')).toBe('uoy era woH');
});

test('undefined', () => {
  expect(solution()).toBe('');
});

test('null', () => {
  expect(solution(null)).toBe('');
});
