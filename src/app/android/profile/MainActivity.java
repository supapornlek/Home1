package app.android.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements android.view.View.OnClickListener{
	private Button btna;
	private Button btnb;
	
	private TextView t1;
	private TextView t2;
	private TextView t3;
	private TextView t4;
	private TextView t5;
	private TextView t6;
	private TextView t7;
	private TextView t8;
	private TextView t9;
	private TextView t10;
	private TextView t11;
	private TextView t12;
	private TextView t13;
	private TextView t14;
	private TextView t15;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		supaporn();
	}


	private void supaporn() {
		// TODO Auto-generated method stub
		btna = (Button) findViewById(R.id.button1);
		btnb = (Button) findViewById(R.id.button2);
		t1 = (TextView) findViewById(R.id.textView1);
		t2 = (TextView) findViewById(R.id.textView2);
		t3 = (TextView) findViewById(R.id.textView3);
		t4 = (TextView) findViewById(R.id.textView4);
		t5 = (TextView) findViewById(R.id.textView5);
		t6 = (TextView) findViewById(R.id.textView6);
		t7 = (TextView) findViewById(R.id.textView7);
		t8 = (TextView) findViewById(R.id.textView8);
		t9 = (TextView) findViewById(R.id.textView9);
		t10 = (TextView) findViewById(R.id.textView10);
		t11 = (TextView) findViewById(R.id.textView11);
		t12 = (TextView) findViewById(R.id.textView12);
		t13 = (TextView) findViewById(R.id.textView13);
		t14 = (TextView) findViewById(R.id.textView14);
    	t15 = (TextView) findViewById(R.id.textView15);
		
		
		
		
		t1.setText("Supaporn Ploengpit");
		t2.setText("NickName");		
		t3.setText("Age");
		t4.setText("Height");
		t5.setText("Blood's Group");
		t6.setText("E-mail");
		t7.setText("Motto's Lifestyle");
		t8.setText("Birthday");
		t9.setText("lek");
		t10.setText("21");
		t11.setText("157");
		t12.setText("B");
		t13.setText("lek_1543@hotmail.com");
		t14.setText("Love me Love my Dog");
		t15.setText("24/06/36");


		btna.setOnClickListener(this);
		btnb.setOnClickListener(this);

	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId() ) {
		case R.id.button1:
			
			break;
		case R.id.button2:
			Intent sresume = new Intent(MainActivity.this, Resume.class);
			startActivity(sresume);

		default:
			break;
		}
	}
}
