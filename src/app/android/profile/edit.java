package app.android.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class edit extends Activity implements OnClickListener {
	private TextView t11,t122,t133,t144,t155,t166,t177;
	private EditText  t12,t13,t14,t15,t16,t17,t18,t19;
    private Button b11;

	
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.edit);
	lek();
	
}

private void lek() {
	// TODO Auto-generated method stub
	t11 = (TextView) findViewById(R.id.tex11);
	t11.setText("Name");
	t12 =  (EditText) findViewById(R.id.editText1);
	/////////////////////////////////////////////////////
	t122 = (TextView) findViewById(R.id.text1);
	t122.setText("nickname");
	t13 =  (EditText) findViewById(R.id.editText2);
	////////////////////////////////////////////////////////
	t133 = (TextView) findViewById(R.id.text2);
	t133.setText("Age");
	t14 =  (EditText) findViewById(R.id.editText3);
	////////////////////////////////////////////////////////
	t144 = (TextView) findViewById(R.id.text3);
	t144.setText("Height");
	t15 =  (EditText) findViewById(R.id.editText4);
	/////////////////////////////////////////////////////
	t155 = (TextView) findViewById(R.id.text5);
	t155.setText("Blood's Group");
	t16 =  (EditText) findViewById(R.id.editText5);
	////////////////////////////////////////////////////////
	t133 = (TextView) findViewById(R.id.text6);
	t133.setText("E-mail");
	t17 =  (EditText) findViewById(R.id.editText6);
	////////////////////////////////////////////////////////
	t166 = (TextView) findViewById(R.id.text7);
	t166.setText("Motto's Lifestyle");
	t18 =  (EditText) findViewById(R.id.editText7);
	////////////////////////////////////////////////////////
	t177 = (TextView) findViewById(R.id.text8);
	t177.setText("Birthday");
	t19 =  (EditText) findViewById(R.id.editText8);
	////////////////////////////////////////////////////////
	
	
	
	
	t11 = (Button) findViewById(R.id.button80);
t11.setOnClickListener(this);
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch (v.getId() ){
		case R.id.button80:
			Intent l = new Intent(edit.this,MainActivity.class);
			
			String name = t12.getText().toString();
			String name1 = t13.getText().toString();
			String name2 = t14.getText().toString();
			String name3 = t15.getText().toString();
			String name4 = t16.getText().toString();
			String name5 = t17.getText().toString();
			String name6 = t18.getText().toString();
			String name7 = t19.getText().toString();
			
			l.putExtra("p1", name);
			l.putExtra("p2", name1);
			l.putExtra("p3", name2);
			l.putExtra("p4", name3);
			l.putExtra("p5", name4);
			l.putExtra("p6", name5);
			l.putExtra("p7", name6);
			l.putExtra("p8", name7);
			startActivity(l);
		default:
	break;
}
	
	
}
}