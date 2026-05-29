//LevelFour.test.js
const { get_two_sum_index, count_vowels_and_consonant } = require("./LevelFour");

test(" test that the get_two_sum_index returns a new array of the two numbers that makes up the sum of the target", ()=> {

    let array = [2, 7, 9, 11, 15];
    let target = 9;
    let actual = get_two_sum_index(array, target);
    let expected = [0, 1];

    expect(actual).toEqual(expected);
})

test("ttest  that count_vowels_and_consonant returns the vount of vowel adconsonant in a collection", ()=> {

    let text = "Hello World";
    let actual = count_vowels_and_consonant(text);
    let expected = [["Vowel", 3],["Consonant", 7]]

    expect(actual).toEqual(expected)
})
