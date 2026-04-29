/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
var count = 0
var temp = head
while(temp!=null){
    count++
    temp = temp.next
}
var step = count - n
if(step == 0){
    return head?.next
}
temp = head
 for (i in 1 until step) {
            temp = temp?.next
        }
 temp?.next = temp?.next?.next 
  
 return head
    }
    
}
