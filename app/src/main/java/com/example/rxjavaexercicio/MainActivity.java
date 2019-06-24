package com.example.rxjavaexercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getColors()
                .subscribe(s -> System.out.println(s)
                        , t -> System.out.println(t.getMessage()));

    }

    Observable<String> getColors() {
        return Observable.create(emitter -> {
            emitter.onNext("azul");
            emitter.onNext("rosa");
            emitter.onNext("vermelho");
            emitter.onNext("branco");
            emitter.onNext("preto");
            emitter.onNext("verde");
            emitter.onNext("amarelo");
            emitter.onComplete();
        });
        }
    }
