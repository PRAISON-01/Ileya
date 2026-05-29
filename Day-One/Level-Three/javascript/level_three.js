function flatten(array){

    let new_list = [];
    for(let element of array){
        for(let number of element){
            new_list.push(number);
        }
    }

    return new_list;
}

module.exports = { flatten }

function merge(array_one, array_two){

    let new_list = [];
    for( let element of array_one){
        new_list.push(element);
    }
    
    for( let element of array_two){
        new_list.push(element);
    }

    size = new_list.length
    for(let count = 0; count < size; count++){
        for(let index = count + 1; index < size; index++){
            if(new_list[index] < new_list[count]){
               let temp = new_list[count]
                new_list[count] = new_list[index]
                new_list[index] = temp
            }
        }
    }

    return new_list
}

module.exports = { merge, flatten}

function rotate_array(array, k){

    const size = array.length;
    
    for(let count = 0; count < k; count+=1){
        
        let last = array[size - 1]
        for(let index = size - 1; index > 0 ; index-=1){
            
            array[index] = array[index - 1];
        }
        array[0] = last;
    }
    return array;
}

module.exports = { merge, flatten, rotate_array}
