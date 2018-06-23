package com.aldes.jcsqtj.util;

import com.trolltech.qt.gui.QCheckBox;
import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QGraphicsScene;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QPlainTextEdit;
import com.trolltech.qt.gui.QProgressBar;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextCursor;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

/**
 * $File: JCSQtJ_Util.java $
 * $Date: 2017-03-27 19:19:28 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */


/**
 * @class JCSQtJ_Util
 * @brief Put all the utility here.
 */
public class JCSQtJ_Util {
    
    /**
     * @func addGraphicsSceneToWidget
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @return QGraphicsScene : graphics scene we just create.
     */
    public static QGraphicsScene addGraphicsSceneToWidget(
            QWidget widget) {
        
        QGraphicsScene newScene = new QGraphicsScene(widget);
        
        newScene.clear();
        
        return newScene;
    }
    
    /**
     * @func addLineEditToWidget
     * @brief Create a text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QLineEdit : line edit we just create.
     */
    public static QLineEdit addLineEditToWidget(
            QWidget widget,
            int x,
            int y) {
        QLineEdit newLineEdit = new QLineEdit(widget);
        
        newLineEdit.move(x, y);
        
        return newLineEdit;
    }
    
    /**
     * @func addLineEditToWidget
     * @brief Create a text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the line edit.
     * @param height : height of the line edit.
     * @return QLineEdit : line edit we just create.
     */
    public static QLineEdit addLineEditToWidget(
            QWidget widget,
            int x,
            int y,
            int width,
            int height) {
        QLineEdit newLineEdit = new QLineEdit(widget);
        
        newLineEdit.move(x, y);
        
        newLineEdit.setMinimumSize(width, height);
        newLineEdit.setMaximumSize(width, height);
        
        return newLineEdit;
    }
    
    /**
     * @func addTextEditToWidget
     * @brief Create a text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QTextEdit : text edit we just create.
     */
    public static QTextEdit addTextEditToWidget(
            QWidget widget, 
            int x,
            int y) {
        QTextEdit newTextEdit = new QTextEdit(widget);
        
        newTextEdit.move(x, y);
        
        return newTextEdit;
    }
    
    /**
     * @func addTextEditToWidget
     * @brief Create a text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the text edit.
     * @param height : height of the text edit.
     * @return QTextEdit : text edit we just create.
     */
    public static QTextEdit addTextEditToWidget(
            QWidget widget, 
            int x,
            int y,
            int width,
            int height) {
        QTextEdit newTextEdit = new QTextEdit(widget);
        
        newTextEdit.move(x, y);
        
        newTextEdit.setMinimumSize(width, height);
        newTextEdit.setMaximumSize(width, height);
        
        return newTextEdit;
    }
    
    /**
     * @func addPlainTextEditToWidget
     * @brief Create a plain text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QPlainTextEdit : text edit we just create.
     */
    public static QPlainTextEdit addPlainTextEditToWidget(
            QWidget widget, 
            int x,
            int y) {
        QPlainTextEdit newTextEdit = new QPlainTextEdit(widget);
        
        newTextEdit.move(x, y);
        
        return newTextEdit;
    }
    
    /**
     * @func addPlainTextEditToWidget
     * @brief Create a plain text edit area in the window.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the text edit.
     * @param height : height of the text edit.
     * @return QPlainTextEdit : plain text edit we just create.
     */
    public static QPlainTextEdit addPlainTextEditToWidget(
            QWidget widget, 
            int x,
            int y,
            int width,
            int height) {
        QPlainTextEdit newTextEdit = new QPlainTextEdit(widget);
        
        newTextEdit.move(x, y);
        
        newTextEdit.setMinimumSize(width, height);
        newTextEdit.setMaximumSize(width, height);
        
        return newTextEdit;
    }
    
    /**
     * @func addComboBoxToWidget
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QComboBox : combobox we just create.
     */
    public static QComboBox addComboBoxToWidget(
            QWidget widget, 
            int x,
            int y) {
        return addComboBoxToWidget(widget, x, y, 0, 0);
    }
    
