/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var ans =0
fun height(root: TreeNode?): Int {
        if (root == null) return 0

        val left = height(root.left)
        val right = height(root.right)

       
        ans = maxOf(ans, left + right)

       
        return 1 + maxOf(left, right)
    }

    fun diameterOfBinaryTree(root: TreeNode?): Int {
height(root)
    return ans
    }
}
