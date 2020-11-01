package com.beta.myhbt_api.Model

import com.google.gson.annotations.SerializedName

class User (_id: String, firstName: String, middleName: String, lastName: String, email: String, phoneNumber: String, facebook: String,
            instagram: String, twitter: String, zalo: String, role: String, classCode: String, avatarURL: String, coverURL: String, studentId: String){
    // Attribute of the user as saved in the database
    @SerializedName("_id")
    private val _id: String = _id

    @SerializedName("firstName")
    private val firstName: String = firstName

    @SerializedName("middleName")
    private val middleName: String = middleName

    @SerializedName("lastName")
    private val lastName: String = lastName

    @SerializedName("email")
    private val email: String = email

    @SerializedName("phoneNumber")
    private val phoneNumber: String = phoneNumber

    @SerializedName("facebook")
    private val facebook: String = facebook

    @SerializedName("instagram")
    private val instagram: String = instagram

    @SerializedName("twitter")
    private val twitter: String = twitter

    @SerializedName("zalo")
    private val zalo: String = zalo

    @SerializedName("role")
    private val role: String = role

    @SerializedName("studentId")
    private val studentId: String = studentId

    @SerializedName("classCode")
    private val classCode: String = classCode

    @SerializedName("avatarURL")
    private val avatarURL: String = avatarURL

    @SerializedName("coverURL")
    private val coverURL: String = coverURL

    // Getters
    fun getId(): String {
        return _id
    }

    fun getFullName(): String {
        return "$lastName $middleName $firstName"
    }

    fun getEmail(): String {
        return email
    }

    fun getPhoneNumber(): String {
        return phoneNumber
    }

    fun getFacebook(): String {
        return facebook
    }

    fun getInstagram(): String {
        return instagram
    }

    fun getTwitter(): String {
        return twitter
    }

    fun getZalo(): String {
        return zalo
    }

    fun getRole(): String {
        return role
    }

    fun getStudentId(): String {
        return studentId
    }

    fun getClassCode(): String {
        return classCode
    }

    fun getAvatarURL(): String {
        return avatarURL
    }

    fun getCoverURL(): String {
        return coverURL
    }
}