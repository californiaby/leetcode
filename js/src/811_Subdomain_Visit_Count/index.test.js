let solution = require('./index.js');

test('lots', () => {
  let ans = solution(['900 google.mail.com', '50 yahoo.com', '1 intel.mail.com', '5 wiki.org']);
  let exp = ['901 mail.com', '50 yahoo.com', '900 google.mail.com', '5 wiki.org', '5 org', '1 intel.mail.com', '951 com'];

  expect(ans).toEqual(exp);
});
