package proton.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openParts(View view) {
        switch (view.getId()){
            case R.id.btnEducation:
                startActivity(new Intent(this, Education.class));
                break;
            case R.id.btnWorkExperience:
                startActivity(new Intent(this, WorkExperience.class));
                break;
            case R.id.btnSkills:
                startActivity(new Intent(this, Skills.class));
                break;
        }
    }
}
