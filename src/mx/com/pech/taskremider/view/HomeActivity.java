package mx.com.pech.taskremider.view;

import mx.com.pech.taskremider.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListAdapter;

public class HomeActivity extends ListActivity {

	private ListAdapter taskListAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
