package com.example.calculadoraashanti;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener{

	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean mult = false;
	boolean div = false;
	boolean exp = false;
	Double[] numero = new Double[20] ;
	Double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n0.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n0.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n0.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n0.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n0.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n0.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n0.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n0.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n0.setOnClickListener(this);
        
        Button punto = (Button)findViewById(R.id.btnP);
        n0.setOnClickListener(this);
        Button ac = (Button)findViewById(R.id.btnAC);
        n0.setOnClickListener(this);
        Button coseno = (Button)findViewById(R.id.btnCoseno);
        n0.setOnClickListener(this);
        Button del = (Button)findViewById(R.id.btnDel);
        n0.setOnClickListener(this);
        Button entre = (Button)findViewById(R.id.btnEntre);
        n0.setOnClickListener(this);
        Button exp = (Button)findViewById(R.id.btnExp);
        n0.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnIgual);
        n0.setOnClickListener(this);
        Button mas = (Button)findViewById(R.id.btnMas);
        n0.setOnClickListener(this);
        Button menos = (Button)findViewById(R.id.btnMenos);
        n0.setOnClickListener(this);
        Button por = (Button)findViewById(R.id.btnPor);
        n0.setOnClickListener(this);
        Button r = (Button)findViewById(R.id.btnR);
        n0.setOnClickListener(this);
        Button seno = (Button)findViewById(R.id.btnSeno);
        n0.setOnClickListener(this);
        Button tangente = (Button)findViewById(R.id.btnTangente);
        n0.setOnClickListener(this);
        Button pb = (Button)findViewById(R.id.pb);
        n0.setOnClickListener(this);


        
    }

	@Override
	public void onClick(View v) {
		TextView pantalla = (TextView)findViewById(R.id.texto);
		int seleccion = v.getId();
		String a = pantalla.getText().toString();
		
		try{
		switch(seleccion)
		{
		case R.id.btn0:
			//accion
			pantalla.setText(a+"0");
			break;
		case R.id.btn1:
			//accion
			pantalla.setText(a+"1");
			break;
		case R.id.btn2:
			//accion
			pantalla.setText(a+"2");
			break;
		case R.id.btn3:
			//accion
			pantalla.setText(a+"3");
			break;
		case R.id.btn4:
			//accion
			pantalla.setText(a+"4");
			break;
		case R.id.btn5:
			//accion
			pantalla.setText(a+"5");
			break;
		case R.id.btn6:
			//accion
			pantalla.setText(a+"6");
			break;
		case R.id.btn7:
			//accion
			pantalla.setText(a+"7");
			break;
		case R.id.btn8:
			//accion
			pantalla.setText(a+"8");
			break;
		case R.id.btn9:
			//accion
			pantalla.setText(a+"9");
			break;
		case R.id.btnP:
			//accion
			if(decimal==false){
				pantalla.setText(a+".	");
				decimal=true;
				}else{
					return;
				}
			break;
		case R.id.btnMas:
			suma =true;
			numero[0] = Double.parseDouble(a);
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnMenos:
			numero[0] = Double.parseDouble(a);
			resta =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnPor:
			numero[0] = Double.parseDouble(a);
			mult =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnEntre:
			numero[0] = Double.parseDouble(a);
			div = true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnDel:
			decimal = false;
			break;
		case R.id.btnAC:
			pantalla.setText("");
		decimal = false;
		
			break;
		case R.id.btnExp:
			numero[0] = Double.parseDouble(a);
			exp =true;
			pantalla.setText("");
			decimal =false;
			break;
		case R.id.btnIgual:
			numero[1] = Double.parseDouble(a);
			if(suma == true){
			resultado = numero[0] + numero[1];	
			pantalla.setText(String.valueOf(resultado));	
			}else if(resta ==true){
			resultado = numero[0] - numero[1];	
			pantalla.setText(String.valueOf(resultado));	
			}else if(div ==true){
			resultado = numero[0] / numero[1];	
			pantalla.setText(String.valueOf(resultado));
			}else if(mult ==true){
			resultado = numero[0] * numero[1];	
			pantalla.setText(String.valueOf(resultado));
			}else if(div ==true){
			resultado = numero[0] / numero[1];	
			pantalla.setText(String.valueOf(resultado));
			}else if(exp ==true){
			resultado = numero[0] * numero[0];	
			pantalla.setText(String.valueOf(resultado));
			}
			decimal =false;
			suma =false;
			resta =false;
			mult =false;
			div =false;
			exp = false;
			break;
		case R.id.btnTangente:
			break;
		}
		}
		catch(Exception e){
			pantalla.setText("error");
		};
		
	}
	}


   