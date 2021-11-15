package com.deryacelik.methodandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();
        System.out.println(math(3,5));
        makeMusicians();
        makeSimpsons();
    }
    public void makeSimpsons() {
        Simpsons homer = new Simpsons("homer", 40, "engineer");
        homer.setAge(42);
        System.out.println(homer.getAge());
    }

    public void makeMusicians() {
        Musicians james = new Musicians("james", "violin", 24);
        System.out.println(james.instrument);
    }


    public void testMethod() {
        int x=4*4;
        System.out.println("value of x: " +x);
    }

    public int math(int a, int b) {
        return a+b;
    }





}