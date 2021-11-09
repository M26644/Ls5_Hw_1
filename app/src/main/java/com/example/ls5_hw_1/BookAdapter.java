package com.example.ls5_hw_1;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder>  {
    private ArrayList<Book> bookArrayList;
    private Context context;


    public  BookAdapter(ArrayList<Book> bookArrayList, Context context) {
        this.bookArrayList = bookArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // o phuong thuc nay, recycleview se tao ra cac viewholder(moi 1 viuewholder se hien thi 1 item trong recycleview)

        // phuong thuc nay yeu cau return MyViewHolder
        // minh se phai tao MyViewHolder

        // cau lenh nay se tao ra 1 view tu 1 layout trong xml

        View view = LayoutInflater.from(context).inflate(R.layout.custom_layout_item, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // phuong thuc nay se gan du lieu vao item
        // position la vi tri cua item
        // ma vi tri cua item = doi tuong sinh vien nam trong arraylist Sinh vien


        Book book = bookArrayList.get(position);

        // gan du lieu vao item
        holder.txtHeader.setText(book.getBookName());
    }


    // dinh nghia so luong item minh muon hien thi
    @Override
    public int getItemCount() {

        return bookArrayList.size();
    }



    // giup minh xu ly du lieu de hien thi len tung item
    // class nay se chua item,
    // muom hien thi du lieu len item, thi khai bao cac view trong item o day
    // sau do goi toi cac view de gan du lieu
    class MyViewHolder extends RecyclerView.ViewHolder  {
        private TextView txtHeader;
        private ImageButton imbMore;
        private ImageButton imbAdd;
        private ConstraintLayout custom_layout_item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHeader = itemView.findViewById(R.id.txtHeader);
            imbMore = itemView.findViewById(R.id.imbMore);
            imbAdd = itemView.findViewById(R.id.imbAdd);







        }


    }


}
