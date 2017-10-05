package bigger.gradle.maaclab.ac.gradlebiggerapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Intent;
import bigger.gradle.maaclab.ac.androidlibrary.MainActivityAndroid;


public class MainActivityFragment extends Fragment {

    private Button button;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_activity, container, false);


        button = (Button) root.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndpointsAsyncTask(){
                    @Override
                    protected void onPostExecute(String result) {
                        Intent intent = new Intent(getActivity(), MainActivityAndroid.class);
                        intent.putExtra("extra joke", result);
                        startActivity(intent);
                    }
                }.execute(new Pair<Context, String>(getActivity().getApplicationContext(), "Ankit"));

            }
        });

        return root;
    }
}
