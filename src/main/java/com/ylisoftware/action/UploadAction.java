package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 上传文件进行处理。主要处理上传文件内容进行保存操作
 * author:liyangli
 * date: 2017/11/22 上午2:25.
 */
public class UploadAction extends ActionSupport {


    private File file ;
    private String fileFileName;
    private String fileContentType;
    public String execute(){
        //进行文件直接保存到指定的目录下；
        if(file == null){
            return ERROR;
        }
        String path = this.getClass().getResource("/").getPath();
        System.out.println("path->"+path);
        System.out.println("fileContentType-->"+fileContentType);
        File newFile = new File(path+"/"+fileFileName);
        //文件拷贝到指定的位置
        try {
            FileUtils.copyFile(file,newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}
