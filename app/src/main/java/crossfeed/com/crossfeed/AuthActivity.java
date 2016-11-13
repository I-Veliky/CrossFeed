package crossfeed.com.crossfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;


public class AuthActivity extends  Activity {

    ListView auth_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       auth_list = (ListView)findViewById(R.id.auth_list);

    }
}
