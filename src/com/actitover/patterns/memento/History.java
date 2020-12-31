package com.actitover.patterns.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {
    private List<EditorState> statesHistory = new ArrayList<>();

    public void push(EditorState state) {
        statesHistory.add(state);
    }

    public EditorState pop() {
        var lastIdx = statesHistory.size() -1;
        var lastState = statesHistory.get(lastIdx);
        statesHistory.remove(lastState);
        return lastState;
    }
}
