package com.example.mobproject;
//사용자 계정 정보 모델 클래스
public class UserAccount {
    private String emailID; //이메일 아이디
    private String password; // 비밀번호
    private String idToken;  // Firebase Uid (고유 토큰정보)
//    private String nameID;
//    private String ageID;

    public UserAccount() { }



    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getNameID() {
//        return nameID;
//    }
//
//    public void setNameID(String nameID) {
//        this.nameID = nameID;
//    }
//
//    public String getAgeID() {
//        return ageID;
//    }
//
//    public void setAgeID(String ageID) {
//        this.ageID = ageID;
//    }


}
