package com.example.tugasandroidmfakhrimusyaffa

import android.os.Parcelable
import android.provider.ContactsContract.CommonDataKinds.Email
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val email: String,
    val password: String
):Parcelable
