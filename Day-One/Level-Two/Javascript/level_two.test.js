const { get_duplicate, push_zero } = require("./level_two") 

test("test that funtion returns a new array of onlyb the dupliates", ()=> {

    let array = [1, 2, 3, 2, 4, 3]
    let actual = get_duplicate(array)
    let expected = [ 2, 3 ]
    
    expect(actual).toEqual(expected)
})

test("test that array is osrted and zeros are puahed to the left", ()=> {

    let array = [5, 0 , 3, 0, 2, 0]
    let expected =  [5, 3 , 2 , 0, 0 , 0]
    let actual = push_zero(array)
    
    expect(actual).toEqual(expected)

})
