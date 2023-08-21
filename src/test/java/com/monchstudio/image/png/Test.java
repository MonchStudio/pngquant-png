package com.monchstudio.image.png;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args)throws Exception {
        String srcFile="C:\\Users\\xqlee-mobile\\Desktop\\test\\swagger_logo.png";
        String outFile="C:\\Users\\xqlee-mobile\\Desktop\\testout\\swagger_logo.png";
        try (FileInputStream fis=new FileInputStream(srcFile);
             FileOutputStream fos=new FileOutputStream(outFile)){
            PngCompressor.compress(fis,fos);
        }
    }
}
