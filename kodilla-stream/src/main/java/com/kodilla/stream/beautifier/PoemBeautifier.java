package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String textTobeautyfy, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(textTobeautyfy);
    }

}
