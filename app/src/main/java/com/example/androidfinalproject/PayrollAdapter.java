package com.example.androidfinalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PayrollAdapter extends RecyclerView.Adapter<PayrollAdapter.ViewHolder> {
    private Context context;
    private List<PayrollData> payrollDataList;
    private OnPayrollClicked onPayrollClicked;

    public PayrollAdapter(Context context, List<PayrollData> payrollDataList, OnPayrollClicked onPayrollClicked) {
        this.context = context;
        this.payrollDataList = payrollDataList;
        this.onPayrollClicked = onPayrollClicked;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_payrol_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return payrollDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onPayrollClicked.onPayrollClicked(getAdapterPosition());
                }
            });
        }
    }
}
