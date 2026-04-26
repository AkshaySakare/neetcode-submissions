class Solution {


    fun found(board: Array<CharArray>,i:Int ,j:Int , arr: CharArray,idx:Int):Boolean{
if(idx==arr.size){
    return true
}

if(i<0||i>=board.size ||j<0||j>=board[0].size||board[i][j]!=arr[idx]){

    return false
}

val ch = board[i][j]
board[i][j]='*'
val result =found(board,i+1,j,arr,idx+1)||
found(board,i-1,j,arr,idx+1)||
found(board,i,j+1,arr,idx+1)||
found(board,i,j-1,arr,idx+1)

board[i][j]=ch
return result    }
    fun exist(board: Array<CharArray>, word: String): Boolean {
 val rows = board.size
    val cols = board[0].size
    val wordArr = word.toCharArray()
for(i in 0 until rows){
    for(j in 0 until cols){
        if(board[i][j]== wordArr[0]&& found(board,i,j,wordArr,0)){
            return true
        } 
    }
}
return false
    }
}
