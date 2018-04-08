package com.aldes.jcsqtj;

import com.aldes.jcsqtj.core.JCSQtJ_Window;
import com.aldes.jcsqtj.examples.MyWidget;
import com.aldes.jcsqtj.util.JCSQtJ_Util;
import com.trolltech.qt.gui.QCheckBox;
import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QProgressBar;
import com.trolltech.qt.gui.QTextEdit;

/**
 * $File: ProgramMain.java $
 * $Date: 2017-03-27 16:04:58 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */


/**
 * @class ProgramMain
 * @brief Test Program Entry.
 */
public class ProgramMain {
    
    public static QLabel label = null;
    public static int frameCount = 1;
    
    public static boolean PROGRAM_END = false;
    
    public ProgramMain() {

    }

    /**
     * @func SayHello
     * @brief Function pointer to say hello.
     */
    public void SayHello() {
        System.out.println("Hello!");
    }
    
    public void previousFrame() {
        frameCount--;
        
        JCSQtJ_Util.addImageToLabel(label, "res/" + frameCount + ".png");
    }
    
    public void nextFrame() {
        frameCount++;
        
        JCSQtJ_Util.addImageToLabel(label, "res/" + frameCount + ".png");
    }
    

    /**
     * @func main
     * @brief Program entry, testing purpose.
     * @param args : arguments vector.
     */
    public final static void main(final String[] args) {

        // create new window.
        JCSQtJ_Window window = new JCSQtJ_Window();
        window.startFrame(args);
        
        MyWidget widget = new MyWidget(null);
        
        // set my own widget.
        window.setWidget(widget);
        
        // -----------------------------------------------------

        /* Window Configuration */
        window.setWindowSize(800, 600);
        window.setWindowTitle("JCSQtJ Test Demo");
        window.setIconImage("res/icon.ico");
        
        
        ProgramMain pm = new ProgramMain();        // methods
        
        /* Button */
        window.addButtonToWindow("Previous Frame", 0, 300, pm, "previousFrame()");
        window.addButtonToWindow("Next Frame", 100, 300, pm, "nextFrame()");
        
        /* Label */
        label = window.addLabelToWindow("This is label text.", 0, 0, 320, 180);
        
        /* Image */
        JCSQtJ_Util.addImageToLabel(label, "res/0.png");
        
        /* Combo Box */
        QComboBox comboBox = window.addComboBoxToWindow(0, 400, 100, 30);
        comboBox.addItem("Hello");
        comboBox.addItem("World");
        
        /* Text Area */
        QTextEdit textArea = new QTextEdit(widget);
        textArea.move(400, 300);
        textArea.setMinimumSize(100, 30);
        textArea.setMaximumSize(300, 60);
        textArea.setEnabled(true);
        
        /* Line Field */
        QLineEdit textField = new QLineEdit(widget);
        textField.move(400, 200);
        
        /* Check Box */
        QCheckBox checkbox = window.addCheckBoxToWindow(300, 200);
        
        /* Progress Bar */
        QProgressBar pb = new QProgressBar(widget);
        pb.setValue(40);
        
        /** Test Block **/
        
        //QGraphicsView newView = new QGraphicsView(widget);
        JCSQtJ_Util.addGraphicsSceneToWidget(widget);
        
        //PainterProcess p = new PainterProcess(widget);
        //p.start();
        
        
        // -----------------------------------------------------
        window.endFrame();
        
        
        /** clean up after this line of code. **/
        PROGRAM_END = true;
    }

}
