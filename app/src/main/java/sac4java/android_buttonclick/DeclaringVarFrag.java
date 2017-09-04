package sac4java.android_buttonclick;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by it000483 on 5/9/17.
 */

public class DeclaringVarFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.declaring_variable_frag,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RelativeLayout relativeLayout = getActivity().findViewById(R.id.relativelayout);

        Button changeBackgrnd = getActivity().findViewById(R.id.changebackground);
        Button changeText = getActivity().findViewById(R.id.changeTextcolor);
        changeBackgrnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundColor(Color.YELLOW);
            }
        });

        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "clicked on Change Text Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
