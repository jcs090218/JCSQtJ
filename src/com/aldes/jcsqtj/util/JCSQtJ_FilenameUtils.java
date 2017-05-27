package com.aldes.jcsqtj.util;

import org.apache.commons.io.FilenameUtils;

/**
 * $File: JCSQtJ_FilenameUtils.java $
 * $Date: 2017-04-26 19:19:28 $
 * $Revision: $
 * $Creator: Jen-Chieh Shen $
 * $Notice: See LICENSE.txt for modification and distribution information
 *                   Copyright (c) 2017 by Shen, Jen-Chieh $
 */

public class JCSQtJ_FilenameUtils {
    
    /**
     * Check if needed add the extension on it.
     * @param filePath : file path.
     * @param ext : extension to add.
     * @return full path that added extension.
     */
    public static String safeAddExtension(String filePath, String ext) {
        String checkExt = FilenameUtils.getExtension(filePath);
        String checkExt2 = "." + checkExt;
        
        // check valid extension format.
        //  ↓ First check the regular extension
        //                             ↓ Second check extension with dot.
        if (!checkExt.equals(ext) && !checkExt2.equals(ext)) {
            
            // check if there are dot infront.
            if (ext.startsWith("."))
                filePath += ext;
            else
                filePath +=  "." + ext;
        }
        return filePath;
    }
    
    /**
     * Safe way adding the extension. (PNG)
     * @param filePath
     * @return full path that added .png extension.
     */
    public static String safeAddExtensionPNG(String filePath) {
        return safeAddExtension(filePath, ".png");
    }
    
    /**
     * Safe way adding the extension. (gz)
     * @param filePath
     * @return full path that added .gz extension.
     */
    public static String safeAddExtensionGZ(String filePath) {
        return safeAddExtension(filePath, ".gz");
    }
    
    /**
     * Safe way adding the extension. (mp3)
     * @param filePath
     * @return full path that added .mp3 extension.
     */
    public static String safeAddExtensioMP3(String filePath) {
        return safeAddExtension(filePath, ".mp3");
    }
    
    /**
     * Safe way adding the extension. (mp4)
     * @param filePath
     * @return full path that added .mp4 extension.
     */
    public static String safeAddExtensioMP4(String filePath) {
        return safeAddExtension(filePath, ".mp4");
    }
    
    /**
     * Safe way adding the extension. (jcs)
     * @param filePath
     * @return full path that added .jcs extension.
     */
    public static String safeAddExtensioJCS(String filePath) {
        return safeAddExtension(filePath, ".jcs");
    }
    
}
