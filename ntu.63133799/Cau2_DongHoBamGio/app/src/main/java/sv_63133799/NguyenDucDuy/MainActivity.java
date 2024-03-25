package sv_63133799.NguyenDucDuy;
import androidx.core.content.ContextCompat;
import android.widget.Toast;
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
    private static final int MAX_LAPS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTime = findViewById(R.id.textViewTime);
        buttonStart = findViewById(R.id.buttonStart);
        buttonPause = findViewById(R.id.buttonPause);
        buttonReset = findViewById(R.id.buttonReset);
        buttonLap = findViewById(R.id.buttonLap);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                handler.postDelayed(updateTimer, 0);
                buttonReset.setEnabled(false);
            }
        });
        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeSwapBuff += timeInMilliseconds;
                handler.removeCallbacks(updateTimer);
                buttonReset.setEnabled(true);
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeSwapBuff = 0L;
                startTime = 0L;
                textViewTime.setText("00h: 00m: 00s: 000ms");
                lapNumber = 1;
                LinearLayout linearLayoutLaps = findViewById(R.id.linearLayoutLaps);
                linearLayoutLaps.removeAllViews();
            }
        });
        buttonLap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra nếu số lượng vòng đã đạt đến giới hạn
                if (lapNumber <= MAX_LAPS) {
                    addLapTime();
                } else {
                    // Hiển thị thông báo hoặc thực hiện hành động phù hợp khi đạt đến giới hạn
                    Toast.makeText(MainActivity.this, "Đã đạt đến giới hạn vòng.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private Runnable updateTimer = new Runnable() {
        public void run() {
            timeInMilliseconds = System.currentTimeMillis() - startTime;
            updatedTime = timeSwapBuff + timeInMilliseconds;

            int hours = (int) (updatedTime / (1000 * 60 * 60));
            int minutes = (int) (updatedTime % (1000 * 60 * 60)) / (1000 * 60);
            int seconds = (int) ((updatedTime % (1000 * 60 * 60)) % (1000 * 60) / 1000);
            int milliseconds = (int) ((updatedTime % (1000 * 60 * 60)) % (1000 * 60) % 1000);

            String timeFormatted = String.format("%02dh: %02dm: %02ds: %03dms", hours, minutes, seconds, milliseconds);
            textViewTime.setText(timeFormatted);
            handler.postDelayed(this, 0);
        }
    };

    private void addLapTime() {
        LinearLayout linearLayoutLaps = findViewById(R.id.linearLayoutLaps);
        TextView lapTextView = new TextView(this);
        lapTextView.setText("Vòng " + lapNumber + ": " + textViewTime.getText());
        lapTextView.setTextSize(20);

        // Tạo một lớp cho nút Xóa
        class DeleteButtonOnClickListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                // Xóa vòng khi nút xóa được nhấn
                linearLayoutLaps.removeView((View) v.getParent());
            }
        }

        // Tạo một đối tượng lớp DeleteButtonOnClickListener để xử lý sự kiện khi nút xóa được nhấn
        DeleteButtonOnClickListener deleteButtonOnClickListener = new DeleteButtonOnClickListener();
        Button deleteButton = new Button(this);
        deleteButton.setText("Xóa");
        int color = ContextCompat.getColor(this, R.color.delete_button_color);
        deleteButton.setBackgroundColor(color);
        deleteButton.setOnClickListener(deleteButtonOnClickListener);

        // Thêm TextView và Button vào một layout ngang
        LinearLayout horizontalLayout = new LinearLayout(this);
        horizontalLayout.setOrientation(LinearLayout.HORIZONTAL);
        horizontalLayout.addView(lapTextView);
        horizontalLayout.addView(deleteButton);

        // Thêm layout ngang vào layout chính
        linearLayoutLaps.addView(horizontalLayout);

        lapNumber++;
    }
}
