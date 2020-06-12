### Custom Separators - Allot the add method to handle a different delimiter.

#### To change the delimiter, the beginning of the line will look like

`//[delimiter]\n[numbers]`

- "//;\n1;2" should return "3"
- "//|\n1|2|3" should return "6"
- "//sep\n2sep3" should return "5"
- "//|\n1|2,3" is invalid and should return the message "'|' expected but ',' found at position 3."

