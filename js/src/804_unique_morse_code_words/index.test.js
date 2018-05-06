let count = require('./index.js');

test('two unique', () => {
  let words = ['abc', 'zxc'];
  expect(count(words)).toBe(2);
});

test('two matching', () => {
  let words = ['gin', 'zen', 'gig', 'msg'];
  expect(count(words)).toBe(2);
});
