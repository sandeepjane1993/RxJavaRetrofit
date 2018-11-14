package com.example.sande.rxjavaretrofit;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //http://rjtmobile.com/aamir/pms/android-app/pms_view_task_deatil.php?taskid=1&&project_id=27

    @GET("/aamir/pms/android-app/pms_view_task_deatil.php?taskid=1&&project_id=27")
    Observable<TaskDetails> getData();

    //

    @GET("/photos")
        //if response is JsonArray
    Observable<List<PhotoAlbumPOJO>> getPhotos();
}
