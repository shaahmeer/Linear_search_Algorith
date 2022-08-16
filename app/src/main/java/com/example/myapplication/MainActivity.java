 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    TextView array,results;
   public static EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        array=findViewById(R.id.array);
        editText=findViewById(R.id.intx);
        results=findViewById(R.id.results);
        button=findViewById(R.id.fetch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchdata();
            }
        });


    }


     public static int Search(int arr[], int x){

        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

     }
     private void fetchdata() {
         int arr[]={10,20,30,40,50,60,70,80,90};
          Editable text =editText.getText();
         int x = Integer.parseInt(String.valueOf(text));

        int result = Search(arr,x);
         if(result==-1){
            // editText.getText().toString();
             results.setText("not found");

         }else{
             results.setText("result  found"+" "+result);
         }
     }


 }