package johnsoaa.awesometeams.com.scrumify;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

public class SprintPlanningActivity extends Activity implements View.OnClickListener{
    public int pageCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint_planning);
        pageCounter=0;

        ((Button)findViewById(R.id.next_button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.next_button:
                pageCounter++;
                setTextViews();
                break;
        }
    }

    private void setTextViews() {
        String title ="";
        String content="";
        switch (pageCounter){
            case 0:
                title = getString(R.string.when_does_it_start_text);
                content = getString(R.string.when_is_it_planned_text);
                break;
            case 1:
                title = getString(R.string.what_are_tasks);
                content = getString(R.string.what_are_tasks_content);
                break;
            case 2:
                title = getString(R.string.importance_of_tasks_title);
                content = getString(R.string.importance_of_tasks);
                break;
        }
        ((TextView)findViewById(R.id.planning_title_text_view)).setText(title);
        ((TextView)findViewById(R.id.planning_content_text_view)).setText(content);
    }
}
