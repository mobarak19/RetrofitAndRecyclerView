package mobarak.cou.cse.com.retrofitandrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridViewPractice extends AppCompatActivity {

    private static final String TAG = "GridViewPractice";
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_practice);

        gridView=findViewById(R.id.gridviewlayout);

        String[] s=(getResources().getStringArray(R.array.country));
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            list.add(s[i]);
            Log.d(TAG, "onCreate: "+s[i]);
        }
        gridView.setAdapter(new girdAdapper(this,list));




    }

 class girdAdapper extends BaseAdapter{

        List<String> stringList;
        Context context;
        girdAdapper(Context context, List<String> list){
           stringList=list;
           this.context=context;

        }

     @Override
     public int getCount() {
         return stringList.size();
     }

     @Override
     public Object getItem(int position) {
         return stringList.get(position);
     }

     @Override
     public long getItemId(int position) {
         return position;
     }

     class MyviewHolder{
            TextView textView;
            MyviewHolder(View v){
                textView=v.findViewById(R.id.country_name);
            }

     }
     @Override
     public View getView(final int position, View convertView, ViewGroup parent) {

            MyviewHolder myviewHolder=null;
 View row=convertView;
         if (convertView==null){
             LayoutInflater layoutInflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= layoutInflater.inflate(R.layout.gridgiewitem,parent,false);
            myviewHolder=new MyviewHolder(row);

            row.setTag(myviewHolder);




         }
         else {
             myviewHolder= (MyviewHolder) row.getTag();


         }
         myviewHolder.textView.setText(stringList.get(position));
         myviewHolder.textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(context,""+stringList.get(position),Toast.LENGTH_LONG).show();
             }
         });
         return row;
     }
 }
}
