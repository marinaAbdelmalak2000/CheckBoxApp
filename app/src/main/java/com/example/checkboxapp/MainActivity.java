package com.example.checkboxapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_order;
    CheckBox cbx_orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_order=findViewById(R.id.button);
        cbx_orders=findViewById(R.id.cbx_pizza);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate=getMenuInflater();
        inflate.inflate(R.menu.home_menue,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch(item.getItemId()){
            case R.id.search:
                Toast.makeText(this,"Searching",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(this,"Helping",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.logout:
                Toast.makeText(this,"Bye!",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    //show message in click button
       public void onCheckBoxed(View view){ //==>called method in code activity_main in two checkBoxs
            boolean checked=((CheckBox)view).isChecked();
            if(view.getId()==R.id.cbx_pizza){
                if(checked)
                    Toast.makeText(MainActivity.this," I want some pizza",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this," Non checked pizza",Toast.LENGTH_SHORT).show();
            }
            else if(view.getId()==R.id.cbx_iceCeram){
                    if(checked)
                        Toast.makeText(MainActivity.this," I want take some cool IceCream",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this," Non checked IceCream",Toast.LENGTH_SHORT).show();
            }

            //methods menue



       }
}