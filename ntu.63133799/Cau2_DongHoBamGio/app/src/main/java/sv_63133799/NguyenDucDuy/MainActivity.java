package sv_63133799.NguyenDucDuy;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTime;
    private Button buttonStart, buttonPause, buttonReset, buttonLap;
    private long startTime = 0L;
    private long timeInMilliseconds = 0L;
    private long timeSwapBuff = 0L;
    private long updatedTime = 0L;
    private Handler handler = new Handler();
    private int lapNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTime = findViewById(R.id.textViewTime);
        buttonStart = findViewById(R.id.buttonStart);
        buttonPause = findViewById(R.id.buttonPause);
        buttonReset = findViewById(R.id.buttonReset);
        buttonLap = findViewById(R.id.buttonLap);
    }
}
