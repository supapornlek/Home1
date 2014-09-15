package app.android.profile;

import android.R.string;
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
	
	private string g1,g2,g3,g4,g5,g6,g7,g8;
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		supaporn();

	//	DBcontrol_421 dBcontrol_421=new DBcontrol_421(this);
	//	dBcontrol_421.getWritableDatabase();
	}


	private void supaporn() {
		// TODO Auto-generated method stub
		btna = (Button) findViewById(R.id.btn11);
		btnb = (Button) findViewById(R.id.btn12);
		t1 = (TextView) findViewById(R.id.tex11);
		t2 = (TextView) findViewById(R.id.tex12);
		t3 = (TextView) findViewById(R.id.tex14);
		t4 = (TextView) findViewById(R.id.tex16);
		t5 = (TextView) findViewById(R.id.tex18);
		t6 = (TextView) findViewById(R.id.tex20);
		t7 = (TextView) findViewById(R.id.tex22);
		t8 = (TextView) findViewById(R.id.tex24);
		t9 = (TextView) findViewById(R.id.tex13);
		t10 = (TextView) findViewById(R.id.tex15);
		t11 = (TextView) findViewById(R.id.tex17);
		t12 = (TextView) findViewById(R.id.tex19);
		t13 = (TextView) findViewById(R.id.tex21);
		t14 = (TextView) findViewById(R.id.tex23);
    	t15 = (TextView) findViewById(R.id.tex25);
		
		
		
		
		t1.setText("Supaporn Ploengpit");
		t2.setText("NickNBlood's Groupame");		
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
		
		String g1 = getIntent().getStringExtra("p1");
		String g2 = getIntent().getStringExtra("p2");
		String g3 = getIntent().getStringExtra("p3");
		String g4 = getIntent().getStringExtra("p4");
		String g5 = getIntent().getStringExtra("p5");
		String g6 = getIntent().getStringExtra("p6");
		String g7 = getIntent().getStringExtra("p7");
		String g8 = getIntent().getStringExtra("p8");
		
		if(t1!=null){
			t1.setText("Supaporn Ploengpit");
			t12.setText("NickName");		
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
		}
		if(g1!=null){
			t1.setText(g1);
			t9.setText(g2);
			t10.setText(g3);
			t11.setText(g4);
			t12.setText(g5);
			t13.setText(g6);
			t14.setText(g7);
			t15.setText(g8);
			
		}

	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId() ) {
		case R.id.btn11:
			Intent sresume = new Intent(MainActivity.this, edit.class);
			startActivity(sresume);
			
			break;
		case R.id.btn12:
			Intent ssresume = new Intent(MainActivity.this, Resume.class);
			startActivity(ssresume);

		default:
			break;
		}
	}
}
