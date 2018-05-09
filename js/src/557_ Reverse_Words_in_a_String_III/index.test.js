let solution = require('./index.js');

test('hello > olleh', () => {
  expect(solution('hello')).toBe('olleh');
});

test('empty string', () => {
  expect(solution('')).toBe('');
});

test('multiple words', () => {
  expect(solution('How are you')).toBe('woH era uoy');
});

test('undefined', () => {
  expect(solution()).toBe('');
});

test('null', () => {
  expect(solution(null)).toBe('');
});
