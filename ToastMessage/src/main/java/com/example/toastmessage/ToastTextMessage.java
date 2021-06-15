package com.example.toastmessage;

import android.content.Context;
import android.widget.Toast;

public class ToastTextMessage {

    public static void showToast(Context c, String msg)
    {
        Toast.makeText(c,msg,Toast.LENGTH_LONG).show();
    }
}
