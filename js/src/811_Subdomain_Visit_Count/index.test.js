let solution = require('./index.js');

test('lots', () => {
  let ans = solution(['900 google.mail.com']);
  let exp = ['900 google.mail.com', '900 mail.com', '900 com'];

  expect(ans).toEqual(exp);
});
