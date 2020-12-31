package com.actitover.patterns.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush selection tool...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line...");
    }
}
