// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, text: String, redactionChar: Char = 'X'): String {
    // If the text is empty, return the original document
    if (text.isEmpty()) return document
 // Replace the text with redaction characters
    return document.replace(text, redactionChar.toString().repeat(text.length))
}
