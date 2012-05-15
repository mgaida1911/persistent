package nl.topicus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Persistent_ProjectActivity extends Activity {

	private Button buttonLocaties;
	private Button buttonVervoersmiddelen;
	private Button buttonReisPlannen;
	private Button buttonExit;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);

		buttonLocaties = (Button) findViewById(R.id.buttonLocaties);
		buttonVervoersmiddelen = (Button) findViewById(R.id.buttonVervoersmiddelen);
		buttonReisPlannen = (Button) findViewById(R.id.buttonReisPlannen);
		buttonExit = (Button) findViewById(R.id.buttonExit);
		registerButtonLocaties();
		registerButtonVervoersmiddelen();
		registerButtonReisPlannen();
		registerButtonExit();
	}
	private void registerButtonLocaties() {
		buttonLocaties.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), LocatieActivity.class);
				startActivity(intent);
			}
		});
	}


	private void registerButtonExit() {
		buttonExit.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}

	private void registerButtonReisPlannen() {
		buttonReisPlannen.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), ReisPlannenActivity.class);
				startActivity(intent);
			}
		});
	}
	private void registerButtonVervoersmiddelen() {		
		buttonVervoersmiddelen.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(v.getContext(), VervoersmiddelActivity.class);
			startActivity(intent);
		}
	});
	}
}