package sabel.com.a11012018_zweiteactivity;
        import android.app.Activity;
        import android.app.SearchManager;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText et_eingabe;
    private Button btn_senden;
    private String eingabe;
    private Intent anzeigeActivity;
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_eingabe = findViewById(R.id.et_text);
        btn_senden = findViewById(R.id.btn_senden);



        btn_senden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eingabe = String.valueOf(et_eingabe.getText());
//                anzeigeActivity = new Intent(MainActivity.this, AnzeigeActivity.class);
//                anzeigeActivity.putExtra("id", eingabe);
//                startActivity(anzeigeActivity);
                //Uri uri = Uri.parse("http://www.google.com/#q=fish");
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,eingabe);
                startActivity(intent);

            }
        });
    }

}
