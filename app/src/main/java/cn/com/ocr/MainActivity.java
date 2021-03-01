package cn.com.ocr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void start(View view) {
        System.out.println("~~start~~");

        OCR.getInstance(this).initAccessTokenWithAkSk(new OnResultListener<AccessToken>() {

            @Override
            public void onResult(AccessToken accessToken) {
                System.out.println("accessToken = " + accessToken);
                System.out.println("getAccessToken is " + accessToken.getAccessToken());
                System.out.println("getTokenJson is " + accessToken.getTokenJson());
                System.out.println("getExpiresIn is " + accessToken.getExpiresIn());
                System.out.println("getExpiresTime is " + accessToken.getExpiresTime());
                System.out.println("getLic is " + accessToken.getLic());
            }

            @Override
            public void onError(OCRError ocrError) {
                System.out.println("ocrError = " + ocrError);
            }
        }, getApplicationContext(), "YTLgrptu02Rcw0XGpGmCsfgI", "PPWi5BmFt3MIuQjjejw7rI7sM8FiD0Na");

    }


    public void stop(View view) {
        System.out.println("~~stop~~");
    }
}