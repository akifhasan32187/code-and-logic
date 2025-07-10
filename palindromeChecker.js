function isPalindrome(word) {
    const lower = word.toLowerCase();
    return lower === lower.split('').reverse().join('');
}

const testWords = ["madam", "Sir", "racecar", "Level", "hello"];
for (const word of testWords) {
    console.log(`${word} - ${isPalindrome(word)}`);
}
