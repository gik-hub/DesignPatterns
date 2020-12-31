package com.actitover.patterns.memento;

// Originator
public class Editor {

    private String content;

    public EditorState crateState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
