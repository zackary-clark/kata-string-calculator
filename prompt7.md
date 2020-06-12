### Calling add with multiple errors should return all error messages separated by newlines

"-1,,2" is invalid and return the message "Negative not allowed : -1\nNumber expected but ',' found at position 3."
