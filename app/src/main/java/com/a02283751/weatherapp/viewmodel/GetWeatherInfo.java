package com.a02283751.weatherapp.viewmodel;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class GetWeatherInfo extends AndroidViewModel {

    private RequestQueueSingleton queue = RequestQueueSingleton.getInstance(
            this.getApplication().getApplicationContext());

    private String string;
    private String url;

    public GetWeatherInfo(@NonNull Application application) {
        super(application);
        url = "https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}";
    }
}
