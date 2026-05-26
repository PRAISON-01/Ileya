function get_duplicate(items){

    let duplicate_list = []
    let seen_list = []
    for(let number of items){
        if( seen_list.includes(number) ){
            if(!duplicate_list.includes(number)) duplicate_list.push(number);
        }

        else{
            seen_list.push(number)
        }
    }

    return duplicate_list
}

module.exports = { get_duplicate }
 
function push_zero(items){

    let size = items.length
    let temp = []
    let tempCount = 0
    
    for(let count = 0; count < size; count++){
        if(items[count] != 0 ){
            temp[tempCount] = items[count]
            tempCount++
        }
    }

    while(tempCount < size){
        temp[tempCount++] = 0
    }

    for(let count = 0; count < size; count++){
        items[count] = temp[count]
    }
    return items
}

module.exports = { push_zero, get_duplicate}
