package crossfeed.com.crossfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Roman on 08.11.2016.
 */

public class AuthListAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] net_names;
    private Integer[] net_pics;

    public AuthListAdapter(Context context, String[] net_names, Integer[] net_pics) {
        super(context, R.layout.single_item_net, net_names);

        this.context = context;
        this.net_names = net_names;
        this.net_pics = net_pics;

        @Override
        public View getView(int position, View view, ViewGroup parent) {

        }

    }
}
