package app.ubon.demorecyclerview66;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.ubon.demorecyclerview66.model.Food;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("ยำหมูยอ");
        food.setFood_image("https://img.wongnai.com/p/1920x0/2017/07/29/a969fb6cb6404fbbb4a4596ce65ff9d1.jpg");
        food.setFood_price(40);
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("ส้มตำ");
        food2.setFood_image("https://img.wongnai.com/p/1300x640/2016/11/02/aa74497471c54aeba8eb47a011e1354d.jpg");
        food2.setFood_price(40);
        foods.add(food2);

        Food food3 = new Food();
        food3.setFood_name("ต้มยำ");
        food3.setFood_image("https://bing.com/th?id=OSK.746281f70bd635aad2aa2adc6034c9ae");
        food3.setFood_price(50);
        foods.add(food3);

        Food food4 = new Food();
        food4.setFood_name("กระเพราหมูสับ");
        food4.setFood_image("https://th.bing.com/th/id/OIP.VPvOvx1SSLESQyTkZAVbvAHaDx?pid=ImgDet&rs=1");
        food4.setFood_price(40);
        foods.add(food4);

        Food food5 = new Food();
        food5.setFood_name("เล้งแซ่บ");
        food5.setFood_image("https://f.ptcdn.info/705/057/000/p92sxm7t9Br8Wcmq4IZ-o.jpg");
        food5.setFood_price(50);
        foods.add(food5);

        Food food6 = new Food();
        food6.setFood_name("ผัดกระเพรากบ");
        food6.setFood_image("https://th.bing.com/th/id/OIP.VNDu2ksnNuYZMLLSowP7DwAAAA?pid=ImgDet&rs=1");
        food6.setFood_price(70);
        foods.add(food6);

        Food food7 = new Food();
        food7.setFood_name("สปาเก็ตตี้");
        food7.setFood_image("https://th.bing.com/th/id/OIP.zbDQE1Hw4A4AYiqtAq_T4AHaEK?pid=ImgDet&rs=1");
        food7.setFood_price(80);
        foods.add(food7);

        Food food8 = new Food();
        food8.setFood_name("สเต็ก");
        food8.setFood_image("https://th.bing.com/th/id/OIP.loVi4Jn89f7RE6SYSzXTfwHaFL?pid=ImgDet&rs=1");
        food8.setFood_price(80);
        foods.add(food8);




        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);

    }
}