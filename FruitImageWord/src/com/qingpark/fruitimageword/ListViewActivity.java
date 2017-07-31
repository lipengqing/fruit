package com.qingpark.fruitimageword;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
/**
 * test
 * 
 * @author SYSTEM
 *
 */
public class ListViewActivity extends Activity {

    private String[] data = {"Apple", "Orange", "Watermelon", "Pear"};
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        initFruits();
        ListView listview1 = (ListView) findViewById(R.id.listview1);
        FruitAdapter fruitAdapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);
        listview1.setAdapter(fruitAdapter);
        /*
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
        listview1.setAdapter(adapter);
        */
        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(ListViewActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.neiye_cs, "治下痢、降血脂、滋润皮肤。");
        fruitList.add(apple);
        Fruit banana = new Fruit("banana", R.drawable.neiye_cs, "香蕉被称为百果之冠,具有润肠通便,清热解毒,健脑益智,通血脉,填精髓,降血压等功效。");
        fruitList.add(banana);
        Fruit cherry = new Fruit("cherry", R.drawable.neiye_cs, "樱桃补中益气，祛风胜湿");
        fruitList.add(cherry);
        Fruit grape = new Fruit("grape", R.drawable.neiye_cs, "葡萄营养丰富、酸甜可口，因此成为世界四大水果(苹果、葡萄、柑橘和香蕉)之一");
        fruitList.add(grape);
        Fruit kiwi = new Fruit("kiwi", R.drawable.neiye_cs, "能促使血液循环顺畅，增进性能力。");
        fruitList.add(kiwi);
        Fruit lemon = new Fruit("lemon", R.drawable.neiye_cs, "可增强消化、出汗过多、食欲不振、体力倦怠、减肥解酒。");
        fruitList.add(lemon);
        Fruit mango = new Fruit("mango", R.drawable.neiye_cs, "芒果果实营养价值极高，维生素A的含量比杏子还要多出1倍 ");
        fruitList.add(mango);
        Fruit orange = new Fruit("orange", R.drawable.neiye_cs, "桔子含水量高、营养丰富");
        fruitList.add(orange);
        Fruit pear = new Fruit("pear", R.drawable.neiye_cs, "清解热毒、镇咳化痰。");
        fruitList.add(pear);
        Fruit persimmon = new Fruit("persimmon", R.drawable.neiye_cs, "柿子营养丰富，但要吃得健康，不过要注意一些与柿子相克的食物 ");
        fruitList.add(persimmon);
        Fruit pineapple = new Fruit("pineapple", R.drawable.neiye_cs, "菠萝清香宜人，汁多味甜，广受人们喜爱。");
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("strawberry", R.drawable.neiye_cs,
                "去火、解暑、清热；促进胃肠蠕动、帮助消化、改善便秘；预防痔疮、肠癌 ");
        fruitList.add(strawberry);
        Fruit watermelon = new Fruit("watermelon", R.drawable.neiye_cs, "西瓜味道甘味多汁，清爽解渴，是盛夏佳果。");
        fruitList.add(watermelon);


    }
}
