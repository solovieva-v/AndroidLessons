package ru.mirea.solovievava.dialog;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Please wait a couple of minutes")
                .setPositiveButton("Всё по красоте,родной >_<", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((DialogAct)getActivity()).onOkClicked();
                        dialogInterface.cancel();
                    }
                });
        return builder.create();
    }
}
