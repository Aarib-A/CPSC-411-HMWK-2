package com.example.hmwk2part1;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hmwk2part1.model.Student;
import com.example.hmwk2part1.model.StudentDB;

import java.util.ArrayList;

public class StudentSummaryLVActivity extends Activity {

    protected LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);

        setContentView(R.layout.student_summary);

        root = findViewById(R.id.student_summary_ID);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudents();
        for (int i=0; i<studentList.size(); i++) {
            Student p = studentList.get(i);
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);

            TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
            firstNameView.setText(p.getFirstName());
            firstNameView.setPadding(10,10,10,10);

            TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
            lastNameView.setText(p.getLastName());
            lastNameView.setPadding(10,10,10,10);

            TextView cwid = (TextView) row_view.findViewById(R.id.CWID);
            cwid.setText(Integer.toString(p.getCWID()));
            cwid.setPadding(10,10,10,10);
            //
            root.addView(row_view);
        }


    }



}
