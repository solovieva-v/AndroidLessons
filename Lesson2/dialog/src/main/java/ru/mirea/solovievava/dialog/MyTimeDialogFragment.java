package ru.mirea.solovievava.dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;


public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public TimePickerDialog onCreateDialog(Bundle savedInstanceState){
        return  new TimePickerDialog(getActivity(), (TimePicker,hour, minute)->
                ((DialogAct)getActivity()).onTimeSet(hour,minute),
                0,0,true);
    }
}
