package psn.projetosn;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Matheus on 22/09/2018.
 */

public class FudidoFragment extends Fragment {

    private TextView textMessage;

    public FudidoFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fudido, container, false);
    }
}
