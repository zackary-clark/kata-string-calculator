package string.calculator;

class NumberExpectedException extends Exception {
    NumberExpectedException(String characterFound, Integer position) {
        super("Number expected but '" + characterFound + "' found at position " + position);
    }
}
