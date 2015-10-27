package johnsoaa.awesometeams.com.scrumify;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;

public class BasicConceptsActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concepts);

        ((Button) findViewById(R.id.how_its_done_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.everyDay_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.transparency_button)).setOnClickListener(this);
        ((Button) findViewById(R.id.code_management_button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MaterialDialog.Builder ab = new MaterialDialog.Builder(this);
        ab.titleColorRes(R.color.button_background_color)
                .contentColorRes(R.color.button_text_color)
                .positiveColorRes(R.color.accent_material_light);
        switch (v.getId()) {
            case R.id.how_its_done_button:
                ab.title(R.string.how_its_done_title)
                        .content(getString(R.string.how_its_done_dialog_content))
                        .positiveText(R.string.got_it_text);
                ab.show();
                break;
            case R.id.everyDay_button:
                ab.title(R.string.everyday_title_text)
                        .content(R.string.everyday_content_text)
                        .positiveText(R.string.got_it_text);
                                ab.show();
                break;
            case R.id.transparency_button:
                ab.title(R.string.transparency_title_text)
                    .content(R.string.transparency_content_text)
                    .positiveText(R.string.got_it_text);
                ab.show();
                break;
            case R.id.code_management_button:
                ab.title(R.string.code_management_title_text)
                        .content(R.string.code_management_content_text)
                        .positiveText(R.string.got_it_text);
                ab.show();
                break;


        }
    }
}
