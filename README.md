# CommonProjectLibrary
## 通用项目Library

[EventBus-2.4.0](https://github.com/greenrobot/EventBus)

[Gson-2.3.1](https://github.com/google/gson)

[Volley-1.0.16](https://github.com/mcxiaoke/android-volley)

[Glide-3.6.0](https://github.com/bumptech/glide)

[ButterKnife-6.1.0](https://github.com/JakeWharton/butterknife)

## ProGuard configuration 

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

######## Volley ########
-keep class com.android.volley.** {*;}
-keep class com.android.volley.toolbox.** {*;}
-keep class com.android.volley.Response$* { *; }
-keep class com.android.volley.Request$* { *; }
-keep class com.android.volley.RequestQueue$* { *; }
-keep class com.android.volley.toolbox.HurlStack$* { *; }
-keep class com.android.volley.toolbox.ImageLoader$* { *; }

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

######## ButterKnife ########
-keep class butterknife.** { *; }
-dontwarn butterknife.internal.**
-keep class **$$ViewInjector { *; }

-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}

-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}

```