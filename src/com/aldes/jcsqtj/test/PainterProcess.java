package com.aldes.jcsqtj.test;

import com.aldes.jcsqtj.ProgramMain;
import com.trolltech.qt.QThread;
import com.trolltech.qt.gui.QPainter;
import com.trolltech.qt.gui.QWidget;

public class PainterProcess implements Runnable {
    
    private QThread process = null;
    
    private QWidget widget = null;
    
    
    public PainterProcess(QWidget widget) {
        this.widget = widget;
    }
    
    @Override
    public void run() {
        while(!ProgramMain.PROGRAM_END) {
            widget.repaint();
        }
    }
    
    
    public void start() {
        if (process != null)
            return;
        
        process = new QThread(this);
        process.start();
    }
    
}
