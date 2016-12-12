package com.example.lottery;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lottery.model.Lottery;
import com.example.lottery.model.SearchLottery;

public class MainActivity extends AppCompatActivity {

    private SearchLottery searchLottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchLottery = SearchLottery.getInstance(this);
        searchLottery.loadFromDatabase();



        /*dialog.setTitle("This is a title.");
        dialog.setMessage("This is a message");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { //... }
            });
            dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) { //... }
                });
                dialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { //... }
                    });*/

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button btn_search = (Button) findViewById(R.id.button);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editText.getText().toString();
                Lottery search = searchLottery.getSearchLottery(value);
                TextView textView = (TextView) findViewById(R.id.textView);

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                if(search == null){
                    dialog.setMessage("ขออภัย คุณไม่ถูกรางวัล");
                }
                else {
                    dialog.setMessage(search.detail);
                }

                dialog.show();
            }
        });

        Button btn_check_previous = (Button) findViewById(R.id.button2);
        btn_check_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CheckPreviousActivity.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_list) {
            Intent intent = new Intent(this, RandomActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
