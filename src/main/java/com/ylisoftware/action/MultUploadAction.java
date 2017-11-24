package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * author:liyangli
 * date: 2017/11/22 上午3:21.
 */
public class MultUploadAction extends ActionSupport {
    private File[] file;
    private String[] fileFileName;
    private String[] fileFileContent;

    @Override
    public String execute() throws Exception {
        if(file.length == 0){
            return ERROR;
        }
        String path = this.getClass().getResource("/").getPath();
        int i = 0;
        for(File uploadFile : file){
            //进行文件的拷贝动作
            FileUtils.copyFile(uploadFile,new File(path+fileFileName[i++]));
        }
        return SUCCESS;
    }


    public File[] getFile() {
        return file;
    }

    public void setFile(File[] file) {
        this.file = file;
    }

    public String[] getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String[] fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String[] getFileFileContent() {
        return fileFileContent;
    }

    public void setFileFileContent(String[] fileFileContent) {
        this.fileFileContent = fileFileContent;
    }
}
