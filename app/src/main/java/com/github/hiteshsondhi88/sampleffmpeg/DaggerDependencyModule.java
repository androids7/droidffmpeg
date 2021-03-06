package com.github.hiteshsondhi88.sampleffmpeg;

import android.content.Context;

//import javax.inject.Singleton;


import com.github.hiteshsondhi88.libffmpeg.FFmpeg;

@SuppressWarnings("unused")
public class DaggerDependencyModule {

    private final Context context;

    DaggerDependencyModule(Context context) {
        this.context = context;
    }

   // @Provides @Singleton
    FFmpeg provideFFmpeg() {
        return FFmpeg.getInstance(context.getApplicationContext());
    }

}
