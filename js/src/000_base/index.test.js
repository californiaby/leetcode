let index = require('./index.js');

test('[1, 2, 3, 4]', () => {
  expect(index.reverseArray([1, 2, 3, 4])).toEqual([4, 3, 2, 1]);
});

test('[`how`, `are`, `you`]', () => {
  expect(index.reverseArray(['how', 'are', 'you'])).toEqual(['you', 'are', 'how']);
});
