package hk.reality.stock;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {    
    public static final String TAB_STOCK = "stock";
    public static final String TAB_INDEX = "index";    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost host = getTabHost();

        host.addTab(host
                .newTabSpec(TAB_INDEX)
                .setIndicator(getResources().getString(R.string.tab_index))
                .setContent(new Intent(this, IndexActivity.class)));

        host.addTab(host
                .newTabSpec(TAB_STOCK)
                .setIndicator(getResources().getString(R.string.tab_stock))
                .setContent(new Intent(this, PortfolioActivity.class)));

    }
}