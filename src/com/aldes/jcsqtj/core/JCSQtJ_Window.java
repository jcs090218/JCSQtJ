package com.aldes.jcsqtj.core;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aldes.jcsqtj.util.JCSQtJ_Util;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

/**
 * $File: JCSQtJ_Window.java $
 * $Date: 2017-03-27 16:08:14 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */


/**
 * @class JCSQtJ_Window
 * @brief Window handler for this framework.
 */
public class JCSQtJ_Window {

    private QWidget widget = null;    // widget hold here.
    
    /**
     * @note some other style string.
     * @source http://stackoverflow.com/questions/6740333/can-i-run-a-qt-application-with-a-specific-theme
     *      "windows"
     *      "motif"
     *      "cde"
     *      "plastique"
     *      "cleanlooks"
     *
     * Under this is depends on OS.
     *      "windowsxp"
     *      "windowsvista"
     *      "macintosh"
     */
    private String windowStyle = "plastique";    // default value.

    private String windowTitle = "JCSQtJ Window Title";

    private int screenWidth = 800;
    private int screenHeight = 600;

    // icon image of this program.
    private QIcon iconImage = null;
    // defualt image path.
    private String iconImagePath = "res/icon.ico";


    /* Button default value. */
    private int defaultBtnWidth = 100;
    private int defaultBtnHeight = 30;

    /* Label default value */
    private int defaultLabelWidth = 100;
    private int defaultLabelHeight = 30;
    
    /* Combo Box default value */
    private int defaultComboBoxWidth = 100;
    private int defaultComboBoxHeight = 30;
    
    /* Text Edit default value */
    private int defaultTextEditWidth = 300;
    private int defaultTextEditHeight = 60;
    
    /* Line Edit default value */
    private int defaultLineEditWidth = 100;
    private int defaultLineEditHeight = 30;
    
    /**
     * @func JCSQtJ_Window
     * @brief constructor
     * @param args : arguments vector.
     */
    public JCSQtJ_Window() {

    }

    /**
     * @func startFrame
     * @brief Start and prepare window to be render.
     */
    public void startFrame(final String[] args) {
        QApplication.initialize(args);

        // create new widget for this window.
        if (widget == null)
            widget = new JCSQtJ_Widget();

        /* Window configuration */
        setWindowTitle(windowTitle);
        setStyle(windowStyle);
        setIconImage(iconImagePath);
    }

    /**
     * @func endFrame
     * @brief End the GUI window renderer device.
     */
    public void endFrame() {
        // TODO(jenchieh): change this so it could turn on/off.
        // show the window by default.
        widget.show();

        // --------------------------------------------------
        QApplication.execStatic();
        QApplication.shutdown();
    }
    
    /**
     * Set your own widget to gain more access to Qt framework.
     * @param widget
     */
    public void setWidget(QWidget widget) {
        this.widget = widget;
    }

    /**
     * @func setIcon
     * @brief Set icon image base on the path.
     * @param path: path of the icon image.
     */
    public void setIconImage(String path) {

        // set the path
        this.iconImagePath = path;

        // create new icon.
        iconImage = new QIcon(this.iconImagePath);

        // hande over to Qt framework.
        widget.setWindowIcon(iconImage);
    }

    /**
     * @func addButtonToWindow
     * @brief Add a button to this window.
     * @param btn :
     * @param btnString :
     * @param x : x axis relative position
     * @param y : y axis relative position
     * @param obj : Object function class.
     * @param funcName : Name of the function will be called.
     * @return QPushButton : button we just create.
     */
    public QPushButton addButtonToWindow(
        String btnString,
        int x,
        int y,
        Object obj,
        String funcName) {

        QPushButton btn = JCSQtJ_Util.addButtonAndSetListener(
            this.widget,
            btnString,
            x,
            y,
            /* use default button width and height value. */
            getDefaultButtonWidth(),
            getDefaultButtonHeight(),
            obj,
            funcName);

        return btn;
    }

    /**
     * @func addButtonToWindow
     * @brief Add a button to this window.
     * @param btn :
     * @param btnString :
     * @param x : x axis relative position
     * @param y : y axis relative position
     * @param width : width of the button
     * @param height : height of the button
     * @param obj : Object function class.
     * @param funcName : Name of the function will be called.
     * @return QPushButton : button we just create.
     */
    public QPushButton addButtonToWindow(
        String btnString,
        int x,
        int y,
        int width,
        int height,
        Object obj,
        String funcName) {

        QPushButton btn = JCSQtJ_Util.addButtonAndSetListener(
            this.widget,
            btnString,
            x,
            y,
            width,
            height,
            obj,
            funcName);

        return btn;
    }

    /**
     * @func addLabelToWindow
     * @brief Add an image to widget object.
     * @param widget : widget object to modified.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param path : path to image file.
     * @return QLabel : label object just created.
     */
    public QLabel addLabelToWindow(
            String labelText,
            int x,
            int y) {
        // add label to widget
        QLabel label = JCSQtJ_Util.addLabelToWidget(
                this.widget,
                labelText,
                x,
                y,
                getDefaultLabelWidth(),
                getDefaultLabelHeight());

        return label;
    }

