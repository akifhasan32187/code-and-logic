def is_palindrome(word):
    lower = word.lower()
    return lower == lower[::-1]

if __name__ == "__main__":
    test_words = ["madam", "Sir", "racecar", "Level", "hello"]
    for word in test_words:
        print(f"{word} - {is_palindrome(word)}")
