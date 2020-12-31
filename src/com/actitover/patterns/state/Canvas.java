package com.actitover.patterns.state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
//        if (currentTool == ToolType.SELECTION)
//            System.out.println("Selection icon...");
//        else if (currentTool == ToolType. BRUSH)
//            System.out.println("Brush Icon...");
//        else if (currentTool == ToolType.ERASER)
//            System.out.println("Brush icon...");
    }

    public void mouseUp(){
        currentTool.mouseUp();
//        if (currentTool == ToolType.SELECTION)
//            System.out.println("Draw dashed rectangle...");
//        else if (currentTool == ToolType. BRUSH)
//            System.out.println("Draw line...");
//        else if (currentTool == ToolType.ERASER)
//            System.out.println("Erase something...");

    }


    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