    /**
     * @func addComboBoxToWidget
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QComboBox : combobox we just create.
     */
    public static QComboBox addComboBoxToWidget(
            QWidget widget, 
            int x,
            int y,
            int width,
            int height) {
        
        QComboBox newComboBox = new QComboBox(widget);
        
        newComboBox.move(x, y);
        
        newComboBox.setMinimumSize(width, height);
        newComboBox.setMaximumSize(width, height);
        
        return newComboBox;
    }
    
    /**
     * @func addCheckBoxToWidget
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QCheckBox : checkbox we just create.
     */
    public static QCheckBox addCheckBoxToWidget(
            QWidget widget, 
            int x,
            int y) {
        return addCheckBoxToWidget(widget, x, y, 0, 0);
    }
    
    /**
     * @func addCheckBoxToWidget
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QCheckBox : checkbox we just create.
     */
    public static QCheckBox addCheckBoxToWidget(
            QWidget widget, 
            int x,
            int y,
            int width,
            int height) {
        
        QCheckBox newCheckBox = new QCheckBox(widget);
        
        newCheckBox.move(x, y);
        
        newCheckBox.setMinimumSize(width, height);
        newCheckBox.setMaximumSize(width, height);
        
        return newCheckBox;
    }
    
    /**
     * @func addProgressBarToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QCheckBox : checkbox we just create.
     */
    public static QProgressBar addProgressBarToWidget(
            QWidget widget, 
            int x,
            int y) {
        return addProgressBarToWidget(widget, x, y, 0, 0);
    }
    
    /**
     * @func addProgressBarToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param widget : main panel.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QCheckBox : checkbox we just create.
     */
    public static QProgressBar addProgressBarToWidget(
            QWidget widget, 
            int x,
            int y,
            int width,
            int height) {
        
        QProgressBar newProgressBar = new QProgressBar(widget);
        
        newProgressBar.move(x, y);
        
        newProgressBar.setMinimumSize(width, height);
        newProgressBar.setMaximumSize(width, height);
        
        return newProgressBar;
    }
    
    /**
     * @func addButtonToWidget
     * @brief Create a button and add it to pass in widget.
     * @param widget : main panel.
     * @param btnString : text on the button.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QPushButton : button we just create.
     */
    private static QPushButton addButtonToWidget(
        QWidget widget,
        String btnString,
        int x,
        int y,
        int width,
        int height) {

        // create new button and add it to widget
        QPushButton btn = new QPushButton(btnString, widget);

        btn.move(x, y);

        btn.setMinimumSize(width, height);
        btn.setMaximumSize(width, height);

        return btn;
    }

    /**
     * @func addButtonToWidget
     * @brief Create a button and add it to pass in widget.
     * @param widget : main panel.
     * @param btnString : text on the button.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QPushButton : button we just create.
     */
    private static QPushButton addButtonToWidget(
        QWidget widget,
        String btnString,
        int x,
        int y) {

        // create new button and add it to widget
        QPushButton btn = new QPushButton(btnString, widget);

        btn.move(x, y);

        return btn;
    }

    /**
     * @func addListenerToButton
     * @brief Set function pointer for this button we are current passing.
     * @param btn : QPushButton to be passed.
     * @param obj : Object function class.
     * @param funcName : Name of the function will be called.
     */
    private static void addListenerToButton(
        QPushButton btn,
        Object obj,
        String funcName) {
        btn.clicked.connect(obj, funcName);
    }

    /**
     * @func addButtonAndSetListener
     * @brief Add a button to widget and listener in a function.
     * @param widget : widget we going to add
     * @param btnString : text on the button
     * @param x : x axis relative position
     * @param y : y axis relative position
     * @param obj : Object function class.
     * @param funcName : Name of the function will be called.
     * @return QPushButton : button we just create.
     */
    public static QPushButton addButtonAndSetListener(
        QWidget widget,
        String btnString,
        int x,
        int y,
        Object obj,
        String funcName) {

        // create the button
        QPushButton btn = addButtonToWidget(widget, btnString, x, y);

        // add listener.
        addListenerToButton(btn, obj, funcName);

        return btn;
    }
    
