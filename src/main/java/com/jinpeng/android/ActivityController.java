package com.jinpeng.android;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityController {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivty(Activity activity){
        activities.remove(activity);
    }
    public static void finishall(){
        for (Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
