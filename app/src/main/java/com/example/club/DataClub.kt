package com.example.club

import android.os.Parcel
import android.os.Parcelable

data class DataClub(
    val nama : String
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()!!) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataClub> {
        override fun createFromParcel(parcel: Parcel): DataClub {
            return DataClub(parcel)
        }

        override fun newArray(size: Int): Array<DataClub?> {
            return arrayOfNulls(size)
        }
    }
}
