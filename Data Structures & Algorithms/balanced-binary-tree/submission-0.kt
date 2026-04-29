/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
fun height(root: TreeNode?):Int{
    if(root == null) return 0
var leftH = height(root?.left)
var rightH = height(root?.right)
if(leftH==-1||rightH==-1){
    return -1
}
if(abs(leftH-rightH)>1){
return -1
}
return 1+max(leftH,rightH)
}

    fun isBalanced(root: TreeNode?): Boolean {
var result =height(root)
return (result!=-1)
    }
}
