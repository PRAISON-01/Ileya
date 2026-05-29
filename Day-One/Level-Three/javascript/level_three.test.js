const { merge, flatten, rotate_array} = require("./level_three")

test("test that function flattens array ", ()=> {

    let array = [[9, 0, 7], [3, 5, 1], [8, 1, 7], [9, 9, 6]]
    let actual = flatten(array)
    let expected = [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6]
    
    expect(actual).toEqual(expected);
})

test("test that funtion returns merged and sorted array ", ()=> {

    let array = [3, 5, 1]
    let okay = [2, 4, 6]  
    let actual = merge(array, okay)
    let expected = [ 1, 2, 3, 4, 5, 6 ]
    
    expect(actual).toEqual(expected)
})

test("test that rotate array rotate array 2 times ", ()=> {

    let array = [1, -9, 3, 0, 8]
    let index = 2
    let actual = rotate_array(array, index)
    let expected = [0, 8, 1, -9, 3]
    
    expect(actual).toEqual(expected)
})
