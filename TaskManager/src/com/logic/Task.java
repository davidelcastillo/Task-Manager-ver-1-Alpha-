package com.logic;

public class Task {
    String tk_title , tk_info;
    boolean status;
    
    public Task (String title, String info) {
        set_title(title);
        set_info(info);
        this.status = true;
    }
    
    public void set_title(String title){
        this.tk_title = title;
    }
    
    public void set_info(String info){
        this.tk_info = info;
    }
    
    public void set_done_finish(){
        this.status=true;
    }
    
    public String get_title(){
        return tk_title;
    }
    
    public String get_info(){
        return tk_info;
    }
}
