package com.sayimfun.moredatasource.entity;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Integer teacherAge;

    private String teacherEmail;

    private String teacherClass;

    private String teacherSubject;

    private Integer deleted;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass == null ? null : teacherClass.trim();
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject == null ? null : teacherSubject.trim();
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}