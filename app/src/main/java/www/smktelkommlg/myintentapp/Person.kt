package www.smktelkommlg.myintentapp

import android.os.Parcelable
import android.os.Parcel
import android.os.Parcelable.Creator

class Person : Parcelable {
    var name: String?
        private set
    var age: Int
        private set
    var email: String?
        private set
    var city: String?
        private set


    protected constructor(`in`: Parcel) {
        name = `in`.readString()
        age = `in`.readInt()
        email = `in`.readString()
        city = `in`.readString()

    }

    constructor(name: String?, age: Int, email: String?, city: String?) {
        this.name = name
        this.age = age
        this.email = email
        this.city = city

    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, i: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
        parcel.writeString(email)
        parcel.writeString(city)

    }

    companion object {
        @JvmField
        val CREATOR: Creator<Person?> = object : Creator<Person?> {
            override fun createFromParcel(`in`: Parcel): Person? {
                return Person(`in`)
            }

            override fun newArray(size: Int): Array<Person?> {
                return arrayOfNulls(size)
            }
        }
    }
}