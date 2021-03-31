package a.e.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    TextView details;
    RViewAdapter rViewAdapter = new RViewAdapter(DummyContent.ITEMS);

    public static final List<DummyContent.DummyItem> ITEMS = new ArrayList<DummyContent.DummyItem>();
    private static final int COUNT = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        details = findViewById(R.id.ARG_ITEM_ID);

        for (int k = 1; k <= COUNT; k++)  {
            StringBuilder builder = new StringBuilder();
            builder.append("Информация об элементе:   ").append(k);
            //details.setText(k);
            for (int j = 0; j < k; j++) {
                builder.append("\n Детальная информация. ");
            }

            ITEMS.add(new DummyContent.DummyItem(String.valueOf(k), "Элемент " + k, builder.toString()));
            details.setText(builder);
        }




    }
}