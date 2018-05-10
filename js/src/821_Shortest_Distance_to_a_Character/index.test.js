let solution = require('./index.js');

test('ooioooi', () => {
  expect(solution('ooioooi', 'i')).toEqual([2, 1, 0, 1, 2, 1, 0]);
});

test('one symbol', () => {
  expect(solution('a', 'a')).toEqual([0]);
});
