package com.example.ice.u17;

import android.app.Application;
import android.os.StrictMode;

import com.wenming.library.LogReport;
import com.wenming.library.save.imp.CrashWriter;
import com.wenming.library.upload.email.EmailReporter;


/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class U17App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
        }

        initCrashReport();
        LogReport.getInstance().upload(this);
    }

    private void initCrashReport() {
        LogReport.getInstance()
                .setCacheSize(30 * 1024 * 1024)
                .setLogDir(getApplicationContext(), "sdcard/" + this.getString(this.getApplicationInfo().labelRes) + "/")
                .setWifiOnly(false)
                .setLogSaver(new CrashWriter(getApplicationContext()))
                .init(getApplicationContext());
        initEmailReporter();
    }

    /**
     * 使用EMAIL发送日志
     */
    private void initEmailReporter() {
        EmailReporter email = new EmailReporter(this);
        email.setReceiver("ice45571bug@163.com");//bug1...6
        email.setSender("ice45571bug@163.com");
        email.setSendPassword("sqm123456");
        email.setSMTPHost("smtp.163.com");
        email.setPort("465");
        LogReport.getInstance().setUploadType(email);
    }
}
