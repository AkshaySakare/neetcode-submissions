class Solution {
    fun isPalindrome(s: String): Boolean {

val s1 = StringBuilder()
for (ch in s.toCharArray()) {
    if (ch.isLetterOrDigit()) {
        s1.append(ch.lowercaseChar())
    }
}
val rev = StringBuilder(s1.toString())
rev.reverse()
return s1.toString().equals(rev.toString())

    }
}
