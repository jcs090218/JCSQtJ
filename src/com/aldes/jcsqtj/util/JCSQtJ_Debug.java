package com.aldes.jcsqtj.util;

/**
 * $File: JCSQtJ_Debug.java $
 * $Date: 2017-03-27 19:25:50 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */

/**
 * @class JCSQtJ_Debug
 * @brief Use for only this framework. 
 */
public class JCSQtJ_Debug {
    
    /**
     * @func log
     * @brief Log a message.
     * @param msg : message to be print.
     */
    public static void log(String msg) {
        System.out.println("--------------------------------");
        System.out.println("JCSQtJ Log : " + msg);
        System.out.println("--------------------------------");
    }
    
    /**
     * @func error
     * @brief Error log a message.
     * @param msg : message to be print.
     */
    public static void error(String msg) {
        System.err.println("--------------------------------");
        System.err.println("JCSQtJ Error : " + msg);
        System.err.println("--------------------------------");
    }
    
}
