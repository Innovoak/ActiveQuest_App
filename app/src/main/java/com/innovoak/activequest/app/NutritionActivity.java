package com.innovoak.activequest.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;

public class NutritionActivity extends AppCompatActivity implements View.OnClickListener {

	private SearchView searchView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nutrition);

		searchView = findViewById(R.id.search_bar);
		searchView.setOnClickListener(this);



	}


	@Override
	public void onClick(View view) {
		if (view == searchView) {
			Log.d(NutritionActivity.class.getName(), "We have clicked the search view!!!");
			// 3 main tasks

			// 1. Create all the client representatives of the server side
			// for each RepositoryServlet .. we need a ClientRepository which points to the URL
			// new URL(R.string.url + "users") // @WebServlet("/users")
			// 2. Create an image, video, and query client which map to the server side ones

			// 3. Create the actual controller stuff

		}
	}
}