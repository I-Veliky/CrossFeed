package crossfeed.com.crossfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    ImageView plus_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(false)
        setContentView(R.layout.activity_main);

        setContentView(R.layout.empty);

        plus_img = (ImageView)findViewById(R.id.plus);
        plus_img.setImageResource(R.drawable.plus_icon);
        plus_img.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);

    }
}
