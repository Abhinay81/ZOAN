package com.example.zoan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private ArrayList RollNumber,Name,Branch,Year,Section,PhnNumber,Password;

    public MyAdapter(Context context,ArrayList RollNumber,ArrayList Name,ArrayList Branch,ArrayList Year,ArrayList Section,ArrayList PhnNumber,ArrayList Password){
        this.context = context;
        this.RollNumber = RollNumber;
        this.Name = Name;
        this.Branch = Branch;
        this.Year = Year;
        this.Section = Section;
        this.PhnNumber = PhnNumber;
        this.Password = Password;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.RollNumber.setText(String.valueOf(RollNumber.get(position)));
        holder.Name.setText(String.valueOf(Name.get(position)));
        holder.Branch.setText(String.valueOf(Branch.get(position)));
        holder.Year.setText(String.valueOf(Year.get(position)));
        holder.Section.setText(String.valueOf(Section.get(position)));
        holder.PhnNumber.setText(String.valueOf(PhnNumber.get(position)));
        holder.Password.setText(String.valueOf(Password.get(position)));
    }
    @Override
    public int getItemCount() {
        return RollNumber.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView RollNumber,Name,Branch,Year,Section,PhnNumber,Password;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            RollNumber = itemView.findViewById(R.id.textRollNumber);
            Name = itemView.findViewById(R.id.textName);
            Branch = itemView.findViewById(R.id.textBranch);
            Year = itemView.findViewById(R.id.textYear);
            Section = itemView.findViewById(R.id.textSection);
            PhnNumber = itemView.findViewById(R.id.textPhnNumber);
            Password = itemView.findViewById(R.id.textPassword);

        }
    }
}
