# CommonProjectLibrary
## 通用项目Library ## 

[EventBus-2.4.0](https://github.com/greenrobot/EventBus)

[Gson-2.3.1](https://github.com/google/gson)

[Retrofit-1.9.0](https://github.com/square/retrofit)

[Glide-3.6.0](https://github.com/bumptech/glide)

## ProGuard configuration ## 

  If you are using Proguard in your project add the following lines to your configuration:

```
######## EventBus ########
-keepclassmembers class ** {
    public void onEvent*(**);
}

# Only required if you use AsyncExecutor
-keepclassmembers class * extends de.greenrobot.event.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

######## Retrofit ########
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keepattributes Signature
-keepattributes Exceptions

######## Gson ########
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.examples.android.model.** { *; } 
-keep class com.google.gson.** { *;}

######## Glide ########
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}

```