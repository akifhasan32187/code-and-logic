# Palindrome Checker in Java, Python, and JavaScript

## What is a Palindrome?

A **palindrome** is a word, phrase, number, or sequence of characters that reads the same backward as forward.  
Examples: `madam`, `racecar`, `level`.

## Mathematical Logic

Given a string `S` of length `n`, `S` is a palindrome if for every index `i` (where `0 <= i < n/2`),  
the character at position `i` is equal to the character at position `n-1-i`.

Mathematically:
```
S[i] == S[n-1-i]  for all i in [0, n/2)
```
Alternatively, you can reverse the string and check if it is equal to the original (case-insensitive).

---

## How to Run the Code from VS Code Terminal

1. **Open the folder** containing your code files in VS Code.
2. **Open the terminal** in VS Code:  
   - Use the menu: `Terminal` > `New Terminal`  
   - Or use the shortcut: <kbd>Ctrl</kbd> + <kbd>`</kbd> (backtick)

3. **Run the code using the following commands:**

- **Java:**
  ```sh
  javac PalindromeChecker.java
  java PalindromeChecker
  ```

- **Python:**
  ```sh
  python palindrome_checker.py
  ```

- **JavaScript (Node.js):**
  ```sh
  node palindromeChecker.js
  ```

---

## How to Write a Palindrome Checker

### 1. Convert the string to lowercase

This ensures the check is case-insensitive.

### 2. Reverse the string

- In Java: Use `StringBuilder`'s `reverse()` method.
- In Python: Use slicing `[::-1]`.
- In JavaScript: Use `split('')`, `reverse()`, and `join('')`.

### 3. Compare the original (lowercase) string with its reversed version

If they are equal, the word is a palindrome.

---

## Java Implementation

```java
public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String lower = word.toLowerCase();
        return lower.equals(new StringBuilder(lower).reverse().toString());
    }

    public static void main(String[] args) {
        String[] testWords = {"madam", "Sir", "racecar", "Level", "hello"};
        for (String word : testWords) {
            System.out.println(word + " - " + isPalindrome(word));
        }
    }
}
```
**How it works:**  
- Converts the word to lowercase.
- Reverses the string using `StringBuilder`.
- Compares the original and reversed strings.

---

## Python Implementation

```python
def is_palindrome(word):
    lower = word.lower()
    return lower == lower[::-1]

if __name__ == "__main__":
    test_words = ["madam", "Sir", "racecar", "Level", "hello"]
    for word in test_words:
        print(f"{word} - {is_palindrome(word)}")
```
**How it works:**  
- Converts the word to lowercase.
- Uses slicing to reverse the string.
- Compares the original and reversed strings.

---

## JavaScript Implementation

```javascript
function isPalindrome(word) {
    const lower = word.toLowerCase();
    return lower === lower.split('').reverse().join('');
}

const testWords = ["madam", "Sir", "racecar", "Level", "hello"];
for (const word of testWords) {
    console.log(`${word} - ${isPalindrome(word)}`);
}
```
**How it works:**  
- Converts the word to lowercase.
- Splits the string into an array, reverses it, and joins it back.
- Compares the original and reversed strings.

---

## Summary

All three implementations use the same mathematical logic:  
A string is a palindrome if it is equal to its reverse (case-insensitive).
