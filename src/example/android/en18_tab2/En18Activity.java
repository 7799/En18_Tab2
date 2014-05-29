package example.android.en18_tab2;


import android.R;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class En18Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_en);

		getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		ActionBar.Tab tab1 =getActionBar().newTab();
		tab1.setText("設定");
		tab1.setIcon(android.R.drawable.ic_menu_add);
		tab1.setTabListener(new TabListener(new Fragment1()));
		ActionBar.Tab tab2 =getActionBar().newTab();
		tab2.setText("表示");
		tab2.setIcon(android.R.drawable.ic_menu_info_details);
		tab2.setTabListener(new TabListener(new Fragment2()));
		
		getActionBar().addTab(tab1);
		getActionBar().addTab(tab2);
		
	}

	private class TabListener implements ActionBar.TabListener{
		private Fragment fragment;
		
		public TabListener(Fragment fragment){
			this.fragment = fragment;
		}



		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
		ft.add(R.id.ll_tab, fragment);		
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
		ft.remove(fragment);
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.en18, menu);
		return true;
	}

}
