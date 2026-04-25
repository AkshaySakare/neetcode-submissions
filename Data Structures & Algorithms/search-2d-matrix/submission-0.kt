class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
var rows = matrix.size
var cols =  matrix[0].size

var left = 0
    var right = rows * cols - 1
    while (left <= right) {

        val mid = (left + right) / 2

        val row = mid / cols
        val col = mid % cols

        val value = matrix[row][col]

        if (value == target) {
            return true
        } else if (value < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return false
    }
}
