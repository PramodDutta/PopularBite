package witmergers.com.popularbite;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavDrawerFrag extends Fragment {

    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrwawerLayout;

    public NavDrawerFrag() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_drawer, container, false);
    }


    public void setUp(DrawerLayout d , Toolbar t) {

        mDrwawerLayout = d;
        mActionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(),d,t,R.string.d_open,R.string.d_close)
                {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }
        };

        mDrwawerLayout.setDrawerListener(mActionBarDrawerToggle);
        mDrwawerLayout.post(new Runnable() {
            @Override
            public void run() {
               mActionBarDrawerToggle.syncState();
            }
        });
    }
}
