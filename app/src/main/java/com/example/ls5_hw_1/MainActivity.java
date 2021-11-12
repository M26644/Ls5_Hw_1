package com.example.ls5_hw_1;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView recyclerView;
    private ImageButton imbAdd;
    private  ImageButton imbMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        imbAdd = findViewById(R.id.imbAdd);
       // imbMore = findViewById(R.id.imbMore);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        recyclerView.setLayoutManager(manager);


        imbAdd.setOnClickListener(this);
       // imbMore.setOnClickListener(this);



        ArrayList<BookDTO> bookDTOArrayList = new ArrayList<>();
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));
        bookDTOArrayList.add(new BookDTO("To kill a mocking bird"));



        com.example.ls5_hw_1.BookAdapter adapter = new com.example.ls5_hw_1.BookAdapter(bookDTOArrayList, this);
        recyclerView.setAdapter(adapter);



    }


    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: 1");

    }
}