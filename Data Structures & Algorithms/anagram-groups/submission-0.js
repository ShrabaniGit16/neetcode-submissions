class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let obj={}

        strs.forEach(ele=>{
            let sortedVal=this.sortStr(ele)

            if(!obj[sortedVal]){
                obj[sortedVal]=[ele]
            }else{
                obj[sortedVal].push(ele)
            }
        })

        return Object.values(obj)
    }

    sortStr(str) {
        const sorted = str.split("").sort().join("");
        return sorted;
        console.log(sorted);
    }
}
