package gridviewandroidimage.android.acadgild.com.optionsmenu92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MENU_ITEM_ITEM1 = 1;

    String[] menuItems= new String[]{"Computer", "Gamepad", "Camera", "Video", "Email"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        for(int i=0; i<menuItems.length; i++)
        {
            menu.add(Menu.NONE,i,0,menuItems[i]);
        }


        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(MainActivity.this, "Item Name is "+item.toString(), Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
