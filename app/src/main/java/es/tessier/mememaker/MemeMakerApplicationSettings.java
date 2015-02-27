package es.tessier.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import es.tessier.mememaker.utils.StorageType;

/**
 * Created by Evan Anger on 8/13/14.
 */
public class MemeMakerApplicationSettings {

    private SharedPreferences mSharedPreferences;
    private final String  KEY_STORAGE = "Storage";

    public MemeMakerApplicationSettings(Context context) {


         mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);


    }
    public String getStoragePreference()
    {
        return mSharedPreferences.getString(KEY_STORAGE, StorageType.INTERNAL);
    }
    public void setSharedPreference(String almacenamiento)
    {
        mSharedPreferences.edit().putString(KEY_STORAGE,StorageType.INTERNAL).apply();


    }
}
