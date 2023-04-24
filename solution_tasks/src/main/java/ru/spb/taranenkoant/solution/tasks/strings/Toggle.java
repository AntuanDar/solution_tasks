package ru.spb.taranenkoant.solution.tasks.strings;

class Toggle {
    String swapCase(String text) {
        StringBuilder textSB = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 64 && text.charAt(i) < 91)
                textSB.setCharAt(i, (char) (text.charAt(i) + 32));
            else if (text.charAt(i) > 96 && text.charAt(i) < 123)
                textSB.setCharAt(i, (char) (text.charAt(i) - 32));
        }
        return textSB.toString();
    }
}
