'use strict';

/*
Given a List of words, return the words that can be typed using letters of alphabet on only one
row's of American keyboard like the image below.
1. You may use one character in the keyboard more than once.
2. You may assume the input string will only contain letters of alphabet.
*/

/*
Solution: store letters in data structure that allows quick access.
Set: O(n) to search, O(n) to insert
HashTable: O(1) to search, O(1) to insert
*/

let solution = function(words) {
  let map = new Map()
  .set('q', 1)
  .set('w', 1)
  .set('e', 1)
  .set('r', 1)
  .set('t', 1)
  .set('y', 1)
  .set('u', 1)
  .set('i', 1)
  .set('o', 1)
  .set('p', 1)
  .set('a', 2)
  .set('s', 2)
  .set('d', 2)
  .set('f', 2)
  .set('g', 2)
  .set('h', 2)
  .set('j', 2)
  .set('k', 2)
  .set('l', 2)
  .set('z', 3)
  .set('x', 3)
  .set('c', 3)
  .set('v', 3)
  .set('b', 3)
  .set('n', 3)
  .set('m', 3);
  let matchingWords = [];

  words.forEach((word) => {
    let expRow;
    let isOk = true;
    let i = 0;

    // Check if word isn't empty string
    if (word.length === 0) {
      isOk = false;
    }

    // Check if end of word isn't achieved and if new row isn't used
    while (i < word.length && isOk) {
      let letter = word[i].toLowerCase();

      if (!expRow) {
        expRow = map.get(letter);
      } else {
        if (map.get(letter) !== expRow) {
          isOk = false;
        }
      }

      i++;
    }

    if (isOk) {
      matchingWords.push(word);
      // or if required to modify in place > words.splice(index, 1).
      // go with traditional for loop in this case
    }
  });

  return matchingWords;
};

module.exports = (words) => solution(words);
