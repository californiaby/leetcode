let solution = require('./index.js');

test('["Hello", "Alaska", "Dad", "Peace"]', () => {
  expect(solution(['Hello', 'Alaska', 'Dad', 'Peace'])).toEqual(['Alaska', 'Dad']);
});

test('["Hello"]', () => {
  expect(solution(['Hello'])).toEqual([]);
});

test('One letter', () => {
  expect(solution(['q', 'a', 'z'])).toEqual(['q', 'a', 'z']);
});

test('One letter', () => {
  expect(solution(['q', 'a', 'z', ''])).toEqual(['q', 'a', 'z']);
});
