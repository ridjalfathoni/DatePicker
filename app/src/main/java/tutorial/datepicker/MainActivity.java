package tutorial.datepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker tgl;
    TextView tam;
    Button ganti;
    int bulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgl = (DatePicker) findViewById(R.id.kal);
        tam = (TextView) findViewById(R.id.tampil);
        tam.setText("Tampilkan Tanggal");
        ganti = (Button) findViewById(R.id.ganti);

        tam.setText(currentDate());
        ganti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tam.setText(currentDate());
            }
        });
    }

    public String currentDate() {
        StringBuilder mcurrentDate = new StringBuilder();
        bulan = tgl.getMonth() + 1;
        mcurrentDate.append("Date: " + bulan + "/" + tgl.getDayOfMonth() + "/" + tgl.getYear());
        return mcurrentDate.toString();
    }
}