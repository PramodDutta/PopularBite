package witmergers.com.popularbite;

import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.pkmmte.view.CircularImageView;
import com.squareup.picasso.Picasso;

import it.gmariotti.cardslib.library.cards.material.MaterialLargeImageCard;
import it.gmariotti.cardslib.library.internal.Card;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ham);

        CircularImageView circularImageView = (CircularImageView)findViewById(R.id.cimage);
        //circularImageView.setBorderColor(getResources().getColor(R.color.GrayLight));
        circularImageView.setBorderWidth(10);
        //circularImageView.setSelectorColor(getResources().getColor(R.color.BlueLightTransparent));
        //circularImageView.setSelectorStrokeColor(getResources().getColor(R.color.primary));
        circularImageView.setSelectorStrokeWidth(10);
        circularImageView.addShadow();

      /*  MaterialLargeImageCard card =
                MaterialLargeImageCard.with(this)
                        .setTextOverImage("Italian Beaches")
                        .setTitle("This is Done")
                        .useDrawableId(R.drawable.bg)
                        .build();*/

      /* card.setOnClickListener(new Card.OnCardClickListener() {
           @Override
           public void onClick(Card card, View view) {
               Toast.makeText(getApplicationContext(),"hHU",Toast.LENGTH_SHORT)));
           }
       });
*/
       // ImageView imageView = (ImageView)findViewById(R.id.imageView);
       // Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(imageView);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        NavDrawerFrag drawerFrag;
        drawerFrag = (NavDrawerFrag)getSupportFragmentManager().findFragmentById(R.id.navigation_drawer_fragment);
        drawerFrag.setUp((DrawerLayout)findViewById(R.id.drawer_layout),toolbar);


        ViewPager pager = (ViewPager) rootView.findViewById(R.id.pager);
        pager.setAdapter(new ImageAdapter(this));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this, "This is Setting", Toast.LENGTH_SHORT).show();
            return true;
        } if (id == R.id.action_user) {
            Toast.makeText  (this,"This is Share Click",Toast.LENGTH_SHORT).show();
            return true;
        } if (id == R.id.action_search) {
            Toast.makeText(this,"This is Search",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"This is Search",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
