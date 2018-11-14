package com.example.sande.rxjavaretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiService apiService = RetrofitInstance.getRetrofitJsonInstance().create(ApiService.class);

      // Retrofit with RxJava Call
       /* apiService.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResults, this::handleError );*/


       apiService.getPhotos()
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(this::handleResultsList, this::handleErrorList );

    }

    private void handleErrorList(Throwable throwable) {
        Log.i(TAG, "handleErrorList: " + throwable);
    }

    private void handleResultsList(List<PhotoAlbumPOJO> photoAlbumPOJOS) {
        Log.i(TAG, "handleResultsList: " + photoAlbumPOJOS.get(0).getAlbumId());
    }


/*
    private void handleError(Throwable throwable) {

        Log.i(TAG, "handleError: " + throwable.getMessage());
    }

    private void handleResults(TaskDetails taskDetails) {

        Log.i(TAG, "handleResults: " + taskDetails.toString());
    }*/


}
