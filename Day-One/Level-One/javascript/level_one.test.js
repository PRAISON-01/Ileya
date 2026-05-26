const { get_split_array, is_palindrome, get_perfectsquare, replace_non_perfect_square } = require('./level_one'); 

test("test that function splits an array into a 2d array of even add odd", ()=> {
    let items = [45, 60, 3, 10, 9, 22]
    let expected = [[45, 3 , 9] , [60 , 10, 22 ]]
    let actual = get_split_array(items)
    
    expect(actual).toEqual(expected)
})

test("test that funtion returns false if collection is not a palindrome", ()=> {

    let array = [4, 7, 9, 10, 49, 6]
    let actual = is_palindrome(array)
    
    expect(actual).toBe(false)
})

test("test that funtion returns true if collection is a palindrome", ()=> {

    let array = [45, 0, 8, 0, 45]
    let actual = is_palindrome(array)
    
    expect(actual).toBe(true)
})

test("test that funtion returns a new array of only perfect sqaure", ()=> {

    let array = [4, 7, 9, 10, 16, 18]
    let actual = get_perfectsquare(array)
    let expected = [ 4, 9, 16 ]
    
    expect(actual).toEqual(expected)
})

test("test that non perfect squares are replaced with - 1", ()=> {

    let array = [4, 7, 9, 10, 49, 6]
    let expected = [ 4, -1, 9, -1, 49, -1 ]
    let actual = replace_non_perfect_square(array)
    
    expect(actual).toEqual(expected)
})
