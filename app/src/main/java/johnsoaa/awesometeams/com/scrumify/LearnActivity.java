package johnsoaa.awesometeams.com.scrumify;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.ImageButton;

import com.afollestad.materialdialogs.MaterialDialog;


public class LearnActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        MaterialDialog.Builder db = new MaterialDialog.Builder(this);
        db.title(R.string.introduction_title_text)
                .content(R.string.introduction_text);
        db.positiveText(R.string.ok_text)
                .titleColorRes(R.color.button_background_color)
                .contentColorRes(R.color.button_text_color)
                .positiveColorRes(R.color.accent_material_light);

        db.show();
        ((ImageButton) (findViewById(R.id.basicConceptsButton))).setOnClickListener(this);
        ((ImageButton) (findViewById(R.id.sprint_planning_button))).setOnClickListener(this);
        ((ImageButton) (findViewById(R.id.client_meeting_button))).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.basicConceptsButton:
                Intent basics = new Intent(this, BasicConceptsActivity.class);
                this.startActivity(basics);
                break;
            case R.id.sprint_planning_button:
                Intent planning = new Intent(this, SprintPlanningActivity.class);
                this.startActivity(planning);
                break;
            case R.id.client_meeting_button:
                Intent client_meeting = new Intent(this, ClientMeetingsActivity.class);
                this.startActivity(client_meeting);
                break;
        }
    }
}
