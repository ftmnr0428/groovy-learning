List nums = [1,2,3,4,5,6,7,8,9]
nums.class
//add, remove, get, clear
//add
nums.push(99)
//overwrite
nums.putAt(0, 22)
nums[5] = 33

//println nums + [44,66,77]
//println nums
//remove
nums.pop()
nums.removeAt(7)
def new_list = nums - 4
println nums
println new_list
println nums[3]
println nums.getAt(0..3)
//for
for(x in nums) {
    println x
}
//flatten
nums2 = [4,5,3,4,2,3]
nums2 << [6,4,6]
nums2 << [2,6,4]
println nums2.flatten()
println nums2.unique()

def number = [4,6,7,4,5,6,55,88,99,0] as SortedSet
println number
println number.class