package com.calin.anomalytracker.client;

import java.util.List;

import com.calin.anomalytracker.R;
import com.calin.anomalytracker.businesslogic.facade.AnomalyAsyncRequestHandler;
import com.calin.anomalytracker.businesslogic.facade.AnomalyFacade;
import com.calin.anomalytracker.businesslogic.models.AnomalyModel;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AnomalyFacade.getInstance().getAnomalies(new AnomalyAsyncRequestHandler(){
			
				@Override
				public void requestFailed() {
					Log.e("##", "failed");
				}
				
			@Override
			public void exceptionListsRetrieved(List<AnomalyModel> list) {
				for (AnomalyModel m : list) {
					Log.d("##", m.getExceptionName() + " " + m.getServerName() + " " + m.getId());
				}
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