    /**
     * @func addLabelToWindow
     * @brief Add an image to widget object.
     * @param widget : widget object to modified.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param path : path to image file.
     * @return QLabel : label object just created.
     */
    public QLabel addLabelToWindow(
            String labelText,
            int x,
            int y,
            int width,
            int height) {
        // add label to widget
        QLabel label = JCSQtJ_Util.addLabelToWidget(
            this.widget,
            labelText,
            x,
            y,
            width,
            height);

        return label;
    }
    
    /**
     * @func addImageToWindow
     * @brief Add an image to widget object.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param path : path to image file.
     * @param width : width of the button.
     * @param height : height of the button.
     * @return QLabel : label object just created.
     */
    public QLabel addImageToWindow(
            String path,
            int x, 
            int y,
            int width,
            int height) {
        
        return JCSQtJ_Util.addImageToWidget(
                widget,
                path,
                x, 
                y, 
                width, 
                height);
    }
    
    /**
     * @func addImageToWindow
     * @brief Add an image to widget object.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param path : path to image file.
     * @return QLabel : label object just created.
     */
    public QLabel addImageToWindow(
            String path,
            int x, 
            int y) {
        
        BufferedImage baseImage;
        try {
            // get image. in order to find out the image size.
            baseImage = ImageIO.read(new File(path));
            
            return JCSQtJ_Util.addImageToWidget(
                    widget,
                    path,
                    x, 
                    y, 
                    // pass in the size.
                    baseImage.getWidth(), 
                    baseImage.getHeight());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    /**
     * @func addComboBoxToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the combobox.
     * @param height : height of the combobox.
     * @return QComboBox : combobox we just create.
     */
    public QComboBox addComboBoxToWindow(
            int x,
            int y,
            int width,
            int height) {
        
        return JCSQtJ_Util.addComboBoxToWidget(
                this.widget,
                x,
                y,
                width,
                height);
    }
    
    /**
     * @func addComboBoxToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QComboBox : combobox we just create.
     */
    public QComboBox addComboBoxToWindow(
            int x,
            int y) {
        
        return JCSQtJ_Util.addComboBoxToWidget(
                this.widget,
                x,
                y,
                defaultComboBoxWidth,
                defaultComboBoxHeight);
    }
    
    /**
     * @func addTextEditToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @return QTextEdit : text edit we just create.
     */
    public QTextEdit addTextEditToWidget(
            int x,
            int y) {
        
        return addTextEditToWindow(
                x,
                y,
                this.getDefaultTextEditWidth(),
                this.getDefaultTextEditHeight());
    }
    
    /**
     * @func addTextEditToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the text edit.
     * @param height : height of the text edit.
     * @return QTextEdit : text edit we just create.
     */
    public QTextEdit addTextEditToWindow(
            int x,
            int y,
            int width,
            int height) {
        
        return JCSQtJ_Util.addTextEditToWidget(
                this.widget,
                x,
                y,
                width,
                height);
    }
    
    /**
     * @func addTextEditToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the text edit.
     * @param height : height of the text edit.
     * @return QLineEdit : line edit we just create.
     */
    public QLineEdit addLineEditToWindow(
            int x,
            int y) {
        
        return addLineEditToWindow(
                x,
                y,
                this.getDefaultLabelWidth(),
                this.getDefaultLabelHeight());
    }
    
    /**
     * @func addTextEditToWindow
     * @brief Create a graphics scene and add it to pass in widget.
     * @param x : x axis relative position.
     * @param y : y axis relative position.
     * @param width : width of the text edit.
     * @param height : height of the text edit.
     * @return QLineEdit : line edit we just create.
     */
    public QLineEdit addLineEditToWindow(
            int x,
            int y,
            int width,
            int height) {
        
        return JCSQtJ_Util.addLineEditToWidget(
                this.widget,
                x,
                y,
                width,
                height);
    }
    

    /* setter */
    /**
     * @func setStyle
     * @brief Set the style of this window.
     */
    public void setStyle(String style) {
        this.windowStyle = style;
        QApplication.setStyle(style);
    }

    /**
     * @func setWindowTitle
     * @brief set the window title
     * @param title : Window title string.
     */
    public void setWindowTitle(String title) {
        this.windowTitle = title;
        widget.setWindowTitle(title);
    }

    /**
     * @func setWindowSize
     * @brief Set the window size.
     */
    public void setWindowSize(int w, int h) {
        this.screenWidth = w;
        this.screenHeight = h;

        // set screen width and height
        widget.setFixedSize(this.screenWidth, this.screenHeight);
    }

    /**
     * @func setDefaultButtonWidth
     * @brief Set the default button width value.
     * Note this can use to organize all the button
     * the same size.
     * @param w : width value.
     */
    public void setDefaultButtonWidth(int w) {
        this.defaultBtnWidth = w;
    }

    /**
     * @func setDefaultButtonHeight
     * @brief Set the default button height value.
     * Note this can use to organize all the button
     * the same size.
     * @param h : height value.
     */
    public void setDefaultButtonHeight(int h) {
        this.defaultBtnHeight = h;
    }

    /**
     * @func setDefaultLabelWidth
     * @brief Set the default label width value.
     * Note this can use to organize all the button
     * the same size.
     * @param w : width value.
     */
    public void setDefaultLabelWidth(int w) {
        this.defaultBtnWidth = w;
    }

    /**
     * @func setDefaultLabelHeight
     * @brief Set the default label height value.
     * Note this can use to organize all the button
     * the same size.
     * @param h : height value.
     */
    public void setDefaultLabelHeight(int h) {
        this.defaultLabelHeight = h;
    }
    
    /**
     * @func setDefaultComboBoxWidth
     * @brief Set the default combo box width value.
     * Note this can use to organize all the button
     * the same size.
     * @param w : width value.
     */
    public void setDefaultComboBoxWidth(int w) {
        this.defaultComboBoxWidth = w;
    }

    /**
     * @func setDefaultComboBoxHeight
     * @brief Set the default combo box height value.
     * Note this can use to organize all the button
     * the same size.
     * @param h : height value.
     */
    public void setDefaultComboBoxHeight(int h) {
        this.defaultComboBoxHeight = h;
    }
    
    /**
     * @func setDefaultTextEditWidth
     * @brief Set the default text edit width value.
     * Note this can use to organize all the button
     * the same size.
     * @param w : width value.
     */
    public void setDefaultTextEditWidth(int w) {
        this.defaultTextEditWidth = w;
    }

    /**
     * @func setDefaultTextEditHeight
     * @brief Set the default text edit height value.
     * Note this can use to organize all the button
     * the same size.
     * @param h : height value.
     */
    public void setDefaultTextEditHeight(int h) {
        this.defaultTextEditHeight = h;
    }
    
    /**
     * @func setDefaultLineEditWidth
     * @brief Set the default line edit width value.
     * Note this can use to organize all the button
     * the same size.
     * @param w : width value.
     */
    public void setDefaultLineEditWidth(int w) {
        this.defaultLineEditWidth = w;
    }

    /**
     * @func setDefaultLineEditHeight
     * @brief Set the default line edit height value.
     * Note this can use to organize all the button
     * the same size.
     * @param h : height value.
     */
    public void setDefaultLineEditHeight(int h) {
        this.defaultLineEditHeight = h;
    }


    /* getter */
    /**
     * @func getWidget
     * @brief get the widget object from this window object.
     * @return QWidget : widget object.
     */
    public QWidget getWidget() {
        return this.widget;
    }

    /**
     * @func getStyle
     * @brief Get the window style string.
     * @return String : Window style string.
     */
    public String getStyle() {
        return this.windowStyle;
    }

    /**
     * @func getWindowTitle
     * @brief get the window title name.
     * @return String : window title string.
     */
    public String getWindowTitle() {
        return this.windowTitle;
    }

    /**
     * @func getDefaultButtonWidth
     * @brief Return default button width value.
     * @return int : Return value.
     */
    public int getDefaultButtonWidth() {
        return this.defaultBtnWidth;
    }

    /**
     * @func getDefaultButtonHeight
     * @brief Return default button height value.
     * @return int : Return value.
     */
    public int getDefaultButtonHeight() {
        return this.defaultBtnHeight;
    }

    /**
     * @func getDefaultLabelWidth
     * @brief Return default label width value.
     * @return int : Return value.
     */
    public int getDefaultLabelWidth() {
        return this.defaultLabelWidth;
    }

    /**
     * @func getDefaultLabelHeight
     * @brief Return default label height value.
     * @return int : Return value.
     */
    public int getDefaultLabelHeight() {
        return this.defaultLabelHeight;
    }
    
    /**
     * @func getDefaultComboBoxWidth
     * @brief Return default combo box width value.
     * @return int : Return value.
     */
    public int getDefaultComboBoxWidth() {
        return this.defaultComboBoxWidth;
    }
    
    /**
     * @func getDefaultComboBoxHeight
     * @brief Return default combo box height value.
     * @return int : Return value.
     */
    public int getDefaultComboBoxHeight() {
        return this.defaultComboBoxHeight;
    }
    
    /**
     * @func getDefaultTextEditWidth
     * @brief Return default text edit width value.
     * @return int : Return value.
     */
    public int getDefaultTextEditWidth() {
        return this.defaultTextEditWidth;
    }
    
    /**
     * @func getDefaultTextEditHeight
     * @brief Return default text edit height value.
     * @return int : Return value.
     */
    public int getDefaultTextEditHeight() {
        return this.defaultTextEditHeight;
    }
    
    /**
     * @func getDefaultLineEditWidth
     * @brief Return default line edit width value.
     * @return int : Return value.
     */
    public int getDefaultLineEditWidth() {
        return this.defaultLineEditWidth;
    }
    
    /**
     * @func getDefaultLineEditHeight
     * @brief Return default line edit height value.
     * @return int : Return value.
     */
    public int getDefaultLineEditHeight() {
        return this.defaultLineEditHeight;
    }

}
