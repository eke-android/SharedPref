package hu.eke.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by szugyi on 17/11/16.
 */
public class Storage {
    private SharedPreferences prefs;

    public Storage(Context ctx){
         prefs = ctx.getSharedPreferences(
                "hu.eke.sharedpref", ctx.MODE_PRIVATE);
    }

    public String getEmail(){
        return prefs.getString("email", null);
    }
}
