function get_split_array(items){

    let even_list = []
    let odd_list = []
    for(let number of items){
        if (number % 2 == 0){
            even_list.push(number)
        }
        else{
            odd_list.push(number)
        }
    }

    let new_list = [odd_list, even_list]
    return new_list
}


function is_palindrome(items){

    reverse = []
    reverse_count = 0
    for(let count = 0; count < items.length; count+= 1){
        reverse[reverse_count] = items[count]
    }

    let index = 0
    for(let number of reverse){
        if( items[index] == reverse[index]){
            return true
        }
    }
    return false
}

function get_perfectsquare(items){

    let new_list = []

    for( let number of items){
        let root = Math.sqrt(number)
            if(root * root == number){
                new_list.push(number)
            }
    }
    return new_list
}

function replace_non_perfect_square(items){

    let new_list = []
    for(let number of items){
        let root = Math.sqrt(number)
            if(root * root == number){
                new_list.push(number)
            }
            else{
                new_list.push(-1)
            }
    }
    return new_list;
}



module.exports = { get_split_array, is_palindrome, get_perfectsquare, replace_non_perfect_square }

