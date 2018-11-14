package com.example.sande.rxjavaretrofit;

import com.google.gson.annotations.SerializedName;

public class TaskDetails {


    @SerializedName("taskid")
    private String taskid;
    @SerializedName("projectid")
    private String projectid;
    @SerializedName("taskname")
    private String taskname;
    @SerializedName("taskstatus")
    private String taskstatus;
    @SerializedName("taskdesc")
    private String taskdesc;
    @SerializedName("startdate")
    private String startdate;
    @SerializedName("endstart")
    private String endstart;

    public TaskDetails(String taskid, String projectid, String taskname, String taskstatus, String taskdesc, String startdate, String endstart) {
        this.taskid = taskid;
        this.projectid = projectid;
        this.taskname = taskname;
        this.taskstatus = taskstatus;
        this.taskdesc = taskdesc;
        this.startdate = startdate;
        this.endstart = endstart;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    public String getTaskdesc() {
        return taskdesc;
    }

    public void setTaskdesc(String taskdesc) {
        this.taskdesc = taskdesc;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEndstart() {
        return endstart;
    }

    public void setEndstart(String endstart) {
        this.endstart = endstart;
    }
}
