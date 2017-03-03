package com.java.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by zyb on 2017/3/3.
 */
public class HelloWorld {

    public static void main(String[] args) {
        File file = new File("E:/javaSpace/word.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte[] bytes = "这是一段文字，这是一段文字。".getBytes();
            out.write(bytes);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.print(new String(bytes,0,len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        if (file.exists()) {
//            System.out.println(file.getName());
//            System.out.println(file.length());
//            System.out.println(file.isHidden());
//        } else {
//        try {
//            file.createNewFile(); //创建文件
//            System.out.println("文件已创建");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        }
    }

}
