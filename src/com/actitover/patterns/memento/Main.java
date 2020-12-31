package com.actitover.patterns.memento;
// commonly used to implement the undo feature

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("qwerty");
        history.push(editor.crateState());
        editor.setContent("content 2");
        history.push(editor.crateState());
        editor.setContent("content 3");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
