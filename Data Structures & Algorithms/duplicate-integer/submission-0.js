class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let map={}

        for(let i of nums){

            if(!map[i]){
               map[i]=1
            }else{
                map[i]++
            }
        }

let count;
        for(let key in map){
            if(map[key]>=2){
                console.log(map[key])
                return true
               
            }else{
               count=map[key]
            }
        }
        return count>=2?true:false
    }
}