package ru.mirea.solovievava.dialog;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public DatePickerDialog onCreateDialog(Bundle savedInstanceState){
        return  new DatePickerDialog(getActivity(), (DatePicker, year, month, day)->
                ((DialogAct)getActivity()).onDateSet(year, month, day),
                2023,01,01);

    }
}