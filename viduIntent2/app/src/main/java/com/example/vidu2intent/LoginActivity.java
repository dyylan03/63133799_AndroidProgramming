package com.example.vidu2intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnXacNhan = (Button) findViewById(R.id.btnOK);
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPassword);

                String TenDangNhap = edTenDN.getText().toString();
                String MatKhau = edPass.getText().toString();

                if(TenDangNhap.equals("nguyenducduy") && MatKhau.equals("123")){
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);

                    iQuiz.putExtra("Ten_Dang_Nhap", TenDangNhap);
                    iQuiz.putExtra("Mat_Khau", MatKhau);
                    startActivity(iQuiz);
                }else {
                    Toast.makeText(LoginActivity.this, "Ban nhap sai thong tin", Toast.LENGTH_LONG);
                }
            }
        });

    }
}