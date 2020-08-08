package lockdown.org.passdatademoapp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity
{
    TextView tvMessage;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_home);
        tvMessage = findViewById(R.id.tvMessage);
        String name=SaveData.name;
        tvMessage.setText("Hello, "+name);
    }
}