    /**
     * @func addButtonAndSetListener
     * @brief Add a button to widget and listener in a function.
     * @param widget : widget we going to add
     * @param btnString : text on the button
     * @param x : x axis relative position
     * @param y : y axis relative position
     * @param width : width of the button
     * @param height : height of the button
     * @param obj : Object function class.
     * @param funcName : Name of the function will be called.
     * @return QPushButton : button we just create.
     */
    public static QPushButton addButtonAndSetListener(
        QWidget widget,
        String btnString,
        int x,
        int y,
        int width,
        int height,
        Object obj,
        String funcName) {

        // create the button
        QPushButton btn = addButtonToWidget(widget, btnString, x, y, width, height);

        // add listener.
        addListenerToButton(btn, obj, funcName);

        return btn;
    }

    /**
     * @func addLabelToWidget
     * @brief Add a label to the widget.
     * @param widget : widget object
     * @param labelText : Text on the label.
     * @param x : x axis relative position
     * @param y : y axis relative position
     * @return QLabel : label object we just create.
     */
    public static QLabel addLabelToWidget(
        QWidget widget,
        String labelText,
        int x,
        int y) {

        // create label object
        QLabel label = new QLabel(widget);

        // set the text to label
        label.setText(labelText);

        // move label to a position.
        label.move(x, y);
        
        // this as default
        label.setScaledContents(true);

        return label;
    }
    
    /**
     * @func addLabelToWidget
     * @brief Add a label to the widget.
     * @param widget : widget object.
     * @param labelText : Text on the label.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QLabel : label object we just create.
     */
    public static QLabel addLabelToWidget(
        QWidget widget,
        String labelText,
        int x,
        int y,
        int width,
        int height) {

        // create label object
        QLabel label = addLabelToWidget(widget, labelText, x, y);
        
        // set size
        label.setMinimumSize(width, height);
        label.setMaximumSize(width, height);

        return label;
    }
    
    /**
     * @func addImageToWidget
     * @brief Add an image to widget object.
     * @param widget : widget object to modified.
     * @param path : path to image file.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QLabel : label object just created.
     */
    public static QLabel addImageToWidget(
            QWidget widget,
            String path,
            int x, 
            int y,
            int width,
            int height) {
        
        // create label
        QLabel label = addLabelToWidget(widget, "", x, y, width, height);
        
        // add image on it.
        addImageToLabel(label, path);
        
        return label;
    }
    
    /**
     * @func addImageToLabel
     * @brief Add the image to current label object.
     * 
     * @source http://stackoverflow.com/questions/6910946/how-to-display-a-png-file-on-a-ui-in-qt-framework
     * According to the link above, Label are object could display as a image.
     * 
     * @param label : 
     * @param path : path to the image file.
     * @return QPixmap : image objet.
     */
    public static QPixmap addImageToLabel(QLabel label, String path) {
        
        // create the pix image object
        QPixmap pix = new QPixmap(path);
        
        // set image to label.
        label.setPixmap(pix);
        
        return pix;
    }
    
    /**
     * @func addImageToLabel
     * @brief Add the image to current label object.
     * 
     * @source http://stackoverflow.com/questions/6910946/how-to-display-a-png-file-on-a-ui-in-qt-framework
     * According to the link above, Label are object could display as a image.
     * 
     * @param label : 
     * @param pix : image object.
     * @return QPixmap : image objet.
     */
    public static void addImageToLabel(QLabel label, QPixmap pix) {
        // set image to label.
        label.setPixmap(pix);
    }
    
    /**
     * @func setTextEditFontSize
     * @brief Set the text edit font size.
     * 
     * @param te : text edit object.
     * @param size : font size.
     */
    public static void setTextEditFontSize(QTextEdit te, int size) {
        QTextCursor tc = te.textCursor();
        te.selectAll();
        te.setFontPointSize(size);
        te.setTextCursor(tc);
    }

}
