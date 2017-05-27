package com.aldes.jcsqtj.examples;

import com.aldes.jcsqtj.ProgramMain;
import com.trolltech.qt.core.QTimer;
import com.trolltech.qt.gui.QImage;
import com.trolltech.qt.gui.QPaintEvent;
import com.trolltech.qt.gui.QPainter;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QWidget;

/**
 * $File: MyWidget.java $
 * $Date: 2017-03-29 00:27:41 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */


/**
 * Example Qt Widget class. 
 */
public class MyWidget extends QWidget {
    
    private QPainter painter = null;
    
    private int FPS = 25;
    
    private int counter = 0;
    
    private QTimer timer = null;
    
    public MyWidget(QWidget parent) {
        super(parent);
        
        timer = new QTimer(this);
        
        timer.timeout.connect(this, "updatePicture()");
        timer.start(1000 / FPS);
    }
    
    
    @Override
    protected void paintEvent(QPaintEvent event) {
//        painter = new QPainter(this);
//        QImage image = new QImage("res/" + counter + ".png");
//        painter.drawImage(new QRectF(350, 0, 320, 180), image);
//        
//        counter++;
    }
    
    public void updatePicture() {
        
        QImage img = new QImage("res/" + counter + ".png");
        
        QPixmap pix = QPixmap.fromImage(img);
        
        if (ProgramMain.label == null)
            return;
        
        ProgramMain.label.setPixmap(pix);
        
        counter++;
    }
    
}
