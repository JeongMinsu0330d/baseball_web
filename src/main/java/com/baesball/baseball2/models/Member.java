package com.baesball.baseball2.models;

public class Member {
   private int userNo;
   private String user_email;
   private String password;
   private String user_salt;
   private String userName;
   private String userGender;
   private String userBirthDate;
   private String user_ci;
   private String user_private_save_type;
   private String getUser_private_save_type;

    public Member(){

    }

   public Member(int userNo, String password, String user_email, String userName, String userGender, String userBirthDate) {
      this.userNo = userNo;
      this.password = password;
      this.user_email = user_email;
      this.userName = userName;
      this.userGender = userGender;
      this.userBirthDate = userBirthDate;
   }

   public int getUserNo() {
      return userNo;
   }

   public void setUserNo(int userNo) {
      this.userNo = userNo;
   }

   public String getUser_email() {
      return user_email;
   }

   public void setUser_email(String user_email) {
      this.user_email = user_email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getUser_salt() {
      return user_salt;
   }

   public void setUser_salt(String user_salt) {
      this.user_salt = user_salt;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserGender() {
      return userGender;
   }

   public void setUserGender(String userGender) {
      this.userGender = userGender;
   }

   public String getUserBirthDate() {
      return userBirthDate;
   }

   public void setUserBirthDate(String userBirthDate) {
      this.userBirthDate = userBirthDate;
   }

   public String getUser_ci() {
      return user_ci;
   }

   public void setUser_ci(String user_ci) {
      this.user_ci = user_ci;
   }

   public String getUser_private_save_type() {
      return user_private_save_type;
   }

   public void setUser_private_save_type(String user_private_save_type) {
      this.user_private_save_type = user_private_save_type;
   }

   public String getGetUser_private_save_type() {
      return getUser_private_save_type;
   }

   public void setGetUser_private_save_type(String getUser_private_save_type) {
      this.getUser_private_save_type = getUser_private_save_type;
   }
}
