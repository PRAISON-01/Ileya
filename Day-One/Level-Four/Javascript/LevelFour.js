function get_two_sum_index(array, target){
    
    let size = array.length;

    for(let index = 0; index< size; index++){
        for(let count = index + 1; count < size; count++){
            if(array[index] + array[count] == target){
                return [index, count];
            }
        }
    }
    return [];
}

module.exports = { get_two_sum_index }

function count_vowels_and_consonant(word){

    const vowels = "aeiou";
    let vowel_count = 0;
    let consonant_count = 0;

    for(let char of word){
        const lower = char.toLowerCase();

        if(/[a-z]/.test(lower)){
    
            if(vowels.includes(lower)){
                vowel_count += 1;
            }
            else{
                consonant_count += 1;
            }
        }

    }
    return [["Vowel", vowel_count],["Consonant", consonant_count]]
}

module.exports = { count_vowels_and_consonant, get_two_sum_index}

