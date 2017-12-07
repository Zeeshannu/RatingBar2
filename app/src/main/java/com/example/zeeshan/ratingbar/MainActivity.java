package com.example.zeeshan.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codemybrainsout.ratingdialog.RatingDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private RatingBar ratingBar;
    private TextView tvRateCount,tvRateMessage;
    private float ratedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
//                .session(1)
//                .threshold(3)
//                .title("How was your experience with us?")
//                .titleTextColor(R.color.black)
//                .positiveButtonText("Not Now")
//                .negativeButtonText("Never")
//                .positiveButtonTextColor(R.color.white)
//                .negativeButtonTextColor(R.color.accent)
//                .formTitle("Submit Feedback")
//                .formHint("Tell us where we can improve")
//                .formSubmitText("Submit")
//                .formCancelText("Cancel")
//                .ratingBarColor(R.color.accent)
//                .playstoreUrl("YOUR_URL")
//                .onThresholdCleared(new RatingDialog.Builder.RatingThresholdClearedListener() {
//                    @Override
//                    public void onThresholdCleared(RatingDialog ratingDialog, float rating, boolean thresholdCleared) {
//                        //do something
//                        ratingDialog.dismiss();
//                    }
//                })
//                .onThresholdFailed(new RatingDialog.Builder.RatingThresholdFailedListener() {
//                    @Override
//                    public void onThresholdFailed(RatingDialog ratingDialog, float rating, boolean thresholdCleared) {
//                        //do something
//                        ratingDialog.dismiss();
//                    }
//                })
//                .onRatingChanged(new RatingDialog.Builder.RatingDialogListener() {
//                    @Override
//                    public void onRatingSelected(float rating, boolean thresholdCleared) {
//
//                    }
//                })
//                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
//                    @Override
//                    public void onFormSubmitted(String feedback) {
//
//                    }
//                }).build();
//
//        ratingDialog.show();
//    }

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        tvRateCount = (TextView) findViewById(R.id.tvRateCount);
        tvRateMessage = (TextView) findViewById(R.id.tvRateMessage);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                ratedValue = ratingBar.getRating();
                tvRateCount.setText("Your Rating : "
                        + ratedValue + "/5.");

                if(ratedValue<1){
                    tvRateMessage.setText("ohh ho...");
                }else if(ratedValue<2){
                    tvRateMessage.setText("Ok.");
                }else if(ratedValue<3){
                    tvRateMessage.setText("Not bad.");
                }else if(ratedValue<4){
                    tvRateMessage.setText("Nice");
                }else if(ratedValue<5){
                    tvRateMessage.setText("Very Nice");
                }else if(ratedValue==5){
                    tvRateMessage.setText("Thank you..!!!");
                }
            }
        });

    }
}
