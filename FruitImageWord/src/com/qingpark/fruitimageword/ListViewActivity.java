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
        Fruit apple = new Fruit("Apple", R.drawable.neiye_cs, "����������Ѫ֬������Ƥ����");
        fruitList.add(apple);
        Fruit banana = new Fruit("banana", R.drawable.neiye_cs, "�㽶����Ϊ�ٹ�֮��,������ͨ��,���Ƚⶾ,��������,ͨѪ��,���,��Ѫѹ�ȹ�Ч��");
        fruitList.add(banana);
        Fruit cherry = new Fruit("cherry", R.drawable.neiye_cs, "ӣ�Ҳ������������ʤʪ");
        fruitList.add(cherry);
        Fruit grape = new Fruit("grape", R.drawable.neiye_cs, "����Ӫ���ḻ������ɿڣ���˳�Ϊ�����Ĵ�ˮ��(ƻ�������ѡ����ٺ��㽶)֮һ");
        fruitList.add(grape);
        Fruit kiwi = new Fruit("kiwi", R.drawable.neiye_cs, "�ܴ�ʹѪҺѭ��˳����������������");
        fruitList.add(kiwi);
        Fruit lemon = new Fruit("lemon", R.drawable.neiye_cs, "����ǿ�������������ࡢʳ�����������뵡�����ʽ�ơ�");
        fruitList.add(lemon);
        Fruit mango = new Fruit("mango", R.drawable.neiye_cs, "â����ʵӪ����ֵ���ߣ�ά����A�ĺ��������ӻ�Ҫ���1�� ");
        fruitList.add(mango);
        Fruit orange = new Fruit("orange", R.drawable.neiye_cs, "���Ӻ�ˮ���ߡ�Ӫ���ḻ");
        fruitList.add(orange);
        Fruit pear = new Fruit("pear", R.drawable.neiye_cs, "����ȶ�����Ȼ�̵��");
        fruitList.add(pear);
        Fruit persimmon = new Fruit("persimmon", R.drawable.neiye_cs, "����Ӫ���ḻ����Ҫ�Եý���������Ҫע��һЩ��������˵�ʳ�� ");
        fruitList.add(persimmon);
        Fruit pineapple = new Fruit("pineapple", R.drawable.neiye_cs, "�����������ˣ�֭��ζ�𣬹�������ϲ����");
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("strawberry", R.drawable.neiye_cs,
                "ȥ�𡢽�����ȣ��ٽ�θ���䶯���������������Ʊ��أ�Ԥ���̴������� ");
        fruitList.add(strawberry);
        Fruit watermelon = new Fruit("watermelon", R.drawable.neiye_cs, "����ζ����ζ��֭����ˬ��ʣ���ʢ�ļѹ���");
        fruitList.add(watermelon);


    }
}
