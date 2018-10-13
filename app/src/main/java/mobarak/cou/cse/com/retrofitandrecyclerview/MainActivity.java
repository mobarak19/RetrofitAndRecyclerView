package mobarak.cou.cse.com.retrofitandrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.gridlayout)
    Button gridlayout;
    @BindView(R.id.gridview)
    Button gridview;
    @BindView(R.id.sqlite)
    Button sqlite;
    @BindView(R.id.sharedpref)
    Button sharedpref;
    @BindView(R.id.retrofit)
    Button retrofit;
    @BindView(R.id.Glide)
    Button Glide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.gridlayout, R.id.gridview, R.id.sqlite, R.id.sharedpref, R.id.retrofit, R.id.Glide})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.gridlayout:


                Intent intent=new Intent(this,GridLayout.class);
                startActivity(intent);
                break;
            case R.id.gridview:

                Intent intent1=new Intent(this,GridViewPractice.class);
                startActivity(intent1);

                break;
            case R.id.sqlite:


                break;
            case R.id.sharedpref:


                break;
            case R.id.retrofit:


                break;
            case R.id.Glide:


                break;
        }
    }
}
