package com.novamar.seabedcamera.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.novamar.seabedcamera.R;
import com.novamar.seabedcamera.model.MainModel;
import com.novamar.seabedcamera.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements mainActivityInterface {

    private MainPresenter mainPresenter;
    private MainModel mainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainModel = new MainModel();
        mainPresenter = new MainPresenter();
    }
}
