'use strict';

let morse = ['.-', '-...', '-.-.', '-..', '.', '..-.', '--.', '....',
'..', '.---', '-.-', '.-..', '--', '-.', '---', '.--.', '--.-', '.-.',
'...', '-', '..-', '...-', '.--', '-..-', '-.--', '--..'];

/**
 * Old school JS.
 * @param {string[]} words to be converted to morse code
 * @return {number} count of unique transformations
 */
let getTransformationsCount = function(words) {
  let set = new Set();

  for (let i = 0; i < words.length; i++) {
    let word = words[i];

    let mWord = '';
    for (let j = 0; j < word.length; j++) {
      // Get index of morse code based on diff between current letter's code and code of 'a'
      let n = word.charCodeAt(j) - 'a'.charCodeAt(0);
      mWord = mWord + morse[n];
    }
    set.add(mWord);
  }

  return set.size;
};

module.exports = (words) => getTransformationsCount(words);
